package LearningGUIinJava;

import javax.swing.JOptionPane;

public class CreatingAMessageBox {
    public static void main(String[] args) {

        String str = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, str);
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, str + " is your age " + age);;

    }
}
