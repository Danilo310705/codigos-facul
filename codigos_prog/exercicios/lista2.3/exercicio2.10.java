import java.util.Scanner;

class exercicio210 {
    
    public static void main(String[] args) {
        
        int num1,num2;


        try(Scanner s = new Scanner(System.in)){ 

            System.out.println("Informe os valores para contagem:");
            System.out.print("num1: ");
            num1 = s.nextInt();

            System.out.print("num2: ");
            num2 = s.nextInt();

            System.out.println("valores solicitados:");
            if(num1 < num2){
                while((num1+1) < num2){
                num1++;
                System.out.print(num1 + ", ");            
                }
            }else if (num1 > num2) {
                while(num1 > (num2+1)){
                num2++;
                System.out.print(num2 + ", ");            
                }
            }else{
                System.out.print("Esses numeros são iguais, irmão.");
            }

            s.close();
        }
    }
}
