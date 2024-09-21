package ba.smoki.two;

import javax.swing.*;

public class ListDialogRunner {

    public static void main(String[] args) {
        Runnable runnable = ListDialogRunner::createGUI;
        SwingUtilities.invokeLater(runnable);
    }

    static void createGUI(){
        JFrame frame = new JFrame("Select one in the list");
        NameChooserPanel panel = new NameChooserPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}
