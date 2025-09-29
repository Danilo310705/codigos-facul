import java.util.Scanner;

class exercicio211{

    public static void main(String[] args){

        int num1,num2;

        try(Scanner s = new Scanner(System.in)){

            System.out.println("Informe os valores para contagem (O segundo valor deve ser maior que o primeiro.):");
            System.out.print("num1: ");
            num1 = s.nextInt();

            System.out.print("num2: ");
            num2 = s.nextInt();

            if(num1 < num2){
                System.out.println("valores solicitados:");
                while((num1+1) < num2){
                num1++;
                System.out.print(num1 + ", ");            
                }
            }else{
                System.out.print("Respeita as regras, irmão.");
            }
            s.close();
        }
    }
}
