class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void acelerar(double aumento) {
        velocidadeAtual += aumento;
    }

    public void frear(double reducao) {
        velocidadeAtual = Math.max(0, velocidadeAtual - reducao);
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

