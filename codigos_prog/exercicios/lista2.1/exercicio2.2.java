import java.util.Scanner;

class exercicio22 {
    public static void main(String[] args){

        int matricula;
        double horasTrabalhadas;
        double valorPorHoras;
        String data;
        double salario;
        double salarioExtra;
        double salarioTotal;


        try(Scanner s = new Scanner(System.in)){
            
            System.out.println("Calculo de salario");
            System.out.print("Informe o seu numero de matricula: ");
            matricula = s.nextInt();

            System.out.print("Informe as horas trabalhadas: ");
            horasTrabalhadas = s.nextDouble();

            System.out.print("Informe o valor por hora: ");
            valorPorHoras = s.nextDouble();

            System.out.print("Informe a data Ex(“Maio/24”): ");
            data = s.nextLine();

            if (horasTrabalhadas > 200) {
                salario = 200 * valorPorHoras;
                salarioExtra = (horasTrabalhadas - 200) * (valorPorHoras * 1.5);
                salarioTotal = salario + salarioExtra;

                System.out.print("No Mes de " + data + " o Trabalhador da matricula: " + matricula + " tem as seguintes informações sobre pagamento"+
                "\n Horas Trabalhadas: " + horasTrabalhadas + "\n Salario: " + salario + "\n Salario Extra: " + salarioExtra + "\n Salario total: " + salarioTotal);

            }else if (horasTrabalhadas <= 200 && horasTrabalhadas > 0){
                salario = horasTrabalhadas * valorPorHoras;
                System.out.print("No Mes de " + data + " o Trabalhador da matricula: " + matricula + " tem as seguintes informações sobre pagamento"+
                "\n Horas Trabalhadas: " + horasTrabalhadas + "\n Salario: " + salario + "\n Salario Extra: nulo" + "\n Salario total: " + salario);
            }

            s.close();
        }
        
    }
}
