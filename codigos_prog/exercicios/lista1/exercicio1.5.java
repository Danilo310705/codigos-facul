import java.util.Scanner;

class exercicio5 {
    
    public static void main(String[] args) {
        
        int numero;

        try(Scanner s = new Scanner(System.in)){

            System.out.println("Digite um numero");
            System.out.print("Numero: ");
            numero = s.nextInt();

            if(numero % 2 == 0){
                System.out.println("O numero " + numero + " e par");
            }else{
                System.out.println("O numero " + numero + " e impar");
            }
        }
    }
}
