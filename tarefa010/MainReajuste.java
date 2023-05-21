package cs_exercicios;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * @author Felipe Moreira
 */
public class MainReajuste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        try {
            out.print("Digite o saldo: ");
            double valor = sc.nextDouble();
            double valorReajuste = valor += valor * 0.15;
            out.println("Saldo com reajuste: " + valorReajuste);
        } catch (Exception ex) {
            out.print("Tipo da informaçao nao eh valida, encerrando aplicaçao");
        }
    }
}
