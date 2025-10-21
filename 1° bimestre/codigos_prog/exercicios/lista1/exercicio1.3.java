import java.util.Scanner;

class exercicio3 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        try(Scanner s = new Scanner(System.in)){ 

            System.out.println("Informe os valores inteiros para :");
            System.out.print("num1: ");
            num1 = s.nextInt();

            System.out.print("num2: ");
            num2 = s.nextInt();

            soma = num1 + num2;
            subtracao = num1 - num2;
            multiplicacao = num1 * num2;
            divisao = num1 / num2;

            System.out.println( "\nnumero 1 = " + num1 + " numero 2 = " +num2 + "\n soma: " + soma + "\n subtracao: " + subtracao + "\n multiplicacao: " + multiplicacao + "\n divisao: " + divisao);
        }
    }
}
