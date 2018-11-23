package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Aufgabe5 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        int i = 0;

        //while (i < 3) {
         //String rueckgabe;

        //rueckgabe = JOptionPane.showInputDialog(null, " gib mir bitte eine Ganzzahl, die zwischen 1 und 10 liegt");

           // if (Integer.parseInt(rueckgabe) == zufallszahl) {
               // JOptionPane.showMessageDialog(null, "Deine Zahl ist gleich");
                //break;
               // } else {

                //i++;

               // if (i > 2) {

                //     JOptionPane.showMessageDialog(null,"keine Übereinstimmung mit der Zufallszahl: " + zufallszahl + "! Alle Versuche aufgebraucht!");

                //    } else {

                     //JOptionPane.showMessageDialog(null,"keine übereinstimmung mit der Zufallszahl.noch " + (3 - i) + " Versuche übrig.");
                   // }
                //}
        //4}
        do{

            int zz2 = Integer.parseInt(JOptionPane.showInputDialog(null, "gebe eine Zahl zwischen 1 und 10 ein"));

            if (zz2 == zufallszahl) {

                JOptionPane.showMessageDialog(null,"Zahl erraten");

                break;

            } else {

                i++;

                if (i > 2) {

                    JOptionPane.showMessageDialog(null, "keine Übereinstimmung mit der Zufallszahl: " + zufallszahl + "! Alle Versuche aufgebraucht!");

                } else {

                    JOptionPane.showMessageDialog(null, "keine übereinstimmung mit der Zufallszahl.noch " + (3 - i) + " Versuche übrig.");

                }

            }

        }while(i<3);



    }
}
