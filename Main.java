import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array com os nomes dos arquivos que contém os arrays de teste
        String[] arquivos = {
                "data/array100.txt",
                "data/array1000.txt",
                "data/array10000.txt",
                "data/array100000.txt"
        };

        // Criar instâncias dos algoritmos
        Algoritmo[] algoritmos = {
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),
                new MergeSort(),
                new QuickSort(),
                new ArraysSort() // Esse algoritmo é nativo da linguagem java
        };

        // Arquivo de saída
        String caminhoSaida = "resultados.txt";

        // Testar todos os algoritmos para todos os arquivos e salvar o resultado
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoSaida))) {
            // Escrever cabeçalho no arquivo de saída
            writer.write("Resultado dos Testes de Desempenho dos Algoritmos de Ordenação\n");
            writer.write("----------------------------------------------------------\n\n");

            for (String arquivo : arquivos) {
                writer.write("Iniciando testes para o arquivo: " + arquivo + "\n");

                try {
                    // Ler o array do arquivo
                    int[] dados = lerArquivo(arquivo);

                    // Calcular o range de valores do array
                    int min = Arrays.stream(dados).min().orElseThrow();
                    int max = Arrays.stream(dados).max().orElseThrow();
                    writer.write("Range de valores: " + min + " a " + max + "\n\n");

                    // Executar cada algoritmo e medir o tempo
                    for (Algoritmo algoritmo : algoritmos) {
                        int[] copia = dados.clone(); // Cópia dos dados para garantir que cada algoritmo trabalhe com os
                                                     // dados originais
                        long inicio = System.nanoTime();
                        algoritmo.sort(copia); // Executar a ordenação
                        long tempo = System.nanoTime() - inicio;

                        // Escrever resultados no arquivo
                        writer.write("Algoritmo: " + algoritmo.getNome() + "\n");
                        writer.write("Tamanho do array: " + copia.length + " elementos\n");
                        writer.write("Tempo de execução: " + tempo + " ns\n\n");
                    }
                } catch (IOException e) {
                    writer.write("Erro ao ler o arquivo " + arquivo + ": " + e.getMessage() + "\n\n");
                }
            }

            writer.write("Testes concluídos.\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de resultados: " + e.getMessage());
        }
    }

    // Método para ler o array do arquivo
    private static int[] lerArquivo(String caminhoArquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = br.readLine();

            // Dividir os números separados por vírgula e converter para um array de
            // inteiros
            String[] numeros = linha.split(",");
            return Arrays.stream(numeros).mapToInt(Integer::parseInt).toArray();
        }
    }
}
