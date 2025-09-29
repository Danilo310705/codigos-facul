import java.util.Scanner;

class exemplo_Scanner_Imput{
    public static void main(String[] args) {
        
        String nome;
        int idade;
        double altura;
        char genero;
        boolean trabalho;

        Scanner s = new Scanner(System.in); // variavel para ler informações do terminal (entrada de dados)

        System.out.println("Informe os seguintes dados: ");
        System.out.print("Nome: ");
        nome = s.nextLine();

        System.out.print("idade: ");
        idade = s.nextInt();

        System.out.print("altura: ");
        altura = s.nextDouble();

        System.out.print("genero: (M/F): ");
        genero = s.next().charAt(0);

        System.out.print("Esta trabalhando? (true/false): ");
        trabalho = s.nextBoolean();
        
        System.out.println("Dados informados:\n Nome: " + nome + "\n Idade: " + idade + "\n Altura: " + altura + "\n Genero: " + genero + "\n Trabalhando: " + trabalho);

        s.close();
    }
}