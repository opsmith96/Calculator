import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ShowCalc implements ActionListener {
    private static JFrame window;
    private JTextField display;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, divBtn,
            mulBtn, addBtn, subBtn,  clr, eqBtn, mMinusBtn, mPlussBtn, mBtn, mClrBtn;
    private String operator = "0";
    private String number = "0";
    private long mtotal = 0;

    public static void main(String[] args) {
        ShowCalc calculator = new ShowCalc();
    }

    public ShowCalc() {
        this.makeGUI();
    }

    // Checks with button is clicked and preforms the appropriate action
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == one) {
            display.setText(display.getText().concat("1"));
        }
        if (e.getSource() == two) {
            display.setText(display.getText().concat("2"));
        }
        if (e.getSource() == three) {
            display.setText(display.getText().concat("3"));
        }
        if (e.getSource() == four) {
            display.setText(display.getText().concat("4"));
        }
        if (e.getSource() == five) {
            display.setText(display.getText().concat("5"));
        }
        if (e.getSource() == six) {
            display.setText(display.getText().concat("6"));
        }
        if (e.getSource() == seven) {
            display.setText(display.getText().concat("7"));
        }
        if (e.getSource() == eight) {
            display.setText(display.getText().concat("8"));
        }
        if (e.getSource() == nine) {
            display.setText(display.getText().concat("9"));
        }
        if (e.getSource() == zero) {
            display.setText(display.getText().concat("0"));
        }
        if (e.getSource() == divBtn) {
            number = display.getText();
            display.setText("/");
            operator = display.getText();
        }
        if (e.getSource() == mulBtn) {
            number = display.getText();
            display.setText("*");
            operator = display.getText();
        }
        if (e.getSource() == subBtn) {
            number = display.getText();
            display.setText("-");
            operator = display.getText();
        }
        if (e.getSource() == addBtn) {
            number = display.getText();
            display.setText("+");
            operator = display.getText();
        }
        if (e.getSource() == eqBtn) {
            long numberA = 0;
            long numberB = 0;
            try {
                numberA = Long.parseLong(number);
                numberB = Long.parseLong(display.getText().substring(1));
            } catch (Exception ex) {
                display.setText("Number too large");
                return;
            }
            if (operator.equals("+")) {
                try {
                    long result = numberA + numberB;
                    display.setText(Long.toString(result));
                } catch (Exception ex) {
                    display.setText("Number too large");
                    return;
                }
            }
            if (operator.equals("-")) {
                try {
                    long result = numberA - numberB;
                    display.setText(Long.toString(result));
                } catch (Exception ex) {
                    display.setText("Number too large");
                    return;
                }
            }
            if (operator.equals("*")) {
                try {
                    long result = numberA * numberB;
                    display.setText(Long.toString(result));
                } catch (Exception ex) {
                    display.setText("Number too large");
                    return;
                }
            }
            if (operator.equals("/")) {
                try {
                    long result = numberA / numberB;
                    display.setText(Long.toString(result));
                } catch (Exception ex) {
                    display.setText("Number too large");
                    return;
                }
            }
        }
        if (e.getSource() == clr) {
            display.setText("");
            number = "0";
            operator = "0";
        }
        if (e.getSource() == mPlussBtn) {
            mtotal = mtotal + Long.parseLong(display.getText());
        }
        if (e.getSource() == mMinusBtn) {
            mtotal = mtotal - Long.parseLong(display.getText());
        }
        if (e.getSource() == mBtn) {
            display.setText(Long.toString(mtotal));
        }
        if (e.getSource() == mClrBtn) {
            mtotal = 0;
        }
    }

    // Makes the GUI
    private void makeGUI() {
        Font font1 = new Font("SansSerif", Font.PLAIN, 20);

        // Makes the frame, the textfield and the buttons
        window = new JFrame("Calculator");
        display = new JTextField();
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        divBtn = new JButton("/");
        mulBtn = new JButton("*");
        subBtn = new JButton("-");
        addBtn = new JButton("+");
        eqBtn = new JButton("=");
        clr = new JButton("Clear");
        mPlussBtn = new JButton("M+");
        mMinusBtn = new JButton("M-");
        mBtn = new JButton("M");
        mClrBtn = new JButton("Mclr");

        // Sets position and size on all items
        display.setBounds(0, 200, 300, 60);
        one.setBounds(0, 370, 50, 50);
        two.setBounds(50, 370, 50, 50);
        three.setBounds(100, 370, 50, 50);
        four.setBounds(0, 320, 50, 50);
        five.setBounds(50, 320, 50, 50);
        six.setBounds(100, 320, 50, 50);
        seven.setBounds(0, 270, 50, 50);
        eight.setBounds(50, 270, 50, 50);
        nine.setBounds(100, 270, 50, 50);
        zero.setBounds(0, 420, 100, 50);
        mBtn.setBounds(150, 270, 50, 50);
        mClrBtn.setBounds(150, 320, 50, 50);
        mPlussBtn.setBounds(150, 370, 50, 50);
        mMinusBtn.setBounds(150, 420, 50, 50);
        divBtn.setBounds(200, 320, 50, 50);
        mulBtn.setBounds(250, 320, 50, 50);
        addBtn.setBounds(250, 270, 50, 50);
        subBtn.setBounds(200, 270, 50, 50);
        eqBtn.setBounds(200, 370, 100, 100);
        clr.setBounds(100, 420, 50, 50);

        // Add ActionListner to each button
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        divBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        subBtn.addActionListener(this);
        addBtn.addActionListener(this);
        eqBtn.addActionListener(this);
        clr.addActionListener(this);
        mPlussBtn.addActionListener(this);
        mMinusBtn.addActionListener(this);
        mBtn.addActionListener(this);
        mClrBtn.addActionListener(this);

        // Adds all buttons and textfields to the window
        window.add(display);
        window.add(zero);
        window.add(one);
        window.add(two);
        window.add(three);
        window.add(four);
        window.add(five);
        window.add(six);
        window.add(seven);
        window.add(eight);
        window.add(nine);
        window.add(clr);
        window.add(mMinusBtn);
        window.add(mPlussBtn);
        window.add(eqBtn);
        window.add(divBtn);
        window.add(addBtn);
        window.add(subBtn);
        window.add(mulBtn);
        window.add(mBtn);
        window.add(mClrBtn);

        //
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(font1);
        window.setLayout(null);
        window.setVisible(true);
        window.setSize(300, 500);
        window.setBackground(Color.gray);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.requestFocus();

    }
}
