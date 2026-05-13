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

        // Exercicio 2

        int[] arrayInteiros = {1, 2, 2, 3, 4, 4, 4, 5};
        int arrayFrequencia = arrayInteiros[0];

        int maxContagem = 1;

        for(int i = 0; i < arrayInteiros.length; i++){
            int contagem = 0;
            for(int j = 0; j < arrayInteiros.length; j++){
                if(arrayInteiros[j] == arrayInteiros[i]){
                    contagem++;
                }
            }
            if(contagem > maxContagem){
                maxContagem = contagem;
                arrayFrequencia = arrayInteiros[i];
            }
        }
        System.out.println("O mais frequente é: " + arrayFrequencia);

    }
}
