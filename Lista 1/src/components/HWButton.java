package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HWButton extends JButton {
    MainFrame parent;

    HWButton(MainFrame p) {
        super("Click on me");
        parent = p;
        setBackground(new Color(200,180,100));
        setBounds(15,15,200,100);
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        parent.popup.setVisible(true);
    }
}