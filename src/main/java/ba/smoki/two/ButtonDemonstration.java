package ba.smoki.two;

import javax.swing.*;
import java.awt.*;

public class ButtonDemonstration {
    public static void main(String[] args) {
        Runnable runnable = ButtonDemonstration::createGUI;
//        new Thread(runnable).start();
        SwingUtilities.invokeLater(runnable);


    }
    public static void createGUI(){
        System.out.println("GUI crta: " + Thread.currentThread().getName());
        JFrame frame = new JFrame("Prozor sa zivim dugmicima");
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);
        JPanel panel = new ButtonPanel();
        panel.setBackground(Color.CYAN);
        frame.add(panel, BorderLayout.CENTER);
        //frame.setSize(500,400);
        JButton programExitButton = new JButton("EXIT");
        programExitButton.addActionListener(e->{
            System.exit(0);
        });
        frame.add(programExitButton, BorderLayout.PAGE_END);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

