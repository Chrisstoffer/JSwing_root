import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame  {
    JButton button;
    Myframe()
    {
        button = new JButton("Press me");
        button.setFocusable(false);
        button.setBounds(200,100,200,50);
        button.addActionListener(e -> System.out.println("Boooh"));
        button.setBackground(Color.lightGray);
        button.setFont(new Font("Cambria",Font.BOLD,25));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
