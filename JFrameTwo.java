import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JFrameTwo {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JTextField textField;
    private JPasswordField passwordField;
    

    public JFrameTwo() {
        execute();
    }

    public void execute() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout(10,10));
        frame.setLocationRelativeTo(null);

        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(10);
        layout.setVgap(10);
        frame.setLayout(layout);

        label = new JLabel("Enter your password");

        passwordField = new JPasswordField(10);

        passwordField.setText("shina123");

        
        button = new JButton("Check");


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                char [] pf =   passwordField.getPassword();
                String value = new String(pf);
                System.out.println("Password "+ value);
            }
        });

        frame.add(label);
        frame.add(button);
        frame.add(passwordField);

        frame.setVisible(true);
    }
    

      

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameTwo();
            }
        });
    }
}
