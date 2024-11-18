import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;

public class Combbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("COMBOBOX");
        String city[] = {"Chittagong", "Dhaka", "Rajshashi","Sylhet","Khulna"};
        JButton button = new JButton("Select");
        button.setBounds(300,100,100,30);
        JLabel lebel = new JLabel();
        lebel.setBounds(100,150,100,30);
       
        JComboBox box1 = new JComboBox<>(city);
        box1.setBounds(100,100,100,30);
        box1.setEditable(true);
        box1.setSelectedIndex(0);
        frame.add(lebel);
        frame.add(button);
        frame.add(box1);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String item = (String) box1.getSelectedItem();
            lebel.setText(item);
            }
        });
    }
}
