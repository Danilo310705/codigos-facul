import java.util.Scanner;
class exercicio213{
    public static void main(String[] args){
        int numRecebido;
        int resultado = 0;
        try(Scanner s = new Scanner(System.in)){
            do { 
                System.out.print("digite o numero para somar (digite 0 para sair): ");
                numRecebido = s.nextInt();
                if (numRecebido >= 0 && numRecebido <= 100){
                    if(numRecebido == 0){
                    }else if (epar(numRecebido)) {   
                        resultado += numRecebido;
                        System.out.println("numero somado");
                    }else if(!epar(numRecebido)){
                        System.out.println("numero não somado");
                    }
                }else{
                    System.out.println("numero invalido");
                }
                } while (numRecebido != 0);
            System.out.print("A somatoria total é de: " + resultado);
        }
    }
    public static boolean epar(int n){
        return n % 2 == 0;
    }
}