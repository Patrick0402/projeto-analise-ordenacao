public class SelectionSort implements Algoritmo {

    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Percorrer todos os elementos do array
        for (int i = 0; i < n - 1; i++) {
            // Encontrar o menor elemento no subarray não ordenado
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }

            // Trocar o menor elemento encontrado com o elemento da posição i
            if (menorIndice != i) {
                int temp = array[i];
                array[i] = array[menorIndice];
                array[menorIndice] = temp;
            }
        }
    }

    @Override
    public String getNome() {
        return "SelectionSort";
    }
}
