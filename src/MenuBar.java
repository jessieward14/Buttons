import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MenuBar implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help, back;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextField t1;
    private JTextField t2;
    private int WIDTH = 800;
    private int HEIGHT = 700;


    public MenuBar() {
        prepareGUI();
    }

    public static void main(String[] args) {
        MenuBar swingControlDemo = new MenuBar();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        back = new JMenu("Back");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        mb.add(back);
        //end menu at top

        t1 = new JTextField("URL:");
        t2 = new JTextField("Keyword:");
        t1.setBounds(8, 1, WIDTH - 10, HEIGHT - 2);
        t2.setBounds(8, 1, WIDTH - 10, HEIGHT - 2);

        mainFrame.add(mb);  //add menu bar
        mainFrame.add(t1);//add typing area
        mainFrame.add(t2);//add typing area
        mainFrame.setJMenuBar(mb); //set menu bar


        statusLabel = new JLabel("hi", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout()); //set the layout of the pannel

        mainFrame.add(controlPanel, BorderLayout.NORTH);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton enterButton = new JButton("Search");

        enterButton.setActionCommand("Search");

        enterButton.addActionListener(new ButtonClickListener());


        controlPanel.add(t1);
        controlPanel.add(t2);
        controlPanel.add(enterButton);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            t1.cut();
        if (e.getSource() == paste)
            t1.paste();
        if (e.getSource() == copy)
            t1.copy();
        if (e.getSource() == selectAll)
            t1.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Search")) {
                statusLabel.setText("Results");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else if (command.equals("Dance")) {
                statusLabel.setText("Jessie Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}

