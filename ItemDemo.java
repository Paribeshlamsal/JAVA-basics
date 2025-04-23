import javax.swing.*;
import java.awt.event.*;


public class ItemDemo implements ItemListener {
    JFrame f;
    JComboBox cb;
    JLabel l;
    
    ItemDemo()
    {
        f=new JFrame("Event handeling on ComboBox");
        l=new JLabel();
        String item[]={"Biscuit","Chocolate","Noodles"};
        cb=new JComboBox<>(item);
        cb.setBounds(100, 70, 200, 90);
        l.setBounds(200, 70, 200, 20);
        f.add(l);
        f.add(cb);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cb.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent ie){
        String name=(String) cb.getSelectedItem();
        l.setText("Selected item is:"+name);
    }

    public static void main(String[] args) {
        new ItemDemo();
    }
}