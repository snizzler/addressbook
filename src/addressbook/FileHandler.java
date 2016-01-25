/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class FileHandler {

    public ArrayList<String> getAdressen() {
        ArrayList<String> adressen = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("adressen.txt"));
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                adressen.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Datei ist nicht vorhanden!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Allgemeiner Ein-/Ausgabefehler!");
        }
        return adressen;
    }

    public void writeAdressen(List list) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter("adressen.txt"));
            Iterator iter = list.iterator();
            while (iter.hasNext()) {
                Object o = iter.next();
                printWriter.println(o);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Datei ist nicht vorhanden!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Allgemeiner Ein-/Ausgabefehler!");
        }
    }

    public static void main(String[] args) {
        FileHandler adressen = new FileHandler();
        ArrayList<String> adresse = adressen.getAdressen();
        System.out.println(adressen.getAdressen().get(4));
        adresse.add("Huso!");
        adressen.writeAdressen(adresse);
    }
}
