import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame {
    JLabel l1, l2, l3, l4;
    JComboBox<String> cb1, cb2;
    JButton b;

    Welcome() {
        l1 = new JLabel("LUMBINI ICT CAMPUS");
        l2 = new JLabel("Welcome Mr: Arun Pandey Laudari");
        l3 = new JLabel("Choose the Faculty");
        l4 = new JLabel("Choose Semester");

        String[] item1 = {"BCA", "CSIT", "BIM", "BHM"};
        cb1 = new JComboBox<>(item1);

        String[] item2 = {"Semester I", "Semester II", "Semester III", "Semester IV", "Semester V", "Semester VI", "Semester VII", "Semester VIII"};
        cb2 = new JComboBox<>(item2);

        b = new JButton("Show");

    //   font milako
        Font titleFont = new Font("Georgia", Font.ROMAN_BASELINE, 25);
        Font labelFont = new Font("Georgia", Font.ROMAN_BASELINE, 18);
        Font buttonFont = new Font("Georgia", Font.ROMAN_BASELINE, 18);

        // Set fonts and colors sabai component ma
        l1.setFont(titleFont);
        l2.setFont(labelFont);
        l3.setFont(labelFont);
        l4.setFont(labelFont);
        cb1.setFont(labelFont);
        cb2.setFont(labelFont);
        b.setFont(buttonFont);

        l1.setForeground(Color.BLUE);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        cb1.setBackground(Color.LIGHT_GRAY);
        cb2.setBackground(Color.LIGHT_GRAY);
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);

        setLayout(null);
        setSize(600, 500);

        //  set bounds to center  sabi components
        l1.setBounds(140, 50, 300, 30); 
        l2.setBounds(50, 100, 500, 30); 
        l3.setBounds(50, 180, 200, 30); 
        cb1.setBounds(250, 180, 200, 30); 
        l4.setBounds(50, 230, 200, 30); 
        cb2.setBounds(250, 230, 200, 30); 
        b.setBounds(250, 300, 100, 40); 

        add(l1);
        add(l2);
        add(l3);
        add(cb1);
        add(l4);
        add(cb2);
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Closing garna lai visiable false garako
                setVisible(false);
                new BookCell();
            }
        });
    }


    public static void main(String[] args) {
        new Welcome();
    }
}
