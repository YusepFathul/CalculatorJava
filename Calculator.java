package com.Project;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 


class Close extends WindowAdapter { 

    @Override
    public void windowClosing(WindowEvent d) {
        System.exit(0);
    }
}

class cal implements ActionListener {
    
    Frame frame1 = new Frame();
    
    Button btn0 = new Button("0");
    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");
    Button btn5 = new Button("5");
    Button btn6 = new Button("6");
    Button btn7 = new Button("7");
    Button btn8 = new Button("8");
    Button btn9 = new Button("9");
    Button btnAdd = new Button("+");
    Button btnSubtract = new Button("-");
    Button btnMultiply = new Button("*");
    Button btnDivide = new Button("/");
    Button btnEqual = new Button("=");
    Button btnClear = new Button("C");
    Button btnSqRt = new Button("SqRt");
    Button btnDot = new Button(".");
    Button btnNegativeMark = new Button("+/-");
    Button btnPercentage = new Button("%");
    
    
    Color darkButtonBack_for_numberPad = new Color(51, 51, 51);

    TextField result_textField = new TextField();

    String firstValue, secondValue, operator, copiedText;
    double firstDoubleValue, secondDoubleValue, Answer;
    int decimalCount = 0, zeroCount = 0;

    Panel pannel_north = new Panel();
    Panel pannel_north_sub1 = new Panel();
    Panel pannel_north_sub2 = new Panel();
    Panel pannel_center = new Panel();
    Panel pannel_east = new Panel();
    Panel pannel_west = new Panel();
    Panel pannel_south = new Panel();    
    
    cal() {

        frame1.addWindowListener(new Close());
        frame1.setBackground(Color.pink);
        frame1.setBounds(700, 200, 400, 600);
        frame1.setTitle("Calculator");
        frame1.setResizable(false);

        Font Segoe_UI_15 = new Font("Segoe UI", Font.PLAIN, 15);

        MenuBar menuBar = new MenuBar();        
        menuBar.setFont(Segoe_UI_15);

    
        Font Segoe_UI_24 = new Font("Segoe UI", 0, 24);
        Font Ebrima_24 = new Font("Ebrima", 0, 24);
        Font Segoe_UI_20 = new Font("Segoe UI", 0, 20);
        Font times_36 = new Font("Times New Roman", 0, 36);
        Font times_48 = new Font("Times New Roman", 0, 48);
        
        
        btn0.setFont(Segoe_UI_24);
        btn1.setFont(Segoe_UI_24);
        btn2.setFont(Segoe_UI_24);
        btn3.setFont(Segoe_UI_24);
        btn4.setFont(Segoe_UI_24);
        btn5.setFont(Segoe_UI_24);
        btn6.setFont(Segoe_UI_24);
        btn7.setFont(Segoe_UI_24);
        btn8.setFont(Segoe_UI_24);
        btn9.setFont(Segoe_UI_24);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(Segoe_UI_20);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);    
        
        btn0.setBackground(new Color(51, 51, 51));
        btn1.setBackground(new Color(51, 51, 51));
        btn2.setBackground(new Color(51, 51, 51));
        btn3.setBackground(new Color(51, 51, 51));
        btn4.setBackground(new Color(51, 51, 51));
        btn5.setBackground(new Color(51, 51, 51));
        btn6.setBackground(new Color(51, 51, 51));
        btn7.setBackground(new Color(51, 51, 51));
        btn8.setBackground(new Color(51, 51, 51));
        btn9.setBackground(new Color(51, 51, 51));
        btnDot.setBackground(new Color(51, 51, 51));
        btnNegativeMark.setBackground(new Color(51, 51, 51));
        btnEqual.setBackground(new Color(102, 198, 221));
        btnAdd.setBackground(Color.black);
        btnSubtract.setBackground(Color.black);
        btnSqRt.setBackground(Color.black);
        btnDivide.setBackground(Color.black);
        btnPercentage.setBackground(Color.black);
        btnClear.setBackground(Color.black);
        btnMultiply.setBackground(Color.black);
        btn0.setForeground(Color.WHITE);
        btn1.setForeground(Color.WHITE);
        GridLayout grid_sub1 = new GridLayout(1, 2, 10, 3);
        
