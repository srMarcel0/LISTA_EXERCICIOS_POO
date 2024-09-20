import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Carta {
    private String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}

class JogoCartas {
    private List<Carta> baralho;
    private List<List<Carta>> jogadores;

    public JogoCartas(int numJogadores) {
        baralho = new ArrayList<>();
        jogadores = new ArrayList<>();
        String[] naipes = {"Copas", "Ouros", "Espadas", "Paus"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "Ás"};

        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.add(new Carta(naipe, valor));
            }
        }

        for (int i = 0; i < numJogadores; i++) {
            jogadores.add(new ArrayList<>());
        }
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    public void distribuirCartas(int numCartas) {
        for (int i = 0; i < numCartas; i++) {
            for (List<Carta> jogador : jogadores) {
                if (!baralho.isEmpty()) {
                    jogador.add(baralho.remove(0));
                }
            }
        }
    }

    public List<Carta> getCartasJogador(int indice) {
        return jogadores.get(indice);
    }
}
