import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Easy2 implements ActionListener {
        private JFrame mainFrame;


        private JMenu Button1;

        private int WIDTH=800;
        private int HEIGHT=700;


        public Easy2() {prepareGUI();
        }

        public static void main(String[] args) {
            Easy2 swingControlDemo = new Easy2();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());
          //  mainFrame.add(Button1, BorderLayout.NORTH);

            //menu at top






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

            okButton.setActionCommand("Button 2");
            submitButton.setActionCommand("Button 3");
            cancelButton.setActionCommand("Button 4");
            jessieButton.setActionCommand("Button 5");
            Button1.setActionCommand("Button 1");

            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());
            jessieButton.addActionListener(new ButtonClickListener());
            Button1.addActionListener(new ButtonClickListener());

            mainFrame.add(okButton,BorderLayout.EAST);
            mainFrame.add(submitButton, BorderLayout.SOUTH);
            mainFrame.add(cancelButton, BorderLayout.WEST);
            mainFrame.add(jessieButton, BorderLayout.CENTER);
            mainFrame.add(Button1, BorderLayout.NORTH);

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
