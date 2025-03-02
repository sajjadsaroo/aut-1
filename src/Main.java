import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی", SwingConstants.CENTER);
        title.setBounds(250, 200, 100, 20);

        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setBounds(250, 250, 100, 20);

        // Add components to the panel
        panel.setLayout(null);
        panel.add(title);
        panel.add(startButton);

        // Center components in the panel
        title.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setHorizontalAlignment(SwingConstants.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}