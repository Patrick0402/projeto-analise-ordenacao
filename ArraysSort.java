import java.util.Arrays; // Importando a classe Arrays

public class ArraysSort implements Algoritmo {

    @Override
    public void sort(int[] array) {
        Arrays.sort(array); // Chama o método sort nativo do Java
    }

    @Override
    public String getNome() {
        return "Arrays.sort";
    }
}
