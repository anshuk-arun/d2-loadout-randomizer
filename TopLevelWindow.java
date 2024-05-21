import java.awt.*;
import javax.swing.*;

// Create simple/first GUI window
public class TopLevelWindow {
    
    private static void createWindow(){

        //Create and set up the window.
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("I'm a label in the window and this is the first Login page", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        JButton loginButton = new JButton("Login to Bungie");
        loginButton.setPreferredSize(new Dimension(200, 100));
        frame.getContentPane().add(loginButton, BorderLayout.SOUTH);


        JLabel imageHolder = new JLabel();
        //imageHolder.setIcon(makeImageIcon("MomentsOfTriumph2020.jpg"));
        frame.getContentPane().add(imageHolder);

        // Display the Window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    
    }

    public static void main(String[] args){
        createWindow();
    }
}
