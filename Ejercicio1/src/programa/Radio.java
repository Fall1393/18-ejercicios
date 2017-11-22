package programa;
import javax.swing.JOptionPane;

    public class Radio {
    public static void main(String []arg){
        Radio b;
        b = new Radio();
        b.lee();
        b.calculeArea();
        b.imprimeArea();
        b.calculePerimetro();
        b.imprimePerimetro();
    }
    private float radio;
    private float perimetro;
    private float area;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }
    public void calculeArea(){
        area = (float)(Math.PI * radio * radio);
    }
    public void calculePerimetro(){
        perimetro = (float)(Math.PI * (2*radio));
    }
    public void imprimeArea(){
        JOptionPane.showMessageDialog(null, "El area es " + area);
    }
    public void imprimePerimetro(){
        JOptionPane.showMessageDialog(null, "El perimetro es " + perimetro);}

        public void lee(){
        radio= Float.parseFloat(JOptionPane.showInputDialog(null, "radio: "));
        }
}

//public class circulo {
//public static void main (String []args){


//}
//}
