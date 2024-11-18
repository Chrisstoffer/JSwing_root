import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordF {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPasswordField pass = new JPasswordField();
        JButton button = new JButton("login");
        button.setBounds(100,100,100,20);


        pass.setBounds(100,50,200,30);
        pass.setText("password");
        pass.setEchoChar('*');
        pass.setFont(new Font("consolas",Font.PLAIN,25));
        //pass.setEchoChar((char)0);    to show the password
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        frame.setLayout(null);
        frame.add(pass);
        frame.add(button);
        frame.setVisible(true);
    }
    
}
