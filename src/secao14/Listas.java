package secao14;

// Array => subs. a classe Array

public class Listas {
    static void main() {

        // 1 - sintaxe

        int[] numeros = {1,2,3,4,5,6,7,8};

        // {ELEMENTO 1,ELEMENTO 2, ELEMENTO 3,ELEMENTO 4,ELEMENTO 5...}

        System.out.println("Acessando primeiro elemento: " + numeros[0]);

        // Tamanho fixo, só vazio
        String[] frutas = new String[3];

        // Posso inserir nos indices 0,1 e 2 = elementos

        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        System.out.println(frutas);
        System.out.println(frutas[1]);

        double[] precos = {1.99, 2.45, 4.97};

        // caso queira alterar um item
        precos[2] = 5;

        System.out.println(precos[2]);

        // 2 - Loops em arrays

        // somar todos os elementos de um array
        // acessar os elementos e condensar a soma deles em uma var.

        int soma = 0;

        // length = quantidade de elementos de um array

        for(int i = 0; i < numeros.length; i ++){

            // i valendo 0, depois 1, depois 2 ...
            soma += numeros[i];

        }
        System.out.println("Soma dos elementos: " + soma);

        // for each
        // Nomear o item do Array
        // Pessoas e a nomeação será pessoa
        // frutas será fruta
        for(String fruta : frutas){
            System.out.println("A fruta da vez " + fruta);
        }

        // encontrar o maior valor de um array

        int[] valores = {10,25,8,22,1};
        int maiorValor = valores[0];

        int j = 0;
        while(j < valores.length){
            if(valores[j] > maiorValor){
                maiorValor = valores[j];
            }
            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);


        // 3 - for each
        for(int numero : numeros){
            System.out.println("O número é: " + numero);
        }

        // Concatenar elementos de um array
        String[] palavras = {"Java", "é", "bom"};

        String frase = "";

        for(String palavra : palavras){
            frase += palavra + " ";
        }
        System.out.println(frase);

        // verificar se valor esta presente em array
        char[] letras = {'a','e','i','o','u'};
        char letraProcurada = 'i';
        for(char letra : letras){
            if (letra == letraProcurada){
                System.out.println("Encontramos a letra " + letra);
                break;

            }

        }


    }
}
