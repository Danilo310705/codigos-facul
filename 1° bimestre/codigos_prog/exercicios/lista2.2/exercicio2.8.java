import java.util.Scanner;

class exercicio28 {
    
    public static void main(String[] args) {
        
        int idade;

        try(Scanner s = new Scanner(System.in)){
            System.out.print("digite a sua idade: ");
            idade = s.nextInt();

            if(idade >= 5 && idade <= 7){
                System.out.print("Pertence a categoria Infantil A");
            }else if(idade >= 8 && idade <= 10){
                System.out.print("Pertence a categoria Infantil B");
            }else if(idade >= 11 && idade <= 13){
                System.out.print("Pertence a categoria Juvenil A");
            }else if(idade >= 14 && idade <= 17){
                System.out.print("Pertence a categoria Juvenil B");
            }else if(idade >= 18){
                System.out.print("Pertence a categoria Adulto");
            }else{
                System.out.print("Idade invalida para competicao");
            }
            s.close();
        }
    }

}

