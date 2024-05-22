import java.awt.*;
import javax.swing.*;

// Create simple/first GUI window
public class TopLevelWindow {
    
    private static void createWindow(){

        //Create and set up the window.
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel inside the window
        // Add the Panel to the window
        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);

        JLabel textLabel = new JLabel("I'm a label in the window and this is the first Login page", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        panel.add(textLabel, BorderLayout.CENTER);
        //frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        JButton loginButton = new JButton("Login to Bungie");
        loginButton.setPreferredSize(new Dimension(200, 100));
        panel.add(loginButton, BorderLayout.SOUTH);
        //frame.getContentPane().add(loginButton, BorderLayout.SOUTH);
        

        // Background Image that currently takes over the window.
        // JLabel imageHolder = new JLabel();
        // ImageIcon d2Icon = new ImageIcon("images/D2_Logo.png");
        // imageHolder.setIcon(d2Icon);
        // frame.getContentPane().add(imageHolder);

        // Display the Window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    
    }

    public static void main(String[] args){
        createWindow();
    }
}
