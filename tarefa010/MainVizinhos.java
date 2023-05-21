package cs_exercicios;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MainVizinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        try {
            out.print("Digite o numero: ");
            int numero = sc.nextInt();
            out.printf("Antecessor: %d\n", (numero - 1));
            out.printf("Sucessor: %d\n", (numero + 1));
        } catch (Exception ex) {
            out.print("Tipo da informaçao nao eh valida, encerrando aplicaçao");
        }
    }
}
