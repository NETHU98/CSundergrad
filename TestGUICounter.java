import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGUICounter {
    static JFrame frame_1;
    static JButton start_val, add_1, minus_1, reset_1;
    static JLabel label_0, label_1, label_num;
    static JTextField text_1;
    static int iCounter=0;
    static JPanel panel_center, panel_south;

    public static void main(String[] args) {
        frame_1 = new JFrame("LAB9 GUI Counter");
        frame_1.setLayout(new FlowLayout());

        label_0 = new JLabel("Input counter start:");
        text_1 = new JTextField("0",3);
        label_1 = new JLabel("Value is:");
        label_num = new JLabel("0");
        start_val = new JButton("Set counter start");
        add_1 = new JButton("Add 1");
        minus_1 = new JButton("Delete 1");
        reset_1 = new JButton("Reset");


        // add the labels, textfield, buttons in the proper
        // order to look like the example GUI in the instructions
        // setup all buttons to use the "ButtonListener()" class for ActionEvents
        // Notice what happens when you resize the main JFrame window...
        label_1 = new JLabel("Value is: ");
        text_1 = new JTextField(10);
        label_num = new JLabel("0");

        ButtonListener buttonListener = new ButtonListener();

        add_1.addActionListener(buttonListener);
        minus_1.addActionListener(buttonListener);
        reset_1.addActionListener(buttonListener);
        start_val.addActionListener(buttonListener);

        panel_center.add(text_1);
        panel_center.add(label_1);
        panel_center.add(label_num);

        panel_south.add(start_val);
        panel_south.add(add_1);
        panel_south.add(minus_1);
        panel_south.add(reset_1);

        frame_1.add(panel_center, BorderLayout.CENTER);
        frame_1.add(panel_south, BorderLayout.SOUTH);


        frame_1.setSize(300, 100);
        frame_1.setVisible(true);
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // write code here to test which of the 4 buttons
            // have been clicked using 'e.getSource().equals...'
            // or 'e.getSource()==...'
            // very similar to the demonstration I did in class lecture
            JButton button = (JButton) e.getSource();


            // you have to convert it to an integer to give the value to 'iCounter'
            // and to convert an integer to a string, use 'Integer.parseInt(string variable)'

            // very similar to the demonstration I did in class lecture

            
            // First, when 'start_val' clicked, then get the value from the 'text_1'
            // text box (user 'getText()' method) and set the 'label_num' and the
            if (e.getSource().equals(start_val)) {

                label_num.setText(text_1.getText());


                iCounter = Integer.parseInt(text_1.getText());
            }

            if (e.getSource().equals(add_1)) {
                // iCounter to be that value. Next, in the if 'add_1' clicked, then
                // add 1 to the 'iCounter' and update label: 'label_num' and if
                iCounter++;

                label_num.setText(String.valueOf(iCounter));
            }
            // the 'minus_1' is clicked, delete 1 from iCounter and update
            // the 'label_num'
            // Then, if 'reset_1' is clicked, set sever things blank and back to zero.
            // HINT: when you get the value from a JTextField, it is a string, so
            if (e.getSource().equals(minus_1)) {

                iCounter--;

                label_num.setText(String.valueOf(iCounter));
            }

            else if (e.getSource().equals(reset_1)) {
                iCounter = 0;
                label_num.setText("");
                text_1.setText("");
            }

        }
    }
}