import java.util.Scanner;

class exercicio26 {
    
    public static void main(String[] args) {
        double num1, num2, resultado;
        String operador;

        try(Scanner s = new Scanner(System.in)){
            System.out.println("Contas");
            System.out.print("Coloque o primeiro numero: ");
            num1 = s.nextDouble();

            System.out.print("Coloque o segundo numero: ");
            num2 = s.nextDouble();

            System.out.print("Selecione o operador (+, -, *, /): ");
            operador = s.next();

            switch (operador) {
                case "+" : 
                    resultado = soma(num1, num2);
                    System.out.println(resultado);
                    break;
                
                case "-" : 
                    resultado = subtracao(num1, num2);
                    System.out.println(resultado);
                    break;
                
                case "*" : 
                    resultado = multiplicacao(num1, num2);
                    System.out.println(resultado);
                    break;

                case "/" : 
                    resultado = divisao(num1, num2);
                    System.out.println(resultado);
                    break;

                default :
                    System.out.println("Sinal Não existente");
                    break;
            }

        }
    }

    public static double soma(double n1, double n2){
        return n1 + n2;
    }
    public static double subtracao(double n1, double n2){
        return n1 - n2;
    }
    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }
    public static double divisao(double n1, double n2){
        if(n2 == 0){
            return 0;
        }else{
            return n1 / n2;
        }
        
    }
}
