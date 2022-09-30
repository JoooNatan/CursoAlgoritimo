import javax.swing.JOptionPane;

public class hipotenusa{
    public static void main(String[] args) {
        double a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado B"));
        c = Math.sqrt(a + b);
        JOptionPane.showMessageDialog(null,c);
    }
}