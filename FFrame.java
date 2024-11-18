import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class main {
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BGC Trust University Bangladesh"); //setting name for frame 
        frame.setSize(200,200); //setting size for frame
        frame.setVisible(true); //visiablity for this frame 
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());  //custom logo for our frame
        frame.getContentPane().setBackground(new Color(107,142,35));    //custom color

    }
}
