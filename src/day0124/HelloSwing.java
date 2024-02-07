package day0124;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends JFrame {

    private int count = 0;

    public HelloSwing() {
        super("Swing Practice");

        JButton button = new JButton("Hi Swing! " + count);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                button.setText("Hi Swing! " + count);
            }
        });

        add(button);
        setSize(200, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new HelloSwing();
    }
}
