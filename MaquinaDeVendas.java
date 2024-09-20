import java.util.ArrayList;
import java.util.List;

class ProdutoMaquina {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoMaquina(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public boolean comprar() {
        if (quantidade > 0) {
            quantidade--;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class MaquinaDeVendas {
    private List<ProdutoMaquina> produtos;

    public MaquinaDeVendas() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        produtos.add(new ProdutoMaquina(nome, preco, quantidade));
    }

    public boolean selecionarProduto(String nome) {
        for (ProdutoMaquina produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto.comprar();
            }
        }
        return false;
    }

    public void exibirEstoque() {
        for (ProdutoMaquina produto : produtos) {
            System.out.println(produto.getNome() + " - " + produto.getQuantidade() + " disponível.");
        }
    }
}
