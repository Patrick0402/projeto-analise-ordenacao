# Projeto de Análise de Algoritmos de Ordenação

Este projeto realiza uma análise de desempenho de diferentes algoritmos de ordenação. O foco é comparar algoritmos com complexidade **O(N²)** (BubbleSort, InsertionSort, SelectionSort) e com complexidade **O(N log N)** (MergeSort, QuickSort, Arrays.sort). Os algoritmos são testados em arrays de diferentes tamanhos (100, 1.000, 10.000, 100.000 elementos), e os tempos de execução são registrados em um arquivo de resultados. O intervalo de valores gerados em cada array é correspondente ao tamanho do array.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

```
projeto-analise-ordenacao/
├── data/
│   ├── array100.txt      // Arquivo de dados contendo 100 números para os algoritmos
│   ├── array1000.txt     // Arquivo de dados contendo 1.000 números para os algoritmos
│   ├── array10000.txt    // Arquivo de dados contendo 10.000 números para os algoritmos
│   ├── array100000.txt   // Arquivo de dados contendo 100.000 números para os algoritmos
│   └── GerarArray.java   // Arquivo para gerar os arrays de números
├── Algoritmo.java        // Interface com os métodos sort e getNome
├── BubbleSort.java       // Implementação do algoritmo BubbleSort
├── InsertionSort.java    // Implementação do algoritmo InsertionSort
├── SelectionSort.java    // Implementação do algoritmo SelectionSort
├── MergeSort.java        // Implementação do algoritmo MergeSort
├── QuickSort.java        // Implementação do algoritmo QuickSort
├── ArraysSort.java       // Implementação do algoritmo Arrays.sort (Nativo da linguagem java)
├── resultados.txt        // Arquivo que traz o output da execução com o resultado dos testes
└── Main.java             // Arquivo principal para testar a execução e desempenho dos algoritmos
```

## Como Funciona

O projeto testa diferentes algoritmos de ordenação e grava o tempo de execução de cada um em um arquivo de resultados. Os testes são realizados em arrays com os seguintes tamanhos:

- **array100.txt**: 100 números aleatórios
- **array1000.txt**: 1.000 números aleatórios
- **array10000.txt**: 10.000 números aleatórios
- **array100000.txt**: 100.000 números aleatórios

O arquivo `Main.java` é responsável por:

1. Ler os dados dos arquivos presentes em `data/` (os arrays).
2. Executar cada algoritmo de ordenação nas diferentes quantidades de dados.
3. Medir o tempo de execução de cada algoritmo utilizando o `System.nanoTime()`.
4. Gravar os resultados em um arquivo chamado `resultados.txt`.

## Algoritmos Implementados

- **BubbleSort**: Algoritmo de ordenação por comparação, que repetidamente percorre o array e troca os elementos adjacentes fora de ordem.
- **InsertionSort**: Algoritmo de ordenação que constrói a sequência final de elementos ordenados um de cada vez.
- **SelectionSort**: Algoritmo que divide a sequência em uma parte ordenada e uma parte não ordenada, selecionando o menor (ou maior) elemento da parte não ordenada e colocando-o na parte ordenada.
- **MergeSort**: Algoritmo de ordenação baseado no paradigma divide e conquista. Ele divide o array em duas metades, ordena recursivamente cada metade e depois as combina.
- **QuickSort**: Algoritmo de ordenação que também usa o paradigma divide e conquista, mas escolhe um elemento pivô para particionar o array em subarrays e ordená-los.
- **Arrays.sort**: O método nativo de ordenação do Java, que utiliza uma versão otimizada de QuickSort (para arrays de objetos) e MergeSort (para arrays de primitivos).

## Como Executar

### Passo 1: Clonar o Repositório

Clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/Patrick0402/projeto-analise-ordenacao.git
```

### Passo 2: Compilar o Projeto

Abra um terminal na pasta do projeto e compile todos os arquivos Java, incluindo o `GerarArray.java` que está dentro da pasta `data/`, utilizando o `javac`:

```bash
cd projeto-analise-ordenacao/
javac *.java data/*.java
```

Esse comando irá compilar todos os arquivos `.java` tanto na pasta principal do projeto quanto na pasta `data/`, garantindo que o `GerarArray.java` seja incluído na compilação.

### Passo 3: Gerar os Arquivos de Dados

O arquivo `GerarArray.java` é responsável por gerar os arquivos com os arrays de números. Para gerar os arrays de teste, execute o seguinte comando:

```bash
java data.GerarArray
```

Isso irá gerar os arquivos `array100.txt`, `array1000.txt`, `array10000.txt`, `array100000.txt` na pasta `data/`.

### Passo 4: Executar os Testes

Para realizar os testes de desempenho, execute o arquivo `Main.java`:

```bash
java Main
```

Os resultados serão gravados no arquivo `resultados.txt`, localizado na pasta principal do projeto.

### Passo 5: Ver os Resultados

Após a execução, abra o arquivo `resultados.txt` para visualizar os tempos de execução de cada algoritmo para os diferentes tamanhos de array.

## Formato do Arquivo de Resultados

O arquivo `resultados.txt` terá a seguinte estrutura:

```
Resultado dos Testes de Desempenho dos Algoritmos de Ordenação
----------------------------------------------------------

Iniciando testes para o arquivo: data/array100.txt
Algoritmo: BubbleSort
Tamanho do array: 100 elementos
Tempo de execução: 500000 ns

Algoritmo: InsertionSort
Tamanho do array: 100 elementos
Tempo de execução: 450000 ns

...

Testes concluídos.
```

Cada algoritmo será testado com diferentes tamanhos de array, e os tempos de execução serão gravados em nanosegundos.

## Conclusão

Este projeto permite realizar uma análise comparativa entre diversos algoritmos de ordenação, proporcionando uma visão clara sobre as diferenças de desempenho dependendo do tamanho dos dados e da complexidade dos algoritmos.