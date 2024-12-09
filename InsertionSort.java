public class InsertionSort implements Algoritmo {

    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int chave = array[i];
            int j = i - 1;

            // Move os elementos de array[0..i-1], que são maiores que a chave,
            // uma posição à frente de sua posição atual
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = chave;
        }
    }

    @Override
    public String getNome() {
        return "InsertionSort";
    }
}
