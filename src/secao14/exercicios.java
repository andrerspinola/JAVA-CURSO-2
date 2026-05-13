package secao14;
import java.util.Arrays;

public class exercicios {
    static void main() {

        // Exercicio 1
        int[] arrayOriginal = {1, 2, 3};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++){
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length -1 -i];
        }
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));

    }
}
