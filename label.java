import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("aa.jpg"); //
        Border broder = BorderFactory.createLineBorder(Color.cyan,5);
         
        JLabel lable = new JLabel();   //creating new label
        lable.setText("Bro do some code!");//ADDING TEXT TO THE LEBEL
        
        lable.setIcon(image);   //set image on label
        lable.setHorizontalTextPosition(JLabel.CENTER); //text positioning
        lable.setVerticalTextPosition(JLabel.TOP);      //tex positioning
        lable.setForeground(new Color (107,142,35));    //set font color
        lable.setFont(new Font("Helvetica",Font.PLAIN,30));  //set font of text
        lable.setIconTextGap(20);
        lable.setBackground(Color.black);   //to set backgroud color
        lable.setOpaque(true);  //to display backgroud color
        lable.setBorder(broder);
        lable.setVerticalAlignment(JLabel.CENTER);
        lable.setHorizontalAlignment(JLabel.CENTER);
       lable.setBounds(0,0,300,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
        frame.setSize(420,420); //setting size for frame
        frame.setVisible(true); //visiablity for this frame 
        frame.add(lable);
    }
}
