import java.util.Scanner;

class trabalho {
    //Cris quer fazer uma base de dados para armazenar as cores de cada pedido de crochê que ela faz. 
    //Ela iniciou seus estudos em programação, mas ainda não conseguiu implementar uma solução satisfatória. 
    //Ela precisa armazenar o número do pedido, o nome da cliente, a cor principal, cor secundária e a cor complementar. 
    //Todos os valores são textos. 
    //Crie um programa que resolva o problema dela e ainda utilizando matriz e que, ao informar um código de pedido, 
    //retorne o número do pedido, nome do cliente e quais as cores do mesmo, conforme apresentado acima. 
    //Use funções para organizar o código.
    public static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        String pedido[][] = new String[2][5];
        for(int i=0; i < pedido.length; i++){
            System.out.println("----");
            for(int j=0; j < pedido.length; j++){
                
                System.out.println(pedirInformacoes(j));
                pedido[i][j] = s.next();
            }
            
        }

        System.out.print(matrix(pedido));
        

    }
    //System.out.print("olha eu aqui");
    public static String matrix (String[][] ma) {
        String resultado="";
        for(int i=0; i> ma.length; i++){
            for(int j=0; j> ma.length; j++){
                resultado += "Numero do pedido: "+ ma[i][0]+".\nNome do Cliente: " + ma[i][1] + ". \nCor principal: " + ma[i][2] + ". \nCor Secundaria: " + ma[i][3] + ". \nCor complementar: " + ma[i][4]+"\n";
            }
        }
        return resultado;
    }

    public static String pedirInformacoes(int inf){
        switch (inf) {
            case 0:
                return "Qual o numero do pedido";
            case 1:
                return "Qual o nome da cliente";
            case 2:
                return "Qual a cor principal";
            case 3:
                return "Qual a cor secundária";
            case 4:
                return "Qual a cor complementar";
            default:
                return"sla agora";
        }
    }
}

