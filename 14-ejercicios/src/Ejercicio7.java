import java.util.Scanner;
public class Ejercicio7 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            double real, decimal;
            int realEnt;

            System.out.print("Ingresa el numero real: ");
            real = ingreso.nextDouble();
            realEnt = (int)real;
            decimal = real - realEnt;

            System.out.printf("La parte decimal es: %f\n", decimal);
        }


}
