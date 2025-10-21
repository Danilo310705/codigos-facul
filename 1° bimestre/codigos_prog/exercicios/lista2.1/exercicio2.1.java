import java.util.Scanner;

class exercicio21{

    public static void main(String[] args){

        double raio;
        double resultado;

        try(Scanner s = new Scanner(System.in)){

            System.out.println("Calcular volume de uma esfera.");
            System.out.print("Qual o Raio: ");
            raio = s.nextDouble();

            resultado = (4 * 3.14 * Math.pow(raio,3))/3;

            System.out.print("o volume da esfera é " + resultado);
            s.close();
        }
    }
}
