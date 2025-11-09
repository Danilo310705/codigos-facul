import java.util.Scanner;

public class listaexercicionota1 {
    static Scanner s = new Scanner(System.in);
    public static void main (String[] args){
        int atividade;
        
        do {
            System.out.print("Digite o número do exercício que deseja executar (1 ou 2 e 0 para sair): ");
            atividade = s.nextInt();
            switch (atividade) {
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    throw new AssertionError();
            }
        }while (atividade != 0);
    }

    public static void ex1() {
        double soma = 0;
        double maior = 0;
        double menor = 100; 
        double media;
        int quantidade_precos;

        System.out.print("Quantos preços deseja informar?: ");
        quantidade_precos = s.nextInt();

        double precos[] = new double [quantidade_precos];
        

        for(int i = 0; i < precos.length ;i++){
            precos[i] = pedir_numero_double();
            soma += precos[i];
            if (maior < precos[i]) {
                maior = precos[i];
            }
            if (menor > precos[i]) {
                menor = precos[i];
            }
        }
        media = soma / precos.length;

        System.out.println("A média de preços é: " + media + "\nO maior preços é: " + maior + "\nO menor preços é: " + menor);

    }
    public static double pedir_numero_double() {
        System.out.print("informe a precos: ");
        return s.nextDouble();
    }

    public static void ex2() {
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
                if( j == 1 && notas_alunos[i][j] > 20){
                System.out.print( notas_alunos[i][j] + " Reprovado por faltas ");
                } else if ( j == 1) {
                    System.out.print( notas_alunos[i][j] + " Aprovado ");
                } else {
                    System.out.print( notas_alunos[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
