import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ShowCalc implements ActionListener {
    private JTextField display;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, divideBtn,
            multiplyBtn, addBtn, subtractBtn, clearBtn, equalsBtn, memoryMinusBtn, memoryPlussBtn,
            memoryBtn, clearMemoryBtn;
    private String operator = "0";
    private String number = "0";
    private long mtotal = 0;
    private Font font1 = new Font("SansSerif", Font.PLAIN, 20);

    public static void main(String[] args) {
        ShowCalc calculator = new ShowCalc();
        calculator.makeGUI();
    }

    // Checks witch button is clicked and preforms the appropriate action
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
        if (e.getSource() == divideBtn) {
            number = display.getText();
            display.setText("/");
            operator = display.getText();
        }
        if (e.getSource() == multiplyBtn) {
            number = display.getText();
            display.setText("*");
            operator = display.getText();
        }
        if (e.getSource() == subtractBtn) {
            number = display.getText();
            display.setText("-");
            operator = display.getText();
        }
        if (e.getSource() == addBtn) {
            number = display.getText();
            display.setText("+");
            operator = display.getText();
        }
        if (e.getSource() == equalsBtn) {
            long numberA;
            long numberB;
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
        if (e.getSource() == clearBtn) {
            display.setText("");
            number = "0";
            operator = "0";
        }
        if (e.getSource() == memoryPlussBtn) {
            mtotal = mtotal + Long.parseLong(display.getText());
        }
        if (e.getSource() == memoryMinusBtn) {
            mtotal = mtotal - Long.parseLong(display.getText());
        }
        if (e.getSource() == memoryBtn) {
            display.setText(Long.toString(mtotal));
        }
        if (e.getSource() == clearMemoryBtn) {
            mtotal = 0;
        }
    }

    // Makes the GUI
    private void makeGUI() {
        // Makes the frame, the textfield and the buttons
        JFrame window = new JFrame("Calculator");
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
        divideBtn = new JButton("/");
        multiplyBtn = new JButton("*");
        subtractBtn = new JButton("-");
        addBtn = new JButton("+");
        equalsBtn = new JButton("=");
        clearBtn = new JButton("Clear");
        memoryPlussBtn = new JButton("M+");
        memoryMinusBtn = new JButton("M-");
        memoryBtn = new JButton("M");
        clearMemoryBtn = new JButton("Mclr");

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
        memoryBtn.setBounds(150, 270, 50, 50);
        clearMemoryBtn.setBounds(150, 320, 50, 50);
        memoryPlussBtn.setBounds(150, 370, 50, 50);
        memoryMinusBtn.setBounds(150, 420, 50, 50);
        divideBtn.setBounds(200, 320, 50, 50);
        multiplyBtn.setBounds(250, 320, 50, 50);
        addBtn.setBounds(250, 270, 50, 50);
        subtractBtn.setBounds(200, 270, 50, 50);
        equalsBtn.setBounds(200, 370, 100, 100);
        clearBtn.setBounds(100, 420, 50, 50);

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
        divideBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        subtractBtn.addActionListener(this);
        addBtn.addActionListener(this);
        equalsBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        memoryPlussBtn.addActionListener(this);
        memoryMinusBtn.addActionListener(this);
        memoryBtn.addActionListener(this);
        clearMemoryBtn.addActionListener(this);

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
        window.add(clearBtn);
        window.add(memoryMinusBtn);
        window.add(memoryPlussBtn);
        window.add(equalsBtn);
        window.add(divideBtn);
        window.add(addBtn);
        window.add(subtractBtn);
        window.add(multiplyBtn);
        window.add(memoryBtn);
        window.add(clearMemoryBtn);

        // Sets some properties to the Window, font, size etc..
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
