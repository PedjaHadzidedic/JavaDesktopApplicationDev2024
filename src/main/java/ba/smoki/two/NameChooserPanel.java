package ba.smoki.two;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameChooserPanel extends JPanel {

    static String[] names = {"Kanita", "Arman", "Nejra", "Mile", "Ismet",
            "Alen", "Ferid", "Vladan", "Edvin", "Adis", "Muhamed"};

    private final JLabel chosenNameLabel = new JLabel("The chosen name");
    private final JLabel selectedName;
    private final JButton pickNameButton;

    public NameChooserPanel(){
        this.pickNameButton = new JButton("Pick a new name...");
        this.pickNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        this.selectedName = new JLabel(names[0]);
    }
    public void onPickNameListener(ActionEvent actionEvent){
    }
}
