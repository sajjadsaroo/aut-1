package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you very much!");
        thankYouLabel.setBounds(10, 10, 200, 20);
        thankYouLabel.setFont(new Font("Arial",Font.PLAIN,13));


        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
