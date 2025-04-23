import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    JFrame f;
    JButton b1, b2, b3, b4, b5;

    FlowLayoutDemo() {
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        b5 = new JButton("Five");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        
        GridLayout gl = new GridLayout(3,3);

        

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(gl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
