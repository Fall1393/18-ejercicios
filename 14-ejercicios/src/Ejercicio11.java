import java.util.Scanner;
public class Ejercicio11 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            String palabraA, palabraB, mayor = "";
            int conteoA, conteoB, diferencia;

            System.out.print("Ingresa una palabra: ");
            palabraA = ingreso.next();
            System.out.print("Ingresa otra palabra: ");
            palabraB = ingreso.next();
            conteoA = palabraA.length();//cuenta numero de letras
            conteoB = palabraB.length();
            diferencia = Math.abs(conteoA - conteoB); //valor absoluto

            if (conteoA > conteoB){
                System.out.printf("\nLa palabra mayor es %s\n", palabraA);
            }
            if (conteoA < conteoB){
                System.out.printf("\nLa palabra mayor es %s\n", palabraB);
            }
            if(conteoA == conteoB){
                System.out.printf("\nLas palabras tienen la misma longitud\n");
            }

            System.out.printf("La diferencia es de %d letra(s)\n", diferencia);
        }

    }

