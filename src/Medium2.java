import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



    public class Medium2 implements ActionListener {
        private JFrame mainFrame;
        private JPanel controlPanel;

        private JMenu Button1;

        private JLabel statusLabel;

        private int WIDTH=800;
        private int HEIGHT=700;


        public Medium2() {prepareGUI();
        }

        public static void main(String[] args) {
            Medium2 swingControlDemo = new Medium2();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new GridLayout(3,3));
            controlPanel = new JPanel();
            controlPanel.setLayout(new BorderLayout());
            //  mainFrame.add(Button1, BorderLayout.NORTH);

            //menu at top



            statusLabel = new JLabel("Label 1", JLabel.CENTER);
            statusLabel.setSize(350, 100);


            //end menu at top



            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });

        }

        private void showEventDemo() {

            JButton okButton = new JButton("Button 2");
            JButton submitButton = new JButton("Button 3");
            JButton cancelButton = new JButton("Button 4");
            JButton jessieButton = new JButton("Button 5");
            JButton Button1 = new JButton("Button 1");
            JButton Button6 = new JButton("Button 6");
            JButton Button7 = new JButton("Button 7");
            JButton Button8 = new JButton("Button 8");
            JButton Button9 = new JButton("Button 9");
            JButton Button10 = new JButton("Button 10");

            okButton.setActionCommand("Button 2");
            submitButton.setActionCommand("Button 3");
            cancelButton.setActionCommand("Button 4");
            jessieButton.setActionCommand("Button 5");
            Button1.setActionCommand("Button 1");
            Button6.setActionCommand("Button 6");
            Button7.setActionCommand("Button 7");
            Button8.setActionCommand("Button 8");
            Button9.setActionCommand("Button 9");
            Button10.setActionCommand("Button 10");



            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());
            jessieButton.addActionListener(new ButtonClickListener());
            Button1.addActionListener(new ButtonClickListener());

            mainFrame.add(Button1);
            mainFrame.add(okButton);
            mainFrame.add(submitButton);
            mainFrame.add(cancelButton);
            controlPanel.add(Button9,BorderLayout.EAST);
            controlPanel.add(Button10,BorderLayout.SOUTH);
            controlPanel.add(statusLabel);
            mainFrame.add(controlPanel);
            mainFrame.add(jessieButton);
            mainFrame.add(Button6);
            mainFrame.add(Button7);
            mainFrame.add(Button8);



            mainFrame.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
           /* if (e.getSource() == cut)
                ta.cut();
            if (e.getSource() == paste)
                ta.paste();
            if (e.getSource() == copy)
                ta.copy();
            if (e.getSource() == selectAll)
                ta.selectAll();*/
        }

        private class ButtonClickListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

              /*  if (command.equals("OK")) {
                    statusLabel.setText("Ok Button clicked.");
                } else if (command.equals("Submit")) {
                    statusLabel.setText("Submit Button clicked.");
                } else if(command.equals("Dance")){
                    statusLabel.setText("Jessie Button clicked.");
                } else{
                    statusLabel.setText("Cancel Button clicked.");
                }*/
            }
        }

    }