        btn2.setForeground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        btn6.setForeground(Color.WHITE);
        btn7.setForeground(Color.WHITE);
        btn8.setForeground(Color.WHITE);
        btn9.setForeground(Color.WHITE);
        btnDot.setForeground(Color.WHITE);
        btnNegativeMark.setForeground(Color.WHITE);
        btnEqual.setForeground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        btnSubtract.setForeground(Color.WHITE);
        btnSqRt.setForeground(Color.WHITE);
        btnDivide.setForeground(Color.WHITE);
        btnPercentage.setForeground(Color.WHITE);
        btnClear.setForeground(Color.WHITE);        
        btnMultiply.setForeground(Color.WHITE);
        Font segeo_55 = new Font("Segoe UI", Font.PLAIN, 55);

        result_textField.setFont(segeo_55);
        result_textField.setEditable(false);
        result_textField.setBackground(Color.black);
        result_textField.setForeground(Color.white);        
        result_textField.setPreferredSize(new Dimension(370, 100));        
        result_textField.setText(" 0");
        result_textField.setFocusable(false);

        GridLayout grid_centerPanel = new GridLayout(5, 4, 3, 3);        
        FlowLayout flow1 = new FlowLayout(FlowLayout.CENTER, 0, 5);
        pannel_north.setLayout(flow1);    
        pannel_center.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pannel_north.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pannel_north_sub2.add(result_textField);
        pannel_north_sub1.setLayout(grid_sub1);      
        pannel_north.add(pannel_north_sub2);
        pannel_north.add(pannel_north_sub1);
        pannel_center.setLayout(grid_centerPanel);
        pannel_north.setBackground(Color.BLACK);
        pannel_center.setBackground(Color.BLACK);        
        pannel_east.setBackground(Color.BLACK);        
        pannel_west.setBackground(Color.BLACK);
        pannel_south.setBackground(Color.BLACK);
        pannel_north_sub1.setBackground(Color.BLACK);
        pannel_north_sub2.setBackground(Color.BLACK);
        pannel_north.setPreferredSize(new Dimension(300, 150));
        pannel_north_sub1.setPreferredSize(new Dimension(370, 50));

        pannel_center.add(btnClear);
        pannel_center.add(btnPercentage);
        pannel_center.add(btnSqRt);
        pannel_center.add(btnDivide);
        pannel_center.add(btn7);
        pannel_center.add(btn8);
        pannel_center.add(btn9);
        pannel_center.add(btnMultiply);
        pannel_center.add(btn4);
        pannel_center.add(btn5);
        pannel_center.add(btn6);
        pannel_center.add(btnSubtract);        
        pannel_center.add(btn1);
        pannel_center.add(btn2);
        pannel_center.add(btn3);
        pannel_center.add(btnAdd);
        pannel_center.add(btnNegativeMark);
        pannel_center.add(btn0);
        pannel_center.add(btnDot);        
        pannel_center.add(btnEqual);

        frame1.add(pannel_north, BorderLayout.NORTH);
        frame1.add(pannel_center, BorderLayout.CENTER);
        frame1.add(pannel_east, BorderLayout.EAST);
        frame1.add(pannel_west, BorderLayout.WEST);
        frame1.add(pannel_south, BorderLayout.SOUTH);
        
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDot.addActionListener(this);
        btnNegativeMark.addActionListener(this);
        btnEqual.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnSqRt.addActionListener(this);
        btnPercentage.addActionListener(this);
        btnClear.addActionListener(this);
               
        
        frame1.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object object1 = ae.getSource();
        
