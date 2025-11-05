import java.util.Scanner;

class exercicio2_3{
    
    static Scanner s = new Scanner(System.in);
    public static void main (String[] args){
        //Declare um vetor do tipo real de 10 posições. Peça as notas de 10 alunos da disciplina de algoritmos.
        //Insira no vetor e depois exiba a média da sala, a menor e a maior nota.
        double soma = 0;
        double maior = 0;
        double menor = 100; 
        double media;
        double nota[] = new double [10];

        for(int i = 0; i < nota.length ;i++){
            nota[i] = pedir_numero_double();
            soma += nota[i];
            if (maior < nota[i]) {
                maior = nota[i];
            }
            if (menor > nota[i]) {
                menor = nota[i];
            }
        }
        media = soma / nota.length;

        System.out.println("A média da sala é: " + media + "\nA maior nota é: " + maior + "\nA menor nota é: " + menor);

    }
    public static double pedir_numero_double() {
        System.out.print("informe a nota: ");
        return s.nextDouble();
    }
}