import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nome;
    private int idade;
    private List<String> historicoConsultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
    }

    public void exibirConsultas() {
        for (String consulta : historicoConsultas) {
            System.out.println(consulta);
        }
    }
}
