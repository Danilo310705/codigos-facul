import java.util.Scanner;

class exercicio9 {
    
    public static void main(String[] args) {
        
        double numero;
        double resultado;

        try(Scanner s = new Scanner(System.in)){

            System.out.println("--Escolha seu numero--");
            System.out.print("numero: ");
            numero = s.nextDouble();
            
            if(numero > 10 && numero < 100){
                resultado = Math.pow(numero, 2);
            }else{
                resultado = Math.sqrt(numero);
            }
            System.out.println("Resultado: " + resultado);
        }
    }
}
