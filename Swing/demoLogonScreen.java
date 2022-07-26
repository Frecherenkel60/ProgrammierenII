import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demoLogonScreen  {
    
    public static void main(String[] args) {
        // Create frames and panels + assign layouts
        var mainFrame = new JFrame();
        mainFrame.setTitle("Logon");
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var centerPanel = new JPanel(new FlowLayout());
        var bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        var centerLeftPanel = new JPanel(new GridLayout(5, 2));
        var centerRightPanel = new JPanel(new GridLayout(2, 2));
        Border etchedBorder = BorderFactory.createEtchedBorder();
        
        // Fill panel with content

        // Center left panel
        centerLeftPanel.add(new JLabel("User"));
        centerLeftPanel.add(new JTextField(5));
        centerLeftPanel.add(new JLabel("Passwort"));
        centerLeftPanel.add(new JTextField(8));
        centerLeftPanel.add(new JLabel("Art"));
        centerLeftPanel.add(new JComboBox<>(new String[]{"FTP", "Telnet", "SMTP", "HTTP"}));
        centerLeftPanel.add(new JLabel("Host"));
        centerLeftPanel.add(new JTextField(8));
        centerLeftPanel.add(new JLabel("Port"));
        centerLeftPanel.add(new JTextField(2));

        // Center right panel
        centerRightPanel.add(new JLabel("Quelle"));
        centerRightPanel.add(new JTextField("", 12));
        centerRightPanel.add(new JLabel("Ziel"));
        centerRightPanel.add(new JTextField("", 12));

        // Bottom panel
        var okButton = new JButton("OK"); // OK Button with anonymous inner class action listener
        okButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
            
        });
        bottomPanel.add(okButton);

        var cancelButton = new JButton("Cancel"); // Cancel button with lambda action listener
        cancelButton.addActionListener(e -> System.exit(0));
        bottomPanel.add(cancelButton);

        // Center panel
        centerPanel.add(centerLeftPanel, BorderLayout.WEST);
        centerPanel.add(centerRightPanel, BorderLayout.EAST);

        // Add content to frame
        mainFrame.add(centerPanel, BorderLayout.NORTH);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);

        // Set border
        centerLeftPanel.setBorder(BorderFactory.createTitledBorder(etchedBorder, "Verbindung"));
        centerRightPanel.setBorder(BorderFactory.createTitledBorder(etchedBorder, "Dateien"));

        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}