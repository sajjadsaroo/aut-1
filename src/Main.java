import javax.swing.*;
import packages.informationPage;
import java.awt.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("survey form");
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
        JLabel title = new JLabel("survey form");
        title.setFont(new Font("Arial",Font.BOLD,13));
        title.setBounds(10, 10, 100, 20);

        // Create start button
        JButton startButton = new JButton("start!");
        startButton.setFont(new Font("Arial",Font.BOLD,13));
        startButton.setBounds(10, 40, 100, 20);

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