import java.util.Scanner;

class exercicio23 {
    
    public static void main(String[] args) {
        
        int num1,num2,num3;


        try(Scanner s = new Scanner(System.in)){ 

            System.out.println("Informe os valores DIFERENTES inteiros para :");
            System.out.print("num1: ");
            num1 = s.nextInt();

            System.out.print("num2: ");
            num2 = s.nextInt();

            System.out.print("num2: ");
            num3 = s.nextInt();
            
            if(num1 > num2 && num2 > num3){
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }else if (num1 > num3 && num3 > num2 ) {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }else if (num2 > num1 && num1 > num3 ) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }else if (num2 > num3 && num3 > num1 ) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }else if (num3 > num2 && num2 > num1 ) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }else if (num3 > num1 && num1 > num2 ) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }else{
                System.out.println("temos valores iguais, caralho");
            }
            s.close();
        }
    }
}
