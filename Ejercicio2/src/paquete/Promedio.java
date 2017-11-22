package paquete;
import javax.swing.*;
public class Promedio {
    public static void main(String[] arg){
        Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("primera nota "));
        Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("segunda nota "));
        Double nota3 = Double.parseDouble(JOptionPane.showInputDialog("tercera nota "));
        Double nota4 = Double.parseDouble(JOptionPane.showInputDialog("cuarta nota "));
        Double promedio=(nota1+nota2+nota3+nota4)/4;
        JOptionPane.showMessageDialog(null,"El Promedio es " + promedio);

    }
}
