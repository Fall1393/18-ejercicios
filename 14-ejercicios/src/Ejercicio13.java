import java.util.Scanner;
public class Ejercicio13 {
        public static void main(String[] args) {
            // TODO code application logic here
            int desigual = 0, ladoA, ladoB, ladoC;
            Scanner ingreso = new Scanner(System.in);

            System.out.println("Desigualdad Triangular");
            System.out.print("Ingresa el lado A: ");
            ladoA = ingreso.nextInt();

            System.out.print("Ingresa el lado B: ");
            ladoB = ingreso.nextInt();

            System.out.print("Ingresa el lado C: ");
            ladoC = ingreso.nextInt();

            if((ladoA + ladoB) < ladoC){
                desigual++;
            }
            if((ladoA + ladoC) < ladoB){
                desigual++;
            }
            if((ladoB + ladoC) < ladoA){
                desigual++;
            }
            if (desigual > 0){
                System.out.println("No es un triangulo valido");
            }
            else{
                tipo(ladoA,ladoB,ladoC);
            }

        }

        public static void tipo(int ladoA, int ladoB, int ladoC){
            if(ladoA == ladoB && ladoA == ladoC){
                System.out.println("Es equilatero");
            }
            if(ladoA == ladoB && ladoA != ladoC || ladoA == ladoC && ladoA != ladoB || ladoB == ladoC && ladoB != ladoA){
                System.out.println("Es isosceles");
            }
            if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("Es escaleno");
            }

        }
    }

