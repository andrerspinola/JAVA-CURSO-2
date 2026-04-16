package secao12;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();


        System.out.println("Escolha uma operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado;


        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}