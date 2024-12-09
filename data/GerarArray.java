package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GerarArray {
    public static void main(String[] args) {
        // Tamanhos dos arrays a serem gerados
        int[] tamanhos = {100, 1000, 10000, 100000};
        Random random = new Random();

        // Loop para gerar os arrays com diferentes tamanhos
        for (int tamanho : tamanhos) {
            String caminhoArquivo = "data/array" + tamanho + ".txt";
            
            // Definir o range baseado no tamanho do array
            int range = tamanho;  // O range será igual ao tamanho do array
            
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
                // Gerar o array de números aleatórios e escrever no arquivo
                for (int i = 0; i < tamanho; i++) {
                    int numeroAleatorio = random.nextInt(range); // Números entre 0 e 'range' (tamanho)
                    bw.write(numeroAleatorio + (i < tamanho - 1 ? "," : "")); // Adiciona vírgulas, exceto no final
                }
                System.out.println("Arquivo gerado com sucesso em: " + caminhoArquivo);
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }
    }
}
