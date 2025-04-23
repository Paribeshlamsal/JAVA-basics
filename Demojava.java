import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * Demojava
 */
public class Demojava extends JFrame implements ActionListener {
   JLabel l;
   JTextField f;
   JLabel l1;
   JTextField f1;

        Demojava()
        {
          JLabel l=new JLabel("Enter any number");
          l.setBounds(50,50,50,50);
          JTextField f=new JTextField(30);
          f.setBounds(50,50,50,50);
          JButton b=new JButton("Calculate Square");
          b.setBounds(50,50,50,50);
          JLabel l1=new JLabel("Square of entered number");
          l1.setBounds(50,50,50,50);
          JTextField f1=new JTextField(30);
          f1.setBounds(50,50,50,50);
          add(l);
          add(f);
          add(b);
          add(l1);
          add(f1);
          
          

           




           
            setSize(300,300);
            setLayout(new FlowLayout());
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            b.addActionListener(this);
            
        }
        public void actionPerformed(ActionEvent ae){
            int num= Integer.parseInt(f.getText());
            int square=num*num;
            f1.setText(String.valueOf(square));
           
        }
        public static void main(String args[])
        {
            new Demojava();

        }
    

    
}