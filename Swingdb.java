import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Swingdb implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b;

    Swingdb()
    {
        f=new JFrame("Login form");
        l1=new JLabel("User ID");
        l2=new JLabel("Name");
        l3=new JLabel("Address");
        t1=new JTextField("30");
        t2=new JTextField("30");
        t3=new JTextField("30");
        b=new JButton("OK");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,15,18);
        f.setSize(220, 480);
        f.setVisible(true);
        f.setLayout(fl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);

    }
   public static void main(String[] args) {
    new Swingdb();
   }
}