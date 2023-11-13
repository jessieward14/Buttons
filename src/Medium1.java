import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


    public class Medium1 implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;

        private JLabel statusLabel2;
        private JPanel controlPanel;
        private int WIDTH=800;
        private int HEIGHT=700;


        public Medium1() {
            prepareGUI();
        }

        public static void main(String[] args) {
           Medium1 swingControlDemo = new Medium1();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());

            //menu at top




            statusLabel = new JLabel("Label 1", JLabel.CENTER);
            statusLabel.setSize(350, 100);
            statusLabel2 = new JLabel("Label 2", JLabel.CENTER);
            statusLabel2.setSize(350, 100);


            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(2,4)); //set the layout of the pannel


           // mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }

        private void showEventDemo() {

            JButton okButton = new JButton("Button 2");
            JButton submitButton = new JButton("Button 3");
            JButton cancelButton = new JButton("Button 4");
            JButton jessieButton = new JButton("Button 5");
            JButton Button1 = new JButton("Button 1");

            okButton.setActionCommand("Button 2");
            submitButton.setActionCommand("Button 3");
            cancelButton.setActionCommand("Button 4");
            jessieButton.setActionCommand("Button 5");
            Button1.setActionCommand("Button 1");

            okButton.addActionListener(new Medium1.ButtonClickListener());
            submitButton.addActionListener(new Medium1.ButtonClickListener());
            cancelButton.addActionListener(new Medium1.ButtonClickListener());
            jessieButton.addActionListener(new Medium1.ButtonClickListener());
            Button1.addActionListener(new Medium1.ButtonClickListener());


            mainFrame.add(submitButton,BorderLayout.SOUTH);
            controlPanel.add(okButton);
            controlPanel.add(statusLabel);
            controlPanel.add(cancelButton);
            controlPanel.add(statusLabel2);
            controlPanel.add(jessieButton);
            mainFrame.add(Button1,BorderLayout.NORTH);
            mainFrame.add(controlPanel);
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

                if (command.equals("Button 2")) {
                    statusLabel.setText("Label 1");
                } else if (command.equals("Button 4")) {
                    statusLabel.setText("Label 2");
                } else if(command.equals("Dance")){
                    statusLabel.setText("Jessie Button clicked.");
                } else{
                    statusLabel.setText("Cancel Button clicked.");
                }
            }
        }


    }
