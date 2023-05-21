package cs_exercicios;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Felipe Moreira
 */
public class MainIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int anos, meses, dias;

        try {
            out.print("Digite a idade em anos: ");
            anos = sc.nextInt();

            out.print("Digite a idade em meses: ");
            meses = sc.nextInt();

            out.print("Digite a idade em dias: ");
            dias = sc.nextInt();

            out.println("Idade em dias: " + idadeEmDias(anos, meses, dias));
        } catch (Exception ex) {
            out.print("Tipo da informaçao nao eh valida, encerrando aplicaçao");
        }
    }

    private static int idadeEmDias(int anos, int meses, int dias) {
        int total = 0;
        total += anos * 365;
        total += meses * 30;
        total += dias;
        return total;
    }
}
