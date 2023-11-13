import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Easy1 implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;

        private JMenuBar mb;
        private JMenu file, edit, help, back;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
        private int WIDTH=800;
        private int HEIGHT=700;


        public Easy1() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Easy1 swingControlDemo = new Easy1();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new GridLayout(2, 3 ));

            //menu at top


            //end menu at top

            ta = new JTextArea();
            ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);


            statusLabel = new JLabel("", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });

            //controlPanel.setLayout(new GridLayout()); //set the layout of the pannel


            mainFrame.setVisible(true);
        }

        private void showEventDemo() {

            JButton okButton = new JButton("Button 1");
            JButton submitButton = new JButton("Button 2");
            JButton cancelButton = new JButton("Button 3");
            JButton jessieButton = new JButton("Button 4");
            JButton susieButton = new JButton("Button 5");

            okButton.setActionCommand("Button 1");
            submitButton.setActionCommand("Button 2");
            cancelButton.setActionCommand("Button 3");
            jessieButton.setActionCommand("Button 4");
            susieButton.setActionCommand("Button 5");

            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());
            jessieButton.addActionListener(new ButtonClickListener());
            susieButton.addActionListener(new ButtonClickListener());

            mainFrame.add(okButton);
            mainFrame.add(submitButton);
            mainFrame.add(cancelButton);
            mainFrame.add(jessieButton);
            mainFrame.add(susieButton);

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

                if (command.equals("Button 1")) {
                    statusLabel.setText("Button 1 clicked.");
                } else if (command.equals("Button 2")) {
                    statusLabel.setText("Button 2 clicked.");
                } else if(command.equals("Button 3")){
                    statusLabel.setText("Button 3 clicked.");
                } else{
                    statusLabel.setText("Cancel Button clicked.");
                }
            }
        }

    }
