package secao14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArrays {
    static void main() {

        // 1 - Ordenação

        // Ordenação arrays de inteiros
        int[] numbers = {5, 6, 1, 4, 2, 22, 1};

        // Modifica o array original
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        // Ordenacao com comparator
        String [] names = {"João" , "Bob" , "Pedro", "Marcos"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        // Comparator.reverseOrder() to maior para o menor ou de Z até A
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

        // Ordenação de Matriz

        int[][] matriz ={
                {4,5,1},
                {3,8,9},
                {2,3,1}

        };

        // Ordenação de linhas, por um valor de Coluna
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

        for(int[] linha : matriz){
            System.out.println(Arrays.toString(linha));
        }

        // Imprimir  matrix, sem foreach
        System.out.println(Arrays.deepToString(matriz));

        // 2 - Manipulação avançada
        int[] original = {1,2,2,3};

        int[] copia = Arrays.copyOf(original, 2);
        System.out.println(Arrays.toString(copia));

        // fill - preenchimento
        int[] numeros = new int[5];
        System.out.println(Arrays.toString(numeros));
        Arrays.fill(numeros,5);
        System.out.println(Arrays.toString(numeros));

        // transformação de arrays para stream
        int[] values = {1,2,3,4,5};

        // fazer uma soma dos elementos.

        int sum = Arrays.stream(values).sum();
        System.out.println(sum);
    }
}
