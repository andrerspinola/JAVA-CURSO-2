package secao12;

public class LabelsLoops {
    static void main() {

        // 8 - Loops com rótulos
        // rotulos externos e internos

        externo:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 1 && j == 1){
                    break externo;
                }

                System.out.println("i" + i + " , j " + j);
            }
        }



    }
}
