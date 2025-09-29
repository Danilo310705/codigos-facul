import java.util.Scanner;

class exercicio6 {
    
    public static void main(String[] args) {
        int numero;

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Digite um numero");
            System.out.print("numero: ");
            numero = s.nextInt();
            System.out.println(numero +"^2 = " + Math.pow(numero, 2)+ "\n" + numero + "^4 = " + Math.pow(numero, 4) + "\n" + numero + "^6 = " +Math.pow(numero, 6) + "\n" + numero + "^8 = " +Math.pow(numero, 8) + "\n" + numero +"^10 = " +Math.pow(numero, 10));


        }
    }
}
