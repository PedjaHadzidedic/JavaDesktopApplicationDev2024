package ba.smoki.two.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton button = (JButton)event.getSource();
        System.out.println("Ja sam djavo pretplacen na tebe dugmicu..." + button.getText());
    }
}
