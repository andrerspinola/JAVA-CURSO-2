package secao14;

// Array => subs. a classe Array
import java.util.Arrays;
import java.util.ArrayList;


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
        // 4 - loops com if
        // filtar e somar numeros pares

        int somaPares = 0;
        for(int numero : numeros){
            if(numero % 2 == 0){
                somaPares += numero;
            }
        }
        System.out.println("Soma pares: " + somaPares);

        // Exibir valores maiores que um determinado valor
        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > limite){
                System.out.println("numero maior encontrado: " + nums[i]);
            }
        }

        String[] linguagens = {"Java", "C", "Python", "PHP"};
        String linguagemAlvo = "Python";

        for(String linguagem : linguagens){
            if(linguagemAlvo == linguagem){
                System.out.println("Linguagem encontrada! Parando o loop ");
                break;
            }else{
                System.out.println("Linguagem ainda não encontrada! ");
            }
        }

        // 5 - atualizar valores
        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }
        System.out.println(numeros[1]);

        for(int numero : numeros){
            System.out.println("Numero dobrado: " + numero);
        }
        numeros[5] = 1;

        System.out.println(numeros[5]);

        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equals("Maçã")){

                frutas[i] = "Abacate";

            }
        }
        System.out.println(frutas[0]);

        // 6 - método toString

        // Classes no java,que vão ter metodos utilitários, o Arrays é uma delas
        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);

        String dadosFrutas = Arrays.toString(frutas);
        System.out.println(dadosFrutas);

        int[] teste = new int [3];
        System.out.println(Arrays.toString(teste));


        // 7 - adicionando novos itens a arrays

        //ex1: criando um novo array maior e copiando os els.

        int[] novoArray = new int[numeros.length + 1];
        for(int i = 0; i < numeros.length; i ++){
            novoArray[i] = numeros[i];
        }
        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));

        // ex2: utilizando o arraycopy para copiar os elementos.

        String[] novoFrutas = new String[frutas.length + 1];
        System.arraycopy(frutas, 0, novoFrutas,0,frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Jaca";
        System.out.println(Arrays.toString(novoFrutas));

        //ex 3: usando ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maça", "Banana","Laranja"));
        System.out.println(listaFrutas);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);


        // 8 - reference trap


    }

}
