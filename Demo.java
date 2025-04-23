import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo extends JFrame {
   
    JTable t;
    JScrollPane sp;

    Demo() {
        String data[][]={
            {"Paritosh","2061","BCA"},
            {"Kiran","2062","BCA"}
        };
        String col[]={"Name","DOB","Faculty"};
        JTable t=new JTable(data,col);
        t.setBounds(50, 50, 60, 60);
        JScrollPane sp=new JScrollPane(t);
        add(sp);
      

        // Set layout and add components
       
        add(t);
       

        // Set frame properties
        setSize(300, 150);
        setVisible(true);

  

   
    }

    public static void main(String[] args) {
        new Demo();
    }
}
