import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PAnel {
    public static void main(String[] args) {
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0x3000000));
        panel1.setBounds(0,0,250,250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0xfda002));
        panel2.setBounds(250,0,250,250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0x4556bd));
        panel3.setBounds(0,250,500,250);

        JLabel label1 = new JLabel();
        label1.setText("This is panel 1");
        label1.setForeground(Color.white);

        JLabel label2 = new JLabel();
        label2.setText("This is panel 2");
        label2.setForeground(Color.white);

        JLabel label3 = new JLabel();
        label3.setText("This is panel 3");
        label3.setForeground(Color.white);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750); //setting size for frame
        frame.setVisible(true); //visiablity for this frame
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
    }
}
