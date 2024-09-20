import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void cadastrarCliente(String numeroConta, String titular) {
        contas.add(new ContaBancaria(numeroConta, titular));
    }

    public void realizarDeposito(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                conta.depositar(valor);
                break;
            }
        }
    }

    public void realizarSaque(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                conta.sacar(valor);
                break;
            }
        }
    }
}

