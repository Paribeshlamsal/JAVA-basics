import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Loginpage extends JFrame implements KeyListener{
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b;

    Loginpage(){
        l1=new JLabel("Lumbini ICT Campus");
        l1.setBounds(40, 50, 60, 70);
        add(l1);
        l2=new JLabel("-------------------------------");
        add(l2);
        l3=new JLabel("Username");
        add(l3);
       
        t1=new JTextField(25);
        add(t1);                        
       
        l4=new JLabel("Password");
        add(l4);
        t2=new JPasswordField(25);
        add(t2);
        b=new JButton("Login");
        add(b);

        FlowLayout fl=new FlowLayout(FlowLayout.CENTER);

        

        



        setSize(500, 500);
        setVisible(true);
        setLayout(fl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addKeyListener(this);

    }
    public void keyPressed(KeyEvent e){

    }
    public void keyReleased(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){

    }








public static void main(String[] args) {
    new Loginpage();

    
}
    
}