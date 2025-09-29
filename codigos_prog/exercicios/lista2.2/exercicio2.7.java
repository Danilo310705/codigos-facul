import java.util.Scanner;

class exercicio27 {
    
    public static void main(String[] args) {
        int mes;
        int mesAtual = 9;

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Informe o mes desejado: ");
            mes = s.nextInt();

            if(mes >= 1 && mes <= 12){
                if (mes < mesAtual) {
                    System.out.println("Mês já passou");                
                }else if (mes > mesAtual) {
                    System.out.println("Mês Futuro");
                }else{
                    System.out.println("Mês atual");
                }
            }else{
                System.out.println("Valor Inválido");
            }
            
            
        }
    }
}
