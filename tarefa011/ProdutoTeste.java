package tarefa011;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Felipe Moreira
 */
public class ProdutoTeste {

    public static void main(String[] args) {

        List<Produto> carrinho = new ArrayList<>();

        carrinho.add(new Mouse("Logitech GPRO Wireless"));
        carrinho.add(new Livro("\"Grande Sertão: Veredas\" de João Guimarães Rosa"));
        carrinho.add(new Mouse("HyperX Pulse Fire, com fio, RGB"));
        carrinho.add(new Livro("\"Dom Casmurro\" de Machado de Assis"));
        carrinho.add(new Mouse("Logitech G203, com fio, 4000DPI"));
        carrinho.add(new Livro("\"Memórias Póstumas de Brás Cubas\" de Machado de Assis"));
        carrinho.add(new Mouse("Darmoshark N3, Sensor PAW3395"));
        carrinho.add(new Livro("\"Gabriela, Cravo e Canela\" de Jorge Amado"));
        carrinho.add(new Mouse("Logitech GPROX Superlight Wireless, 60g"));
        carrinho.add(new Livro("\"O Cortiço\" de Aluísio Azevedo"));

        System.out.println("\n+--------------------------- CARRINHO ---------------------------+");
        for (Produto produto : carrinho) {
            System.out.printf("+ %61s  +\n", produto.getDescricao());
        }
        System.out.println("+----------------------------------------------------------------+\n");
    }
}
