package tarefa011;

public class Livro extends Produto {

    private String autor;

    public Livro(String autor) {
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + this.autor;
    }
}
