import java.util.Random;
import java.util.Scanner;

class JogoAdivinhacao {
    private int numeroAleatorio;
    private Scanner scanner;

    public JogoAdivinhacao() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1; // Números de 1 a 100
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int palpite;
        do {
            System.out.print("Adivinhe o número (1 a 100): ");
            palpite = scanner.nextInt();
            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto!");
            }
        } while (palpite != numeroAleatorio);
        System.out.println("Parabéns! Você adivinhou o número.");
    }
}
