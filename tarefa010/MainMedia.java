package cs_exercicios;

/**
 * @author Felipe Moreira
 */
public class MainMedia {
    public static void main(String[] args) {
        double media1 = (7.0 + 8.0 + 9.0) / 3.0;
        double media2 = (4.0 + 5.0 + 6.0) / 3.0;
        System.out.println("Media aritmética dos números 8, 9 e 7: " + media1);
        System.out.println("Media aritmética dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas medias: " + (media1 + media2));
        System.out.println("Media das duas medias: " + (media1 + media2) / 2.0);
    }
}
