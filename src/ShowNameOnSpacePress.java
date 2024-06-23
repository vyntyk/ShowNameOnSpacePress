import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShowNameOnSpacePress {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Press Space Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JLabel instructionLabel = new JLabel("Enter your name and press Space", SwingConstants.CENTER);
        frame.add(instructionLabel, BorderLayout.NORTH);

        JTextField nameField = new JTextField();
        frame.add(nameField, BorderLayout.CENTER);

        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    String name = nameField.getText().trim();
                    if (!name.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Your Name: " + name);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter your name first.");
                    }
                }
            }
        });

        frame.setVisible(true);
        nameField.requestFocusInWindow();
    }
}
