import java.util.Random;
import java.util.Scanner;

class exercicio214 {


    public static void main(String[] args) {
        
        int numAdivinha;
        int opcoes;
        int numChute;
        String resultado; 
        
        Random aleatorio = new Random();
        try(Scanner s = new Scanner(System.in)){ 
            System.out.println("que comece o jogo");
            System.out.print("jogar contra bot(1) ou amigo(2)? ");
            opcoes = s.nextInt();
            
            switch (opcoes) {
                case 1 -> {
                    numAdivinha = aleatorio.nextInt(100) + 1;
                    System.out.print("Agora tente descobir ");
                    do { 
                        numChute = s.nextInt();
                        resultado = dica(numChute, numAdivinha);
                        System.out.println(resultado);
                    }while (numAdivinha != numChute);
                }

                case 2 -> {
                    System.out.print("selecione o numero a ser descoberto ");
                    numAdivinha = s.nextInt();
                    System.out.print("Agora tente descobir ");
                    do { 
                        numChute = s.nextInt();
                        resultado = dica(numChute, numAdivinha);
                        System.out.println(resultado);
                    }while (numAdivinha != numChute);
                }
                default -> System.out.print("Erro 1443");
            }
            
        }
    }

    public static String dica(int a, int b){
        if(a > b){
            return "Chute alto";
        }else if (a == b) {
            return "Acertou miseravi";
        }else{
            return "Chute baixo";
        }
    }
}
