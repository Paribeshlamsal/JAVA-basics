import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class EventHandling implements ActionListener{
    JFrame f;
    JTextField t1,t2;
    JButton b;

    EventHandling(){
        f=new JFrame();
        t1=new JTextField(30);
        t2=new JTextField(30);
        b=new JButton("copy");
        f.add(t1);
        f.add(b);
        f.add(t2);

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,30,20);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(fl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String str=t1.getText();
        t2.setText(str);
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}