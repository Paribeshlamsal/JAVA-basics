import javax.swing.*;

public class Arun {
    JFrame f;
    JRadioButton b1, b2;

    Arun() {
        f = new JFrame();
        // Remove this line: f.setLayout(null);
        f.setTitle("Arun hero");
        b1 = new JRadioButton("Maths ");
        b1.setBounds(100, 90, 100, 50); // Adjust width to accommodate the text
        b2 = new JRadioButton("Science ");
        b2.setBounds(200, 90, 100, 50); // Adjust width to accommodate the text

        ButtonGroup group = new ButtonGroup(); // Create a button group
        group.add(b1); // Add radio buttons to the group
        group.add(b2);

        f.add(b1);
        f.add(b2);

        f.setSize(400, 400);
        f.setLayout(null); // Set layout manager after adding components
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Arun();
    }
}
