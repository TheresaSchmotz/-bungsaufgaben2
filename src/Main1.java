import javax.print.DocFlavor;
import javax.swing.*;

public class Main1 {

    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("Gib bitte deinen Namen ein");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib bitte dein Alter ein."));


        if (alter < 18){
            JOptionPane.showMessageDialog(null,"Du bist viel zu jung!");
        }else if (alter >=18){
            JOptionPane.showMessageDialog(null,"Du bist volljährig. höhö");
        }
    }
}
