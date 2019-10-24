package components;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainFrame extends JFrame {
    HWButton mainButton = new HWButton(this);
    ButtonDialogue popup = new ButtonDialogue();

    public MainFrame() {
        super("Hello");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setBounds(100,100,300,300);
        super.setBackground(new Color(45,45,45));
        add(mainButton, CENTER_ALIGNMENT);
        setJMenuBar(new FrameBar(this));
        setVisible(true);
    }
    public void randomizeButtonColor() {
        mainButton.setBackground(randomizeColor());
    }

    public void randomizeBackgroundColor() {
        popup.setBackground(randomizeColor());
    }

    private Color randomizeColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(250),rand.nextInt(250),rand.nextInt(250));

}
}