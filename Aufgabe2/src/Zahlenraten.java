import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[]args)
    {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max-min+1)+min;
        //java.util ist ein Package in das wir die Klasse Random importiert haben => java.util.Random

        /**
        if (zufallszahl%2==0)
        {
            System.out.println("Da ist ne gerade Zahl drinnen.");
        }else{
            System.out.println("Da ist keine gerade Zahl drinnen.");
         }*/

        //Aufgabe 3
        String ganzzahl = JOptionPane.showInputDialog("Bitte gib eine Ganzzahl zwischen 1 und 10 ein.");

        if (ganzzahl == zufallszahl) {
            System.out.println(true);
        }else (ganzzahl != zufallszahl) {
        System.out.println(false);
        }
    }
}
