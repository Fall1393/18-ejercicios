
        import java.util.Stack;
        import javax.swing.JOptionPane;

public class Ejercicio6 {
    //public static void main(String[] args){}

    Stack<Float> pila=new Stack<Float>();

    public void HoraT(float ingresa,float cantidad){

        pila.push((float) (ingresa + cantidad) % 24);


        while (!pila.empty())

            JOptionPane.showMessageDialog(null,"En "+cantidad+ " horas,"+" El reloj marcara las:\n " + pila.pop()+" horas");
    }

}