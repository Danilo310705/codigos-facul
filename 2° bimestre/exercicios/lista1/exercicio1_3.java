import java.util.Scanner;

class exercicio1_3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        //Crie uma função que peça ao usuário um número e retorne o número informado. 
        //Ela deve validar se ele é maior que 0 e menor que 1.000. 
        //Caso não seja, informe número inválido. 
        //No corpo do programa, crie um vetor de 10 posições de inteiros e para preencher o vetor, chame a função criada anteriormente. 
        //No final, exiba os números informados pelo usuário. 
        System.err.println("Numero informado: " +  solicita_numero());
    }
    public static int solicita_numero(){
        int numero;
        System.out.print("digite o numero : ");
        numero = s.nextInt();
        if(numero > 0 && numero < 1000){

        }else{
            System.err.println("numero invalido");
            numero = solicita_numero();
        }
        return numero;
    }
}
