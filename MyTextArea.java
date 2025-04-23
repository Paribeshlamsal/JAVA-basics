import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyTextArea {

    JTextArea ta;

    MyTextArea() {
        JFrame f = new JFrame("TextArea");
        ta = new JTextArea("Hello There");
        // ta.setEditable(false); // Uncomment this line if you want the text to be read-only
        ta.setBounds(160, 90, 60, 30);
        f.add(ta);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyTextArea();
    }
}