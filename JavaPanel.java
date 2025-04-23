import javax.swing.*;
class JavaPanel extends JFrame {
    JPanel p;
    JTextField t;
    JLabel l;
    JButton b;

    JavaPanel() {
        add(p);
        setSize(400, 500);
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        p = new JPanel();
        p.setBounds(80, 120, 250, 250);
        l = new JLabel("Username");
        l.setBounds(140, 150, 80, 20);
        t = new JTextField(30);
        t.setBounds(250, 150, 100, 20);
        b = new JButton("ok");
        b.setBounds(200, 200, 80, 20);
        p.add(l);
        p.add(t);
        p.add(b);

        setVisible(true);
        
    }

    public static void main(String[] args) {
        new JavaPanel();
    }
}
