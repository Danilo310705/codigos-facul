import java.util.Scanner;

class exercicio1{

    public static void main(String[] args){

        int notaFinal;
        try(Scanner s = new Scanner(System.in)){

            System.out.println("Informe a sua nota final.");
            System.out.print("Nota: ");
            notaFinal = s.nextInt();
            
            if(notaFinal >= 6){
                System.out.println("Parabéns, você foi aprovado!");
            } if (notaFinal < 6 && notaFinal >= 4){
                System.out.println("Você está de recuperação.");
            } else{
                System.out.println("Você foi reprovado.");
            }
            s.close();
        }
    }
}
