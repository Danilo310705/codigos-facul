import java.util.Scanner;

class exercicioTriangulo {

    public static void main(String[] args) {
        int ladoA;
        int ladoB;
        int ladoC;

        try (Scanner s = new Scanner(System.in)) {

            System.out.println("Informe os valores dos lados do triangulo:");
            System.out.print("lado A = ");
            ladoA = s.nextInt();

            System.out.print("lado B = ");
            ladoB = s.nextInt();

            System.out.print("lado C = ");
            ladoC = s.nextInt();

            if(ladoA + ladoB > ladoC && ladoC + ladoB > ladoA && ladoA + ladoC > ladoB){
                if(ladoA == ladoB && ladoB ==ladoC ){
                    System.out.print("ele é um triangulo equilatero");
                } else if (ladoA == ladoB && ladoB != ladoC|| ladoA == ladoC && ladoC != ladoB || ladoB == ladoC && ladoC != ladoA) {
                    System.out.print("ele é um triangulo isoceles");
                }else{
                    System.out.print("ele é um triangulo escaleno");
                }
            }else{
                System.out.println("ele não é um triangulo");
            }
        }
    }

}
