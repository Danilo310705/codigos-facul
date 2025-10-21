import java.util.Scanner;

class exercicio29 {
    
    public static void main(String[] args) {
        
        double valorTotalCompra;
        int codigo;

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Informe o valor a pagar: ");
            valorTotalCompra = s.nextDouble();

            System.out.print("Informe o codigo de pagamento: ");
            codigo = s.nextInt();

            switch (codigo){
                case 1 -> 
                System.out.println("valor a pagar: " + (valorTotalCompra-(valorTotalCompra*0.1)));
                case 2 -> 
                System.out.println("valor a pagar: " + (valorTotalCompra-(valorTotalCompra*0.08)) + "\nparcelas: 1");
                case 3 -> 
                System.out.println("valor a pagar: " + valorTotalCompra + "\n parcelas: 5\n" + "valor por parcela: " + (valorTotalCompra/5));
                case 4 -> 
                System.out.println("valor a pagar: " + (valorTotalCompra+(valorTotalCompra*0.05)) + "\nparcelas: 10\n" + "valor por parcela: " + ((valorTotalCompra+(valorTotalCompra*0.03))/10));
                default -> 
                System.out.println("Codigo invalido");
            }
            s.close();
        }
    }
}
