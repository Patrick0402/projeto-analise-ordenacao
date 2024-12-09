public class MergeSort implements Algoritmo {

    @Override
    public void sort(int[] array) {
        if (array.length < 2) {
            return; // Caso base: array com 0 ou 1 elementos já está ordenado
        }

        // Dividir o array em duas metades
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid); // Copiar a primeira metade
        System.arraycopy(array, mid, right, 0, array.length - mid); // Copiar a segunda metade

        // Recursivamente ordenar as duas metades
        sort(left);
        sort(right);

        // Mesclar as duas metades ordenadas
        merge(array, left, right);
    }

    // Método para mesclar duas metades ordenadas
    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Mesclar os dois arrays enquanto houver elementos em ambos
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Se houver elementos restantes em left, adicionar ao array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Se houver elementos restantes em right, adicionar ao array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    @Override
    public String getNome() {
        return "MergeSort";
    }
}
