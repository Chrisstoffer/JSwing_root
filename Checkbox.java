import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Checkbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JCheckBox box1 = new JCheckBox("SSC");
        JCheckBox box2 = new JCheckBox("HSC");
        JCheckBox box3 = new JCheckBox("B.Sc");
        JCheckBox box4 = new JCheckBox("B.pharma");

        box1.setBounds(100,50,120,20);
        box2.setBounds(100,100,120,20);
        box3.setBounds(100,150,120,20);
        box4.setBounds(100,200,120,20);

        frame.add(box1);
        frame.add(box2);
        frame.add(box3);
        frame.add(box4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}