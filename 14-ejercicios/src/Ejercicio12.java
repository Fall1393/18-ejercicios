import java.util.Scanner;
public class Ejercicio12 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);

            System.out.print("Ingresa un caracter: ");
            char letra = ingreso.next().charAt(0);
            int aski = (int)letra; //aqui esta el nro ascii

            if(aski <= 47){
                System.out.println("Es un signo");
            }
            if(aski >= 58 && aski <= 64){
                System.out.println("Es un signo");
            }
            if(aski >= 91 && aski <= 96){
                System.out.println("Es un signo");
            }
            if(aski >= 123 && aski <= 192 ){
                System.out.println("Es un signo");
            }
            if(aski >= 65 && aski <= 90 ){
                System.out.println("Es una letra");
            }
            if(aski >= 97 && aski <= 122 ){
                System.out.println("Es una letra");
            }
            if(aski >= 48 && aski <= 57 ){
                System.out.println("Es un numero");
            }

            System.out.println("Numero de scii = " + aski);
        }

    }

