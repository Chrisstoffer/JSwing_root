import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class Textarea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextArea txtarea = new  JTextArea();
        txtarea.setBounds(100,100,400,200);
        txtarea.setText("Textarea to write paragraph");
        txtarea.setFont(new Font("cambria",Font.BOLD,25));
        txtarea.setLineWrap(true);
        
        frame.setLayout(null);
        frame.add(txtarea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,500);
        frame.setVisible(true);
    }
}