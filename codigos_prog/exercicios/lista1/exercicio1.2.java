import java.util.Scanner;

class exercicio2 {
    public static void main(String[] args){

        String nome;
        int idade;
        char genero;
        String cor;
        boolean esportes;

        try(Scanner s = new Scanner(System.in)){
            System.out.println("Informe as seguintes informações:");
            System.out.print("Nome: ");
            nome = s.nextLine();

            System.out.print("Idade: ");
            idade = s.nextInt();

            System.out.print("Genero (M/F): ");
            genero = s.next().charAt(0);

            System.out.print("Cor favorita: ");
            cor = s.next();

            System.out.print("Pratica esportes? (true/false): ");
            esportes = s.nextBoolean();
            
            System.out.println("--- Informações ---\n Nome: " + nome + "\n" +"Idade: " + idade + "\n" +"Genero: " + genero + "\n" +"Cor favorita: " + cor + "\n" +"Pratica esportes: " + esportes);

            s.close();
        }
        
    }
}
