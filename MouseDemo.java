import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseDemo implements MouseListener {

    JFrame f;
    JLabel l; 
    MouseDemo() {
       f=new JFrame();
       l=new JLabel("Entered");

        f.add(l);
        FlowLayout fl=new FlowLayout(FlowLayout.LEADING);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(fl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);
    }
    public void mouseEntered(MouseEvent m){
        l.setText("Mouse Entered.");
    }

    public void mouseExited(MouseEvent m){
        l.setText("Mouse Exited.");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked ");
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}