import java.util.Scanner;
public class Ejercicio16 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            int A;
            System.out.println("Potencia de 2");
            System.out.print("Ingresa un numero: ");
            A = ingreso.nextInt();
            Potencia(A);
        }//fin main

        public static void Potencia(int B){
            int i;
            for(i = 1; i <= B; i++){
                System.out.println(i + "^2 = " + (int)(Math.pow(i,2)) );
            }
        }

    }

