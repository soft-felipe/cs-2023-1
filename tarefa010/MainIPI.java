package cs_exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MainIPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        try {
            out.print("Porcentagem IPI: ");
            double ipi = sc.nextDouble();

            out.print("Codigo peça 1: ");
            String cd_peca1 = sc.nextLine();
            sc.nextLine();

            out.print("Valor unitario peça 1: ");
            double vlr_peca1 = sc.nextDouble();

            out.print("Quantidade peças 1: ");
            int qtd_peca1 = sc.nextInt();

            out.print("Codigo peça 2: ");
            String cd_peca2 = sc.nextLine();
            sc.nextLine();

            out.print("Valor unitario peça 2: ");
            double vlr_peca2 = sc.nextDouble();

            out.print("Quantidade peças 2: ");
            int qtd_peca2 = sc.nextInt();

            double valor_final = (vlr_peca1 * qtd_peca1 + vlr_peca2 * qtd_peca2) * (ipi / 100.0 + 1);
            DecimalFormat dc = new DecimalFormat("#.##");
            out.println("Valor total a ser pago: " + dc.format(valor_final));

        } catch (Exception ex) {
            out.print("Tipo da informaçao nao eh valida, encerrando aplicaçao");
        }
    }
}
