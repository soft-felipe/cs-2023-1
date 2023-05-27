package tarefa012.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contato> agenda = new ArrayList<>();

    public void adicionarContato(Contato novoContato) {
        agenda.add(novoContato);
    }

    public Contato buscarContato(String encontrar) {
        for (Contato c : agenda) {
            if (c.getNome().equalsIgnoreCase(encontrar) || c.getEmail().equalsIgnoreCase(encontrar)) {
                return c;
            }
        }
        System.out.println("Contato nao encontrado na agenda!");
        return null;
    }

    public void excluirContato(String nomeExcluir) {
        Contato seraExcluido = buscarContato(nomeExcluir);
        agenda.remove(seraExcluido);
    }

    public void listarContatos() {
        for (Contato c : agenda) {
            System.out.println("Nome: " + c.getNome() + ", Email: " + c.getEmail());
        }
    }
}
