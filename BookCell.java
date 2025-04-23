import javax.swing.*;
import java.awt.*;

public class BookCell extends JFrame {
    JLabel label;
    JTable table;
    JScrollPane scrollPane;

    public BookCell() {
        // Create and style label
        label = new JLabel("Semester III Books List");
        label.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 28));
        label.setForeground(Color.BLUE);
        label.setBounds(300, 20, 400, 30);
        add(label);

        // Table column names and data
        String[] columnNames = {"Bookname", "Publication", "Author"};
        String[][] data = {
            {"Java", "xyz publication", "abc"},
            {"DSA", "xyz publication", "abc"},
            {"SAD", "xyz publication", "abc"},
            {"Statistics", "xyz publication", "abc"},
            {"WebTec", "xyz publication", "abc"}
        };

        // Create table
        table = new JTable(data, columnNames);
        
        table.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 18));
        table.setRowHeight(30);

        // Add table to scroll pane
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(150, 100, 600, 150);
        add(scrollPane);

        // Set frame properties
        setSize(900, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BookCell();
    }
}
