package secao13;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");


        while (palpite != numeroSecreto) {


            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            tentativas++;


            if (palpite < numeroSecreto) {
                System.out.println("O número é MAIOR!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é MENOR!");
            } else {
                // 5 - Mensagem de sucesso
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Tentativas: " + tentativas);
            }
        }

        scanner.close();
    }
}


