package components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FrameBar extends JMenuBar {

    FrameBar(MainFrame parent) {
        super();
        add(new OptionMenu(parent));
        setVisible(true);
    }
}