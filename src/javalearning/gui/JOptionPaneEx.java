package javalearning.gui;
import javax.swing.JOptionPane;
public class JOptionPaneEx {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter you name:");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "you are "+age+" year's old");

    }
}
