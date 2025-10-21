import java.util.Scanner;

class exercicio8 {

    public static void main(String[] args) {
        
        double valorDoDia1;
        double valorDoDia30;
        double valorTotal;
        double media;


        try(Scanner s = new Scanner(System.in)){
                
                System.out.println("Informe os valores:");
                System.out.print("Valor do dia 1: ");
                valorDoDia1 = s.nextDouble();
    
                System.out.print("Valor do dia 30: ");
                valorDoDia30 = s.nextDouble();
                
                media = (valorDoDia1 + valorDoDia30) / 2;
                valorTotal = (valorDoDia1 + valorDoDia30) + (media * 28);

                System.out.println("litros consumidos: " + valorTotal + " \n media diaria: " + media);

                s.close();
        } 
    }
}
