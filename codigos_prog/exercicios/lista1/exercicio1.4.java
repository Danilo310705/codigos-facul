import java.util.Scanner;

class exercicio4 {
    
    public static void main(String[] args) {
        
        int numeroA;
        int numeroB;

        try(Scanner s = new Scanner(System.in)){
            
            System.out.println("Informe os valores:");
            System.out.print("A: ");
            numeroA = s.nextInt();

            System.out.print("B: ");
            numeroB = s.nextInt();

            if(numeroA > numeroB){
                System.out.println("A é maior que B");
            } else if (numeroA < numeroB){
                System.out.println("A é menor que B");
            } else {
                System.out.println("Os numeros sao iguais.");
            }

            s.close();
        }
    }

}