        if (object1.equals(btn0) & zeroCount != 0) {            
            result_textField.setText(result_textField.getText() + btn0.getLabel());
            
        } else if (object1.equals(btn1)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn1.getLabel()) : (result_textField.getText() + btn1.getLabel()));
            zeroCount++;
        } else if (object1.equals(btn2)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn2.getLabel()) : result_textField.getText() + btn2.getLabel());
            zeroCount++;
        } else if (object1.equals(btn3)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn3.getLabel()) : result_textField.getText() + btn3.getLabel());
            zeroCount++;
        } else if (object1.equals(btn4)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn4.getLabel()) : result_textField.getText() + btn4.getLabel());
            zeroCount++;
        } else if (object1.equals(btn5)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn5.getLabel()) : result_textField.getText() + btn5.getLabel());
            zeroCount++;
        } else if (object1.equals(btn6)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn6.getLabel()) : result_textField.getText() + btn6.getLabel());
            zeroCount++;
        } else if (object1.equals(btn7)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn7.getLabel()) : result_textField.getText() + btn7.getLabel());
            zeroCount++;
        } else if (object1.equals(btn8)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn8.getLabel()) : result_textField.getText() + btn8.getLabel());
            zeroCount++;
        } else if (object1.equals(btn9)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn9.getLabel()) : result_textField.getText() + btn9.getLabel());
            zeroCount++;
        } else if (object1.equals(btnDot) & decimalCount == 0) {
            decimalCount++;
            zeroCount++;
            result_textField.setText(result_textField.getText() + btnDot.getLabel());            
            
        } else if (object1.equals(btnAdd)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
                
            } else {                
                secondValue = result_textField.getText();                
                
                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                
                Answer = firstDoubleValue + secondDoubleValue;
                firstValue = "" + Answer;
                
            }
            result_textField.setText(" ");
            operator = btnAdd.getLabel();
            decimalCount = 0;
            
        } else if (object1.equals(btnSubtract)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();                
                
                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue - secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnSubtract.getLabel();
            decimalCount = 0;
            
        } else if (object1.equals(btnMultiply)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();                
                
                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue * secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnMultiply.getLabel();
            decimalCount = 0;
            
        } else if (object1.equals(btnDivide)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();                
                
                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue / secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnDivide.getLabel();
            decimalCount = 0;
            
        } else if (object1.equals(btnSqRt)) {
            firstValue = result_textField.getText();
            firstDoubleValue = Double.parseDouble(firstValue);
            Answer = Math.sqrt(firstDoubleValue);
            result_textField.setText(" " + Answer);            
            
        } else if (object1.equals(btnPercentage)) {
            secondValue = result_textField.getText();            
            
            firstDoubleValue = Double.parseDouble(firstValue);
            secondDoubleValue = Double.parseDouble(secondValue);
            
            if (operator == "/") {
                Answer = (firstDoubleValue / secondDoubleValue) * 100;
                result_textField.setText(" " + Answer);                
            }
            firstValue = null;
            decimalCount = 0;
        } else if (object1.equals(btnNegativeMark)) {
            if (zeroCount != 0 & Double.parseDouble(result_textField.getText()) > 0) {
                firstDoubleValue = Double.parseDouble(result_textField.getText());
                result_textField.setText(" -" + firstDoubleValue);
            }
        } else if (object1.equals(btnEqual)) {
            secondValue = result_textField.getText();            
            
            firstDoubleValue = Double.parseDouble(firstValue);
            secondDoubleValue = Double.parseDouble(secondValue);
            
            if (operator == "+") {
                Answer = firstDoubleValue + secondDoubleValue;
                result_textField.setText(" " + Answer);                
            } else if (operator == "-") {
                Answer = firstDoubleValue - secondDoubleValue;
                result_textField.setText(" " + Answer);                
            } else if (operator == "*") {
                Answer = firstDoubleValue * secondDoubleValue;
                result_textField.setText(" " + Answer);                
            } else if (operator == "/") {
                Answer = firstDoubleValue / secondDoubleValue;
                result_textField.setText(" " + Answer);                
            }
            
            firstValue = null;
            decimalCount = 0;
        } else if (object1.equals(btnClear)) {
            result_textField.setText(" 0");
            firstValue = null;
            secondValue = null;
            firstDoubleValue = 0;
            secondDoubleValue = 0;
            Answer = 0;
            decimalCount = 0;
            zeroCount = 0;
        } 
        
       
        throw new UnsupportedOperationException("Belum didukung ges.");
        
    }
    
}

public class Calculator {
    
    public static void main(String[] args) {
        cal cal = new cal();
    }
}

