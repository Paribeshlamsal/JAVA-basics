import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;


public class Secondinterface extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField  t1,t2;

    Secondinterface(){
        l1=new JLabel("Welcome to our College");
        l2=new JLabel("Choose the faculty");
        t1=new JTextField(30);
        l3=new JLabel("Semester");
        t2=new JTextField(30);
        l4=new JLabel("Show");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);

        FlowLayout fl=new FlowLayout(FlowLayout.CENTER);

        setSize(500, 500);

        setVisible(true);;
        setLayout(fl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }


    public static void main(String[] args) {
        new Secondinterface();
    }
}