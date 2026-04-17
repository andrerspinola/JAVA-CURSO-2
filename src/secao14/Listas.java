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


    }
}
