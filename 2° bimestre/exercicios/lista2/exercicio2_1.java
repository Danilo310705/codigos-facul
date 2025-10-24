import java.util.Scanner;

class exercicio2_1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String escrita = "";
        double notas[] = new double[4];
        
        //preencher o vetor manualmente;
        notas[0] = pedir_numero_double();
        notas[1] = pedir_numero_double();
        notas[2] = pedir_numero_double();
        notas[3] = pedir_numero_double();

        //exibir valores do vetor manualmente

        System.out.println("notas informadas: " + notas[0]);
        System.out.println("notas informadas: " + notas[1]);
        System.out.println("notas informadas: " + notas[2]);
        System.out.println("notas informadas: " + notas[3]);

        // preencher cetor com o laço FOR;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = pedir_numero_double();
        }
        // exibir valores do vetor com o laço ;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas "+ i+1 +": " + notas[i]);
        }

        // jeitinho melhor(eu acho)
        for (int i = 0; i < notas.length; i++) {
            notas[i] = pedir_numero_double();
            escrita += "\n"+ i+1 +"° nota:" + notas[i];
        }
        System.out.println(escrita);
    }
    
    public static double pedir_numero_double() {
        System.out.print("informe um numero(real): ");
        return s.nextDouble();
    }

}
