import java.util.Scanner;

public class exercicionotas1 {
    static Scanner s = new Scanner(System.in);
    public static void main (String[] args){
        //Peça ao usuário quantos preços ele deseja informar. 
        //Crie um vetor, peça ao usuário os preços e armazene em cada posição. 
        //Depois exiba: O Menor, o Maior e a média dos preços. 

        double soma = 0;
        double maior = 0;
        double menor = 100; 
        double media;
        int quantidade_precos;

        System.out.print("Quantos preços deseja informar?: ");
        quantidade_precos = s.nextInt();

        double precos[] = new double [quantidade_precos];
        

        for(int i = 0; i < precos.length ;i++){
            precos[i] = pedir_numero_double();
            soma += precos[i];
            if (maior < precos[i]) {
                maior = precos[i];
            }
            if (menor > precos[i]) {
                menor = precos[i];
            }
        }
        media = soma / precos.length;

        System.out.println("A média de preços é: " + media + "\nO maior preços é: " + maior + "\nO menor preços é: " + menor);

    }
    public static double pedir_numero_double() {
        System.out.print("informe a precos: ");
        return s.nextDouble();
    }
}