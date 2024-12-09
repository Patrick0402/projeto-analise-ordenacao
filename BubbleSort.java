public class BubbleSort implements Algoritmo {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Trocar elementos adjacentes
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break; // Se nenhuma troca foi feita, o array está ordenado
        }
    }

    @Override
    public String getNome() {
        return "BubbleSort";
    }
}
