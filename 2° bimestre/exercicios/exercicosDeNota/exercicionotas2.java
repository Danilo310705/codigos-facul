import java.util.Scanner;

public class exercicionotas2 {
    static Scanner s = new Scanner(System.in);
    public static void main (String[] args){
        //Declare uma Matriz 5 linhas por 2 colunas de inteiro. A primeira coluna deve ser armazenado o RA. 
        //Na segunda, a quantidade de faltas. Preencha a matriz e depois exiba aluno por aluno, o RA, a quantidade de faltas e se ele está aprovado ou reprovado por faltas. 
        //Considere a seguinte regra: O aluno que tiver mais de 20 faltas, estará "reprovado por faltas". 
        //O aluno que tiver 20 ou menos, esta aprovado.

        int notas_alunos[][] = new int[5][2];
        
        //preenchendo matriz
        for (int i = 0; i < notas_alunos.length; i++) {
            for (int j = 0; j < notas_alunos[i].length; j++) {
                System.out.print("["+ i + "]" + "[" + j + "]: ");
                notas_alunos[i][j] = s.nextInt();
            }
            
        }

        // imprimindo matriz
        for (int i = 0; i < notas_alunos.length; i++) {
            for (int j = 0; j < notas_alunos[i].length; j++) {
                if( notas_alunos[i][1] <= 20){
                System.out.print( notas_alunos[i][j] + " Reprovado por faltas ");
                } else {
                    System.out.print( notas_alunos[i][j] + "");
                }
            }
            System.out.println();
        }

    }
    public static double pedir_numero_double() {
        System.out.print("informe a precos: ");
        return s.nextDouble();
    }
}
