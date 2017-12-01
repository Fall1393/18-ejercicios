import java.util.Scanner;
public class Ejercicio9 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner into = new Scanner(System.in);
            int A;

            System.out.print("Ingresa un año: ");
            A = into.nextInt();

            if(A % 4 == 0){
                System.out.println("Es bisiesto");
            }
            else{
                System.out.println("No es bisiesto");
            }
        }

    }

