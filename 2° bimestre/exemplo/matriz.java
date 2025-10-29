import java.util.Scanner;

class matriz {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        exemplo_matriz();
    }
    public static void exemplo_matriz() {

        

        double alturas_alunos[][] = new double[2][3];
        //preenchendo matriz
        
        for (int i = 0; i < alturas_alunos.length; i++) {
            for (int j = 0; j < alturas_alunos[i].length; j++) {
                System.out.print("["+ i + "]" + "[" + j + "]: ");
                alturas_alunos[i][j] = s.nextDouble();
            }
            
        }

        // imprimindo matriz
        for (int i = 0; i < alturas_alunos.length; i++) {
            for (int j = 0; j < alturas_alunos[i].length; j++) {
                System.out.print("["+ i + "]" + "[" + j + "]" + alturas_alunos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
