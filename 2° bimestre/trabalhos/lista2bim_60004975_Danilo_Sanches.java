import java.util.Scanner;

class lista2bim_60004975_Danilo_Sanches{

    public static Scanner s = new Scanner(System.in);
    public static void main (String args[]){
        
        char questao;
        do { 
            System.out.print("Digite a letra da questão que deseja executar (a-l) ou 's' para sair: ");
            questao = s.next().charAt(0);

            switch (questao){
                case 'a':
                    exA();
                    break;
                case 'b':
                    exB();
                    break;
                case 'c':
                    exC();
                    break;
                case 'd':
                    exD();
                    break;
                case 'e':
                    exE();
                    break;
                case 'f':
                    exF();
                    break;
                case 'g':
                    exG();
                    break;
                case 'h':
                    exH();
                    break;
                case 'i':
                    exI();
                    break;
                case 'j':
                    exJ();
                    break;
                case 'k':
                    exK();
                    break;
                case 'l':
                    exL();
                    break;
                
                case 's':
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (questao != 's');
    }
    
    //---------------------------------------------------------------------------
    public static void exA(){
        int num1;
        int num2;
        int num3;

        System.out.print("Digite o primeiro número: ");
        num1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = s.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = s.nextInt();
        System.out.println("ordem crescente " + odenar_inteiros(num1, num2, num3));

    }
    
    public static String odenar_inteiros(int x, int y, int z){
        if(x<=y && y<=z){
            return x + ", " + y + ", " + z;
        }else if(x<=z && z<=y){
            return x + ", " + z + ", " + y;
        }else if(y<=x && x<=z){
            return y + ", " + x + ", " + z;
        }else if(y<=z && z<=x){
            return y + ", " + z + ", " + x;
        }else if(z<=x && x<=y){
            return z + ", " + x + ", " + y;
        }else{
            return z + ", " + y + ", " + x;
        }
    }
    //---------------------------------------------------------------------------
    public static void exB(){
        String[][] matriz = new String[3][3];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = s.next();
            }
        }
        System.out.println(imprime_vetor_string(matriz));
        
    }

    public static String imprime_vetor_string(String[][] ma){
        String resultado = "";
        for(int i=0; i<ma.length; i++){
            for(int j=0; j<ma.length; j++){
                resultado += "["+i+"]"+ "["+ j + "]" + ma[i][j] + " "; 
            }
            resultado += "\n";
        }
        return resultado;
    }
    //---------------------------------------------------------------------------
    public static void exC(){
        System.out.print("Digite o Tamanho do vetor");
        int vetor[] = new int[s.nextInt()];
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Numero do vetor: ");
            vetor[i] = s.nextInt();
        }
        System.out.println(imprime_vetor_int(ordena_vetor(vetor)));
    }

    public static int[] ordena_vetor(int[] vet){
        for(int i = 0; i < vet.length - 1; i++){
            for(int j = 0; j < vet.length - 1 - i ; j++){
                if(vet[j] > vet[j+1]){
                    int valorj = vet[j];
                    vet[j] = vet[j+1];
                    vet[j + 1] = valorj;
                }
            }
        }
        return vet;
    }

    public static String imprime_vetor_int(int[] vet){
        String resultado = "";
        for(int i=0; i<vet.length; i++){
            resultado += " ["+i+"] " + vet[i] + ","; 
        }
        return resultado;
    }
    //-------------------------------------------------------------------------------
    public static void exD(){
        int[][] matriz = new int[3][3];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = s.nextInt();
            }
        }
    }

    public static void somaDaMatriz(int[][] ma){
        
        for(int i =0; i > ma.length; i++ ){
            
        }

    }
























}