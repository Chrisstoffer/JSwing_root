import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Rdbutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton");
       
        JRadioButton butt1 = new JRadioButton("Student");
        JRadioButton butt2 = new JRadioButton("Teacher");

        JRadioButton butt3 = new JRadioButton("1st - 2nd");
        JRadioButton butt4 = new JRadioButton("3rd - 4th");
        JRadioButton butt5 = new JRadioButton("5th - 6th");
        JRadioButton butt6 = new JRadioButton("7th - 8th");
       
        butt1.setBounds(100,50,100,20);
        butt2.setBounds(200,50,100,20);
        butt3.setBounds(100,100,100,20);
        butt4.setBounds(200,100,100,20);
        butt5.setBounds(100,150,100,20);
        butt6.setBounds(200,150,100,20);
      
        ButtonGroup Identity = new ButtonGroup();
        Identity.add(butt1);
        Identity.add(butt2);
        ButtonGroup sem = new ButtonGroup();
        sem.add(butt3);
        sem.add(butt4);
        sem.add(butt5);
        sem.add(butt6);

        frame.add(butt1);
        frame.add(butt2);
        frame.add(butt3);
        frame.add(butt4);
        frame.add(butt5);
        frame.add(butt6);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
