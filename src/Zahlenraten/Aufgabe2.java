package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Aufgabe2<zufallszahl, gerade>
{
    public static void main(String[] args) {
        int min = 1;     //
        int max = 10;
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        //System.out.println(zufallszahl);
        /* mit dem Code wird angegeben von welcher Zahl aus, der Rechner starten muss und mit welcher Zahl er enden
        muss und mit dem rnd.nextInt wird gesagt, dass er es per Zufallsgenerator erledigen soll*/

        /*if ((zufallszahl%2)==0)
        {
            JOptionPane.showMessageDialog(null, zufallszahl + " ist gerade!");
        } else {
            JOptionPane.showMessageDialog(null, zufallszahl + " ist nicht gerade!");
        }*/
        for (int i=0; i<3; i++) {
            String rueckgabe;
            rueckgabe = JOptionPane.showInputDialog(null, " gib mir bitte eine Ganzzahl, die zwischen 1 und 10 liegt");

            if (Integer.parseInt(rueckgabe) == zufallszahl)
            {
                JOptionPane.showMessageDialog(null, "Deine Zahl ist gleich");
                break;
            } else if ((Integer.parseInt(rueckgabe) - zufallszahl) >= -2 && (Integer.parseInt(rueckgabe) - zufallszahl) <= 2)
            {  //Aufgabe3

                JOptionPane.showMessageDialog(null, "Deine Zahl ist innerhalb der Grenze +2 oder -2");
            } else {

                JOptionPane.showMessageDialog(null, "Deine Zahl ist nicht gleich");
            }
            if (i == 2)
            {
                JOptionPane.showMessageDialog(null,"Ihre 3 Versuche waren falsch!");
            }
            }


    }

}
