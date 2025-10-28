import java.util.Scanner;

class matriz {
    static Scanner s = new Scanner(System.in);
    //public static double pedir_numero_double() {
    //    System.out.print("informe um numero(real): ");
    //    return s.nextDouble();
    //}
    
    public static void exemplo_matriz() {
        double alturas_alunos[][] = new double[3][7];
        
        for (int i = 0; i < alturas_alunos.length; i++) {
            for (int j = 0; j < alturas_alunos[i].length; j++) {
                System.out.print("["+ i + "]" + "[" + j + "]");
            }
            System.out.println();
        }
    }
    
    public static double pedir_numero_double() {
        System.out.print("informe um numero(real): ");
        return s.nextDouble();
    }

}
