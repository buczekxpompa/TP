package components;

import javax.swing.*;
import java.awt.*;

public class ButtonDialogue extends JDialog {

    ButtonDialogue() {
        add(new Label("Hello world!"));
        setBounds(10,10,100,50);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(false);
    }
}