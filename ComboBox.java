import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox { 
    JFrame f;
    JComboBox<String> cb; 
    
    public ComboBox() {
        f = new JFrame();
        String[] str = {"Nepal", "USA", "UAE", "India"}; 
        cb = new JComboBox<>(str); 
        cb.setBounds(100, 80, 100, 30); 
        f.add(cb); 
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
