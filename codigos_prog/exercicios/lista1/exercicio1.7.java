import java.util.Scanner;

class exercicio7 {
    
    public static void main(String[] args) {
        
        int numeroA;
        int numeroB;

        try(Scanner s = new Scanner(System.in)){
            
            System.out.println("Informe os valores:");
            System.out.print("A: ");
            numeroA = s.nextInt();

            System.out.print("B: ");
            numeroB = s.nextInt();

            System.out.println("A >  B = " + (numeroA >  numeroB));
            System.out.println("A <  B = " + (numeroA <  numeroB));
            System.out.println("A == B = " + (numeroA == numeroB));
            System.out.println("A != B = " + (numeroA != numeroB));

            s.close();
        }
    }

}