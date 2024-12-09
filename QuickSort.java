public class QuickSort implements Algoritmo {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Método recursivo para ordenar o array
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Particiona o array e retorna o índice do pivô
            int pivotIndex = partition(array, low, high);

            // Recursivamente ordenar as duas metades
            quickSort(array, low, pivotIndex - 1);  // Ordena a parte esquerda
            quickSort(array, pivotIndex + 1, high); // Ordena a parte direita
        }
    }

    // Método para particionar o array e escolher um pivô
    private int partition(int[] array, int low, int high) {
        // Escolher o último elemento como pivô
        int pivot = array[high];
        int i = (low - 1); // índice do menor elemento

        // Reorganiza o array colocando todos os elementos menores que o pivô à esquerda e os maiores à direita
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Troca array[i] e array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Coloca o pivô no seu lugar correto
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Retorna o índice do pivô
    }

    @Override
    public String getNome() {
        return "QuickSort";
    }
}
