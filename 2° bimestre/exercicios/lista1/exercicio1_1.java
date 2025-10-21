import java.util.Scanner;

class exercicio1_1 {
    public static void main(String[] args) {
        /*1. 
        Crie uma função chamada calculo, com retorno double/real e que receba dois parâmetros double/real. 
        Quando num1 for maior que num2, ela deve retornar a multiplicação dos dois. 
        Quando o num1 for menor que num2, deve-se retornar a divisão entre os dois. Quando eles forem iguais, deve-se retornar a soma deles. */

        double num1;
        double num2;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Informe o primeiro número: ");
            num1 = s.nextDouble();
            System.out.print("Informe o segundo número: ");
            num2 = s.nextDouble();
        }
        double resultado = calculo(num1, num2);
        System.out.println("O resultado é: " + resultado);
    }
    
    public static double calculo(double a, double b) {
        if (a > b) {
            return a * b;
        } else if (a < b) {
            return a / b;
        } else if (a == b) {
            return a + b;
        }
        return 0;
    }

}
