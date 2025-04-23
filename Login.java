import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    JFrame f;
    JLabel l, l1, l2, l3;
    JTextField t1;
    JPasswordField t2;
    JButton b;

    Login() {
        f = new JFrame();
        l = new JLabel("Library Management System");
        l1 = new JLabel("LUMBINI ICT CAMPUS");
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        t1 = new JTextField(30);
        t2 = new JPasswordField(30);
        b = new JButton("Login");

        // font lai rw color lai adjust
        Font font = new Font("Georgia", Font.ROMAN_BASELINE,18);
        l.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 28));
        l.setForeground(Color.BLUE);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        b.setFont(font);

        l1.setForeground(Color.DARK_GRAY);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);

        t1.setBackground(Color.LIGHT_GRAY);
        t2.setBackground(Color.LIGHT_GRAY);
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);

        f.setLayout(null);
        f.setSize(600, 500);

        // Manually set bounds  milako
        l.setBounds(100, 50, 500, 30);
        l1.setBounds(190, 100, 300, 30);
        l2.setBounds(130, 180, 100, 30);
        t1.setBounds(230, 180, 200, 30);
        l3.setBounds(130, 230, 100, 30);
        t2.setBounds(230, 230, 200, 30);
        b.setBounds(250, 280, 100, 40);

        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = t1.getText();
                String password = new String(t2.getPassword());
                // auta random password asume garam admin and username ni admin ani check garam 
                if (username.equals("admin") && password.equals("admin")) {
                    f.setVisible(false);
                    new Welcome();
                } else {
                    String s="Opps Please Login With Valid Username or Password";
                    System.out.println(s);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
