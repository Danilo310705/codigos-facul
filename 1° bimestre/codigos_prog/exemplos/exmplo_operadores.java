import java.util.Scanner;

class exmplo_operadores {
    
    public static void main(String[] args) {
        
        int a;
        int b;

        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;
        double resto;
        
        
        Scanner s = new Scanner(System.in); // variavel para ler informações do terminal (entrada de dados)


        System.out.println("Informe os valores inteiros para :");
        System.out.print("a: ");
        a = s.nextInt();

        System.out.print("b: ");
        b = s.nextInt();

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;
        resto = a % b;

        System.out.println( "\nA = " + a + " B = " + b + " \n Resultados Operadores logicos:\n soma: " + soma + "\n subtracao: " + subtracao + "\n multiplicacao: " + multiplicacao + "\n divisao: " + divisao + "\n resto: " + resto + "\n");
        
        System.out.println("Resultados Operadores Matematicos \n a <  b = " + (a <  b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a >  b = " + (a >  b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        s.close();
    }
}
