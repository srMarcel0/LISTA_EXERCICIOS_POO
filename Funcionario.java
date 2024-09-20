class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido() {
        double impostos = 0.1 * salario; // 10% de imposto
        return salario - impostos;
    }
}
