import java.util.Scanner;
public class centimetrosapulgadas {
    public  static  void  main(String args[]){
Scanner t = new Scanner(System.in);
        double valorpulgadas = 2.54;
        double centrimetros,pulgadas;
        System.out.println("valor en centrimetros: ");
        centrimetros = t.nextDouble();

        pulgadas = centrimetros + valorpulgadas;
        System.out.println("valor en pulgada: " + pulgadas);
    }
}
