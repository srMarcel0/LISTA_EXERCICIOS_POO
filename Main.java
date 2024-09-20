public class Main {
    public static void main(String[] args) {
        // 1. Círculo
        Circulo circulo = new Circulo(5);
        System.out.println("Círculo: Área = " + circulo.calcularArea() + ", Perímetro = " + circulo.calcularPerimetro());

        // 2. Conta Bancária
        ContaBancaria conta = new ContaBancaria("12345", "João");
        conta.depositar(500);
        System.out.println("Conta Bancária: Saldo após depósito = " + conta.getSaldo());
        conta.sacar(200);
        System.out.println("Saldo após saque = " + conta.getSaldo());

        // 3. Retângulo
        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("Retângulo: Área = " + retangulo.calcularArea() + ", Perímetro = " + retangulo.calcularPerimetro());

        // 4. Aluno
        double[] notas = {8.5, 7.0, 9.0};
        Aluno aluno = new Aluno("Maria", "2023-001", notas);
        System.out.println("Aluno: Média = " + aluno.calcularMedia() + ", Situação = " + aluno.verificarSituacao());

        // 5. Funcionário
        Funcionario funcionario = new Funcionario("Carlos", 3000, "Desenvolvedor");
        System.out.println("Funcionário: Salário líquido = " + funcionario.calcularSalarioLiquido());

        // 6. Produto
        Produto produto = new Produto("Produto A", 10.0, 100);
        System.out.println("Produto: Valor total em estoque = " + produto.calcularValorTotalEstoque());
        System.out.println("Produto disponível? " + produto.estaDisponivel());

        // 7. Triângulo
        Triangulo triangulo = new Triangulo(3, 4, 5);
        if (triangulo.ehValido()) {
            System.out.println("Triângulo: Área = " + triangulo.calcularArea());
        } else {
            System.out.println("Triângulo inválido.");
        }

        // 8. Carro
        Carro carro = new Carro("Toyota", "Corolla");
        carro.acelerar(50);
        System.out.println("Carro: Velocidade atual = " + carro.getVelocidadeAtual());
        carro.frear(20);
        System.out.println("Velocidade após frear = " + carro.getVelocidadeAtual());

        // 9. Paciente
        Paciente paciente = new Paciente("Ana", 30);
        paciente.adicionarConsulta("Consulta 1");
        paciente.adicionarConsulta("Consulta 2");
        System.out.println("Histórico de consultas:");
        paciente.exibirConsultas();

        // 10. Livro
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 300);
        livro.emprestar();
        System.out.println("Livro disponível? " + livro.isDisponivel());
        livro.devolver();
        System.out.println("Livro disponível após devolução? " + livro.isDisponivel());

        // 11. Pessoa
        Pessoa pessoa = new Pessoa("Lucas", 28, "Engenheiro");
        pessoa.exibirInformacoes();
        System.out.println("Anos bissextos na idade: " + pessoa.calcularIdadeBissexto());

        // 12. Banco
        Banco banco = new Banco();
        banco.cadastrarCliente("12345", "João");
        banco.realizarDeposito("12345", 300);
        banco.realizarSaque("12345", 100);

        // 13. Loja Virtual
        LojaVirtual loja = new LojaVirtual();
        loja.cadastrarProduto("Produto A", 20.0, 10);
        loja.cadastrarProduto("Produto B", 15.0, 5);
        System.out.println("Valor total compra: " + loja.calcularValorTotalCompra(loja.getProdutos()));

        // 14. Agenda
        Agenda agenda = new Agenda();
        agenda.adicionarContato("Carlos", "1234-5678");
        agenda.adicionarContato("Maria", "8765-4321");
        agenda.buscarContato("Carlos");

        // 15. Máquina de Vendas
        MaquinaDeVendas maquina = new MaquinaDeVendas();
        maquina.cadastrarProduto("Refrigerante", 3.0, 10);
        maquina.selecionarProduto("Refrigerante");
        maquina.exibirEstoque();

        // 16. Jogo de Cartas
        JogoCartas jogo = new JogoCartas(4);
        jogo.embaralhar();
        jogo.distribuirCartas(5);
        System.out.println("Cartas do jogador 1: " + jogo.getCartasJogador(0));

        // 17. Rede Social
        RedeSocial redeSocial = new RedeSocial();
        redeSocial.adicionarUsuario("João");
        redeSocial.adicionarUsuario("Maria");

        // 18. Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro("1984", "George Orwell", 328);
        biblioteca.emprestarLivro("1984");
        biblioteca.verificarDisponibilidade("1984");

        // 19. Calendário
        Calendario calendario = new Calendario();
        calendario.exibirCalendario("Janeiro");
        System.out.println("01-01 é feriado? " + calendario.ehFeriado("01-01"));

        // 20. Jogo de Adivinhação
        JogoAdivinhacao jogoAdivinhacao = new JogoAdivinhacao();
        jogoAdivinhacao.iniciar();
    }
}
