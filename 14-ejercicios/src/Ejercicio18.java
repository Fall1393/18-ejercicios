import java.util.Scanner;
public class Ejercicio18 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ingreso = new Scanner(System.in);
            int num, i, D = 0, I = 0, aux = 0;

            System.out.println("DIVISORES");
            System.out.print("Ingresa un numero: ");
            num = ingreso.nextInt();

            if(num % 2 == 0){
                I = num / 2;
            }
            else{
                I = (num - 1) / 2;
            }
            for(i = 1; i <= I; i++){
                if(num % i == 0){
                    aux = num / i;
                    if(aux != D){
                        D = aux;
                    }
                    if(i == I){
                        System.out.println(D);
                    }
                    else{
                        System.out.print(D + ",");
                    }
                }
            }
        }

    }
