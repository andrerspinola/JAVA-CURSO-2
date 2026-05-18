package secao15_jogoDaForca;

import java.util.Scanner;
import java.util.Arrays;

public class jogoDaForca {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "Java";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for(int i = 0; i < palavraOculta.length; i++){
            palavraOculta[i] = '_';
        }
        System.out.println(Arrays.toString(palavraOculta));

        int tentativas = 10;
        boolean venceu = false;

        while(tentativas > 0){

            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite uma letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            System.out.println(letra);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i ++){
                if(palavraSecreta.charAt(i) == letra){
                    palavraOculta[i] = letra;
                    acertou = true;

                }

            }

            if(!acertou){
                System.out.println("Letra incorreta. ");
            }else{
                System.out.println("Letra correta.");
            }

            System.out.println("TESTE: " + String.valueOf(palavraOculta));

            if(String.valueOf(palavraOculta).equals(palavraSecreta)){
                venceu = true;
                break;
            }

            if(venceu){
                System.out.println("Parabéns, acertou a palavra. Acertou em " + tentativas + " tentativas.");
            }else{
                System.out.println("Você perdeu! ");

            }
            System.out.println("A palavra era: " + palavraSecreta);
            scanner.close();
            tentativas --;

        }


    }
}
