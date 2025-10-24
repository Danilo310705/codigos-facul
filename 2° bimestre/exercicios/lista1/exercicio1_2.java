import java.util.Scanner;

class exercicio1_2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String resposta="";
        String[] frutas = new String[5];
        //frutas[0] = solicita_texto();
        //frutas[1] = solicita_texto();
        //frutas[2] = solicita_texto();
        //frutas[3] = solicita_texto();
        //frutas[4] = solicita_texto();
        //System.out.println("primeira fruta: " + frutas[0]);
        //System.out.println("segunda fruta: " + frutas[1]);
        //System.out.println("terceira fruta: " + frutas[2]);
        //System.out.println("quarta fruta: " + frutas[3]);
        //System.out.println("quinta fruta: " + frutas[4]);
        for (int i = 0; i < frutas.length; i++) {
            frutas[i] = solicita_texto();
            resposta += "\n"+ i+1 +"° fruta:" + frutas[i];
        }

        System.out.println(resposta);
    }
    public static String solicita_texto(){
        String palavra = "";
        while(palavra.length()<5){
            System.out.print("Digite um texto: ");
            palavra = s.next();
            if(palavra.length()<5){
                System.err.println("texto pequeno");
            }
        }
        return palavra;
    }
}
