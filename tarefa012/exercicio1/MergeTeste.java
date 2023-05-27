package tarefa012.exercicio1;

import java.util.Random;

public class MergeTeste {

    public static void main(String[] args) {

        MergeSortIterativo msi = new MergeSortIterativo();
        MergeSortRecursivo msr = new MergeSortRecursivo();

        int[] v100 = gerarVetor(100);
        int[] v1000 = gerarVetor(1000);
        int[] v10000 = gerarVetor(10000);

        int[] copia100 = v100;
        int[] copia1000 = v1000;
        int[] copia10000 = v10000;

        resultadosTam100(msi, msr, v100);
        resultadosTam1000(msi, msr, v1000);
        resultadosTam10000(msi, msr, v10000);
    }

    private static void resultadosTam100(MergeSortIterativo msi, MergeSortRecursivo msr, int[] v100) {
        System.out.println("----- Tamanho 100 -----");
        long inicio = System.currentTimeMillis();
        msi.mergeSort(100, v100);
        long fim = System.currentTimeMillis();
        long res = fim - inicio;
        System.out.println("Iterativo (ms): " + res);
        inicio = System.currentTimeMillis();
        msr.mergeSortRecursivo(0, 100, v100);
        fim = System.currentTimeMillis();
        res = fim - inicio;
        System.out.println("Recursivo (ms): " + res);
        System.out.println("-----------------------\n\n");
    }

    private static void resultadosTam1000(MergeSortIterativo msi, MergeSortRecursivo msr, int[] v1000) {
        System.out.println("----- Tamanho 1000 -----");
        long inicio = System.currentTimeMillis();
        msi.mergeSort(1000, v1000);
        long fim = System.currentTimeMillis();
        long res = fim - inicio;
        System.out.println("Iterativo (ms): " + res);

        inicio = System.currentTimeMillis();
        msr.mergeSortRecursivo(0, 1000, v1000);
        fim = System.currentTimeMillis();
        res = fim - inicio;
        System.out.println("Recursivo (ms): " + res);
        System.out.println("------------------------\n\n");
    }

    private static void resultadosTam10000(MergeSortIterativo msi, MergeSortRecursivo msr, int[] v10000) {
        System.out.println("----- Tamanho 10000 -----");
        long inicio = System.currentTimeMillis();
        msi.mergeSort(10000, v10000);
        long fim = System.currentTimeMillis();
        long res = fim - inicio;
        System.out.println("Iterativo (ms): " + res);

        inicio = System.currentTimeMillis();
        msr.mergeSortRecursivo(0, 10000, v10000);
        fim = System.currentTimeMillis();
        res = fim - inicio;
        System.out.println("Recursivo (ms): " + res);
        System.out.println("-------------------------\n\n");
    }

    public static int[] gerarVetor(int size) {
        int[] v = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            v[i] = random.nextInt(100);
        }

        return v;
    }
}
