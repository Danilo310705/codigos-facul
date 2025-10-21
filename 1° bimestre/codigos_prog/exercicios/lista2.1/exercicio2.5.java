import java.util.Scanner;

class exercicio25 {
    
    public static void main(String[] args) {
        
        int anoNascimento, anoAtual, idade;

        try(Scanner s = new Scanner(System.in)){

            System.out.println("Descobrindo sua idade");
            System.out.print("Ano de nascimento:");
            anoNascimento = s.nextInt();

            System.out.print("Ano de Atual:");
            anoAtual = s.nextInt();

            idade = anoAtual - anoNascimento;

            if( idade >= 16 && idade < 18){
                System.out.print("já tem idade para votar");

            }else if( idade >= 18){
                System.out.print("já tem idade para tirar habilitação");
            }else{
                System.out.print("não pode nem votar nem tirar carteira");
            }
        }
    }
}
