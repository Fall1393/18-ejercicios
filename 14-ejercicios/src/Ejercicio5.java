import java.util.Scanner;
public class Ejercicio5 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            int A, B, suma;
            double hipo;

            System.out.print("Ingresa cateto 1: ");
            A = ingreso.nextInt();
            System.out.print("Ingresa cateto 2: ");
            B = ingreso.nextInt();

            A = A * A;
            B = B * B;
            suma = A + B;
            hipo = Math.sqrt(suma);

            System.out.println("La hipotenusa es: "+ hipo);
        }

    }

