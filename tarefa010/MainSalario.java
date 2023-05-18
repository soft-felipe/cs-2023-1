package cs_exercicios;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MainSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        try {
            out.print("Digite o salario: ");
            double salario = sc.nextDouble();

            double qtd = salario / 1045.0;
            out.printf("A quantidade eh de %.2f salarios\n", qtd);

        } catch (Exception ex) {
            out.print("Tipo da informaçao nao eh valida, encerrando aplicaçao");
        }
    }
}
