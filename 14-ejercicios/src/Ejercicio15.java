import java.util.Scanner;
public class Ejercicio15 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            int A;
            System.out.print("Ingresa un numero: ");
            A = ingreso.nextInt();
            Tabla(A);

        }//FIN DEL MAIN
        public static void Tabla(int A){
            int i;
            for(i = 1; i<=10; i++){
                System.out.printf("%d x %d = %d\n",A, i, (i * A) );
            }
        }

    }

