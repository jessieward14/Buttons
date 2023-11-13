import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Easy2 implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JMenuBar mb;
        private JMenu Button1;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
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
            mainFrame.setLayout(new GridLayout(3, 1));

            //menu at top


            mb = new JMenuBar();
            Button1 = new JMenu("Button 1",JLabel.CENTER);

            mb.add(Button1);

            //end menu at top

            ta = new JTextArea();
            ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
            mainFrame.add(mb);  //add menu bar
            mainFrame.setJMenuBar(mb); //set menu bar


            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout()); //set the layout of the pannel

        }

        private void showEventDemo() {

            JButton okButton = new JButton("OK");
            JButton submitButton = new JButton("Submit");
            JButton cancelButton = new JButton("Cancel");
            JButton jessieButton = new JButton("Dance");

            okButton.setActionCommand("OK");
            submitButton.setActionCommand("Submit");
            cancelButton.setActionCommand("Cancel");
            jessieButton.setActionCommand("Dance");

            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());
            jessieButton.addActionListener(new ButtonClickListener());

            controlPanel.add(okButton);
            controlPanel.add(submitButton);
            controlPanel.add(cancelButton);
            controlPanel.add(jessieButton);

            mainFrame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cut)
                ta.cut();
            if (e.getSource() == paste)
                ta.paste();
            if (e.getSource() == copy)
                ta.copy();
            if (e.getSource() == selectAll)
                ta.selectAll();
        }

        private class ButtonClickListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if (command.equals("OK")) {
                    statusLabel.setText("Ok Button clicked.");
                } else if (command.equals("Submit")) {
                    statusLabel.setText("Submit Button clicked.");
                } else if(command.equals("Dance")){
                    statusLabel.setText("Jessie Button clicked.");
                } else{
                    statusLabel.setText("Cancel Button clicked.");
                }
            }
        }

    }
