package tarefa011;

public class Mouse extends Produto {

    private String tipo;

    public Mouse(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return "Mouse: " + this.tipo;
    }
}
