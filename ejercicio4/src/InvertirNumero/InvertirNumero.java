package InvertirNumero;
import java.util.Scanner;
public class InvertirNumero {
    public static  void main(String[]args){
        Scanner obtener = new Scanner(System.in);
        System.out.println(" ingrese el numero que dese invertir");
        int numero = obtener.nextInt();
        if (numero > 999 & numero < 10000){
            int a = numero / 1000;
            int b = numero - (a * 1000);
            int c = b / 100;
            int d = b - (c*100);
            int e= d / 10;
            int f = d - (e * 10);
            int g = (f*100) + (e * 100) + ( c * 10 ) +a;
            System.out.println(" este esl el numero invertido " + g);
        }
    }
}
