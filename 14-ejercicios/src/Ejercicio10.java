import java.util.Stack;
public class Ejercicio10 {
    public static void main(String[] args){}
        Stack<Boolean> pila = new
                Stack<Boolean>();
        public void dividir(int numero1,int numero2){
            if(pila.push((boolean)((numero1%numero2==0)))){

                System.out.print ("La division " + numero1+"/"+numero2+"Es exacta ");
            }else{
                System.out.print("La Division "+ numero1+"/"+ numero2 + "No es exacta");}
        }
    }

