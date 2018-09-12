import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ShowCalc implements ActionListener {
    private static JFrame window;
    private JTextField display;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, divBtn, mulBtn, addBtn, subBtn, del, clr, eqBtn, mMinusBtn, mPlussBtn, mBtn;

    public ShowCalc() {
        this.makeButtons();
        window.requestFocus();
    }

    public static void main(String[] args) {
        ShowCalc calculator = new ShowCalc();


    }
    String operator = "0";
    String number = "0";
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
            int numberA = Integer.parseInt(number);
            int numberB = Integer.parseInt(display.getText().substring(1));
            if(operator.equals("+")) {
                int result = numberA + numberB;
                display.setText(Integer.toString(result));
            }
            if(operator.equals("-")) {
                int result = numberA - numberB;
                display.setText(Integer.toString(result));
            }
            if(operator.equals("*")) {
                int result = numberA * numberB;
                display.setText(Integer.toString(result));
            }
            if(operator.equals("/")) {
                int result = numberA / numberB;
                display.setText(Integer.toString(result));
            }
        }
        if (e.getSource() == del) {
            display.setText("Dont think we need this btn");
        }
        if (e.getSource() == clr) {
            display.setText("");
            number = "0";
            operator = "0";
        }
        if (e.getSource() == mPlussBtn) {
            display.setText("M+");
        }
        if (e.getSource() == mMinusBtn) {
            display.setText("M_");
        }
        if (e.getSource() == mBtn) {
            display.setText("M");
        }
    }

    public void makeButtons() {
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
        del = new JButton("Delete");
        clr = new JButton("Clear");
        mPlussBtn = new JButton("M+");
        mMinusBtn = new JButton("M-");
        mBtn = new JButton("M");

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

        mBtn.setBounds(150, 270, 50, 100);
        mMinusBtn.setBounds(150, 420, 50, 50);
        mPlussBtn.setBounds(150, 370, 50, 50);
        divBtn.setBounds(200, 320, 50, 50);
        mulBtn.setBounds(250, 320, 50, 50);
        addBtn.setBounds(250, 270, 50, 50);
        subBtn.setBounds(200, 270, 50, 50);
        eqBtn.setBounds(200, 370, 100, 100);
        clr.setBounds(100, 420, 50, 50);

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
        del.addActionListener(this);
        clr.addActionListener(this);
        mPlussBtn.addActionListener(this);
        mMinusBtn.addActionListener(this);
        mBtn.addActionListener(this);

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


        display.setHorizontalAlignment(JTextField.RIGHT);
        Font font1 = new Font("SansSerif", Font.PLAIN, 20);
        display.setFont(font1);
        window.setLayout(null);
        window.setVisible(true);
        window.setSize(300, 500);
        window.setBackground(Color.gray);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
    }
}
