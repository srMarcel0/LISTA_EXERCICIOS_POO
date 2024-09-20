import java.util.ArrayList;
import java.util.List;

class LojaVirtual {
    private List<Produto> produtos;

    public LojaVirtual() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, preco, quantidade));
    }

    public double calcularValorTotalCompra(List<Produto> carrinho) {
        double total = 0;
        for (Produto produto : carrinho) {
            total += produto.calcularValorTotalEstoque();
        }
        return total;
    }

    public void aplicarDesconto(List<Produto> carrinho, double percentual) {
        for (Produto produto : carrinho) {
            produto.aplicarDesconto(percentual);
        }
    }
}
