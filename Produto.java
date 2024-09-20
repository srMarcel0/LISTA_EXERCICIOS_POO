class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    public boolean estaDisponivel() {
        return quantidade > 0;
    }
}
