import java.util.Scanner;

class exercicio24 {
    
    public static void main(String[] args) {
        
        double altura, pesoIdeal, pesoAtual;
        int genero;

        try(Scanner s = new Scanner(System.in)){

            System.out.println("Calcule seu peso ideal");
            System.out.print("qual sua altura: ");
            altura = s.nextDouble();
            
            System.out.print("Qual seu peso: ");
            pesoAtual = s.nextDouble();

            System.out.print("Qual seu genero (m=1) (f=0): ");
            genero = s.nextInt();

            if(genero == 1){
                pesoIdeal = (72.7 * altura) - 58;
                
                if(pesoIdeal > pesoAtual){
                    System.out.print("Voce esta a baixo do peso");
                }else if(pesoIdeal == pesoAtual){
                    System.out.print("Voce esta no peso Ideal");
                }else{
                    System.out.print("Voce esta a cima do peso");
                }
            }
            if(genero == 0){
                pesoIdeal = (62.1 * altura) - 44.7;
                
                if(pesoIdeal > pesoAtual){
                    System.out.print("Voce esta a baixo do peso");
                }else if(pesoIdeal == pesoAtual){
                    System.out.print("Voce esta no peso Ideal");
                }else{
                    System.out.print("Voce esta a cima do peso");
                }
            }
            
            s.close();
        }
    }

}

