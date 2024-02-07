package day0124;

import java.awt.Frame;
import java.awt.Window;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestSwing extends JFrame {

    public TestSwing(Frame frame) {
        super();
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame mainFrame = new Frame();
        new TestSwing(mainFrame);
        mainFrame.setVisible(true);
    }
}
