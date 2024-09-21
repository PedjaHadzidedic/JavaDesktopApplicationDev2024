package ba.smoki.two;

import ba.smoki.two.listener.AngelListener;
import ba.smoki.two.listener.DevilListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {

    private static final String DISABLE = "DISABLE";
    public static final String ENABLE = "ENABLE";
    private final JButton leftButton;
    private final JButton middleButton;
    private final JButton rightButton;


    public ButtonPanel(){

        ActionListener universalButtonListener = this::onButtonClick;

        Icon rightImageIcon = createIcon("images/right.gif");
        leftButton = new JButton("Disable middle button", rightImageIcon);
        leftButton.setVerticalTextPosition(SwingConstants.CENTER);
        leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
        leftButton.setMnemonic(KeyEvent.VK_L);
        leftButton.setActionCommand(DISABLE);
        leftButton.addActionListener(universalButtonListener);
        leftButton.setToolTipText("Ovo je lijevi disable dugmic");

//        AngelListener angelListener = new AngelListener();
//        DevilListener devilListener = new DevilListener();
//       leftButton.addActionListener(angelListener);//       leftButton.addActionListener(devilListener);

        Icon middleImageIcon = createIcon("images/middle.gif");
        middleButton = new JButton("Middle button", middleImageIcon);
        middleButton.setHorizontalTextPosition(SwingConstants.CENTER);
        middleButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        middleButton.setMnemonic(KeyEvent.VK_M);
        middleButton.addActionListener(universalButtonListener);
        middleButton.setToolTipText("Ovo je Victim");

        Icon leftImageIcon = createIcon("images/left.gif");
        rightButton = new JButton("Enable middle button", leftImageIcon);
        rightButton.setMnemonic(KeyEvent.VK_J);
        rightButton.addActionListener(universalButtonListener);
        rightButton.setActionCommand(ENABLE);
        rightButton.setToolTipText("Ovo je desni enable dugmic");

        add(leftButton);
        add(middleButton);
        add(rightButton);
    }
    private void onButtonClick(ActionEvent event){
        String actionCommand = event.getActionCommand();
        switch (actionCommand){
            case ENABLE -> {
                middleButton.setEnabled(true);
                rightButton.setEnabled(false);
                leftButton.setEnabled(true);
                System.out.println(ENABLE);
            }
            case DISABLE -> {
                middleButton.setEnabled(false);
                leftButton.setEnabled(false);
                rightButton.setEnabled(true);
                System.out.println(DISABLE);
            }
        }
 //       if(actionCommand.equals(ENABLE)){
 //           middleButton.setEnabled(true);
 //       }
 //       if(actionCommand.equals(DISABLE)){
 //           middleButton.setEnabled(false);
 //       }
    }
    private Icon createIcon (String pictureName){
        ClassLoader classLoader = ButtonPanel.class.getClassLoader();
        URL imageAdress = classLoader.getResource(pictureName);
        if(imageAdress != null) {
            ImageIcon imageIcon = new ImageIcon(imageAdress);
            return imageIcon;
        }
        System.err.println("No image with name" + pictureName);
        return null;
    }
}
