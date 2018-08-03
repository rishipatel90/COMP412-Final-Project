/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        UI.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-03-40
 *
 * @modifiedby  Achintha Gunasekara
 * @modifiedby  Kydon Chantzaridis
 * @modweb      http://www.achinthagunasekara.com
 * @modemail    contact@achinthagunasekara.com
 * @modemail    kchantza@csd.auth.gr
 */

package simplejavacalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI implements ActionListener {

    private final JFrame frame;
    private final JPanel panel,panel1;
    
    private final JTextArea text1;
    private final JTextArea text;
    public int condition=0;
    
    private final JButton but[], butAdd, butMinus, butMultiply, butDivide,
            butEqual, butCancel, butSquareRoot, butSquare, butPowerOfTen,
            butCos, butSin, butTan, butxpowerofy, butlog, butrate,butFact,butDivideOne,butnPr,butnCr,btnce,btnBackSpace;
    private final Calculator calc;

    private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9","." };

    public UI() {
        frame = new JFrame("Calculator PH");
        frame.setResizable(false);
        panel = new JPanel(new FlowLayout());
        panel1 = new JPanel(new FlowLayout());
        
        text1 = new JTextArea(2, 41);
        text = new JTextArea(2, 41);
        
        
        but = new JButton[11];
        for (int i = 0; i < 10; i++) {
            but[i] = new JButton(String.valueOf(i));
        }
        but[10] = new JButton(".");
        
        butAdd = new JButton("+");
        butMinus = new JButton("-");
        butMultiply = new JButton("*");
        butDivide = new JButton("/");
        butEqual = new JButton("=");
        butSquareRoot = new JButton("√");
        butSquare = new JButton("x*x");
        butPowerOfTen = new JButton("10^x");
        butCos = new JButton("Cos");
        butSin = new JButton("Sin");
        butTan = new JButton("Tan");
        butxpowerofy = new JButton("x^y");
        butlog = new JButton("log10(x)");
        butrate = new JButton("x%");
        butFact = new JButton("!n");
        butDivideOne = new JButton("1/x");
        butnPr = new JButton("nPr");
        butnCr = new JButton("nCr");
        btnce = new JButton("CE");
        btnBackSpace = new JButton("Backspace");

        butCancel = new JButton("C");

        calc = new Calculator();
        
    }

    public void init() {
        frame.setVisible(true);
        frame.setSize(500, 380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.add(panel1);
        panel1.setPreferredSize(new Dimension(480, 60));
        panel1.setBackground(Color.white);
        panel1.add(text1);
        panel1.add(text);
        text1.setEditable(true);
        
        
        panel.add(butSquare);
        panel.add(butSquareRoot);
        panel.add(butPowerOfTen);
        
       
        panel.add(btnce);
        
        
        panel.add(btnBackSpace);
        panel.add(butAdd);
        
        panel.add(butCos);
        panel.add(butSin);
        panel.add(butTan);
        
        
        panel.add(but[7]);
        panel.add(but[8]);
        panel.add(but[9]);
       
        panel.add(butMinus);
        
        panel.add(butxpowerofy);
        panel.add(butlog);
        panel.add(butrate);
        
        
        panel.add(but[4]);
        panel.add(but[5]);
        panel.add(but[6]);
        panel.add(butMultiply);
        
        panel.add(butFact);
        panel.add(butDivideOne);
        panel.add(butnPr);
        
        
        
        panel.add(but[1]);
        panel.add(but[2]);
        panel.add(but[3]);
        panel.add(butDivide);
        
        panel.add(butnCr);
                
        
        panel.add(but[0]);
        panel.add(but[10]);
        panel.add(butEqual);
        panel.add(butCancel);
        
       
        for (int i = 1; i < 11; i++) {
            
            but[i].setPreferredSize(new Dimension(62, 40));
            but[i].addActionListener(this);
            
        }
        but[0].setPreferredSize(new Dimension(129, 40));
        but[0].addActionListener(this);
        
        
        
        
        
        
        
        //adding size
        butSquare.setPreferredSize(new Dimension(62, 40));
        butSquareRoot.setPreferredSize(new Dimension(62, 40));
        butPowerOfTen.setPreferredSize(new Dimension(62, 40));
        butCos.setPreferredSize(new Dimension(62, 40));
        butSin.setPreferredSize(new Dimension(62, 40));
        butTan.setPreferredSize(new Dimension(62, 40));
        butxpowerofy.setPreferredSize(new Dimension(62, 40));
        butlog.setPreferredSize(new Dimension(62, 40));
        butrate.setPreferredSize(new Dimension(62, 40));
        butAdd.setPreferredSize(new Dimension(62, 40));
        butMinus.setPreferredSize(new Dimension(62, 40));
        butMultiply.setPreferredSize(new Dimension(62, 40));
        butDivide.setPreferredSize(new Dimension(62, 40));
        butEqual.setPreferredSize(new Dimension(62, 40));
        
        butFact.setPreferredSize(new Dimension(62, 40));
        butDivideOne.setPreferredSize(new Dimension(62, 40));
        
        butCancel.setPreferredSize(new Dimension(62, 40));
        
        
        butnPr.setPreferredSize(new Dimension(62, 40));
        butnCr.setPreferredSize(new Dimension(129, 40));
        btnce.setPreferredSize(new Dimension(62, 40));
        btnBackSpace.setPreferredSize(new Dimension(129, 40));
        //btnBackSpace.setFont(new Font("Arial", Font.PLAIN, 7));
        
        butAdd.addActionListener(this);
        butMinus.addActionListener(this);
        butMultiply.addActionListener(this);
        butDivide.addActionListener(this);
        butSquare.addActionListener(this);
        butSquareRoot.addActionListener(this);
        butPowerOfTen.addActionListener(this);
        butCos.addActionListener(this);
        butSin.addActionListener(this);
        butTan.addActionListener(this);
        butxpowerofy.addActionListener(this);
        butlog.addActionListener(this);
        butrate.addActionListener(this);
        butFact.addActionListener(this);
        butDivideOne.addActionListener(this);
        butnPr.addActionListener(this);
        butnCr.addActionListener(this);
        btnce.addActionListener(this);
        btnBackSpace.addActionListener(this);
        
        butEqual.addActionListener(this);
        butCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();

        for (int i = 0; i < 11; i++) {
            if (source == but[i]) {
                text.replaceSelection(buttonValue[i]);
                return;
            }
        }

        if (source == butAdd) {
            
            text1.setText(text.getText());
            writer(calc.calculateBi(Calculator.BiOperatorModes.add, reader()));
            
        }

        if (source == butMinus) {
            text1.setText(text.getText());
            writer(calc.calculateBi(Calculator.BiOperatorModes.minus, reader()));
        }

        if (source == butMultiply) {
            text1.setText(text.getText());
            writer(calc.calculateBi(Calculator.BiOperatorModes.multiply,
                reader()));
        }

        if (source == butDivide) {
            text1.setText(text.getText());
            writer(calc
                .calculateBi(Calculator.BiOperatorModes.divide, reader()));
        }
        if (source == butxpowerofy) {
            
            text1.setText(text.getText());
            writer(calc
                .calculateBi(Calculator.BiOperatorModes.xpowerofy, reader()));
        }
        if (source == butnPr) {
            text1.setText(text.getText());
            writer(calc
                .calculateBi(Calculator.BiOperatorModes.nPr, reader()));
        }
        if (source == butnCr) {
            text1.setText(text.getText());
            writer(calc
                .calculateBi(Calculator.BiOperatorModes.nCr, reader()));
        }
        
        
        
        
        

        if (source == butSquare) {
            
            writer(calc.calculateMono(Calculator.MonoOperatorModes.square,
                reader()));
        }

        if (source == butSquareRoot) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.squareRoot,
                reader()));
        }

        if (source == butPowerOfTen) {
            writer(calc.calculateMono(
                    Calculator.MonoOperatorModes.PowerOfTen, reader()));
        }

        if (source == butCos) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.cos,
                reader()));
        }

        if (source == butSin) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.sin,
                reader()));
        }

        if (source == butTan) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.tan,
                reader()));
        }
        if (source == butlog) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.log,
                reader()));
        }
         if (source == butrate) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.rate,
                reader()));
        }

        if (source == butEqual) {
           
            writer(calc.calculateEqual(reader()));
        }
        if (source == butFact) {

            writer(calc.calculateMono(Calculator.MonoOperatorModes.fact,
                reader()));
        }
        if (source == butDivideOne) {

            writer(calc.calculateMono(Calculator.MonoOperatorModes.butDivideOne,
                reader()));
        }
        
        if (source == btnBackSpace) {
            String str;
            str = text.getText();
           
            str = str.substring(0, str.length() - 1);
            
            text.setText(str);
            
        }

        if (source == butCancel) {
            writer(calc.reset());
            text1.setText("");
        }
        if (source == btnce) {
            
            text1.setText("");
            text.setText("");
        }

        text.selectAll();
    }

   public Double reader() {
        Double num;
        String str;
        str = text.getText();
        num = Double.valueOf(str);

        return num;
    }

    public void writer(final Double num) {
        if (Double.isNaN(num)) {
            text.setText("");
            
        } else {
            String str = Double.toString(num);
            if ((num - Math.floor(num) == 0)) {
                if( (str.indexOf('E'))>=0){
                 text.setText(Double.toString(num));   
                }else{
                int temp = (int) Math.round(num);
                
                text.setText(Integer.toString(temp)); 
                }
                
            }else{
                System.out.println(num);
                text.setText(Double.toString(num));
            }
            
            
        }
    }

   
}
