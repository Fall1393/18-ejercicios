import java.util.Scanner;
public class Ejercicio8 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            int A;

            System.out.print("Ingresa un Num.: ");
            A = ingreso.nextInt();

            if(A % 2 == 0){
                System.out.println("El Num. es par");
            }
            else{
                System.out.println("El Num. es impar");
            }
        }

    }

