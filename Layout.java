package Calc;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Layout extends JFrame implements KeyListener, ActionListener {
	
	
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,dec,eq,clr;
	JButton plus,minus,mult,div,mod,sin,cos,tan,cot,sec,cosec,sq,cube,logx,lnx,pi,bte,pow,sqrt,pn;
	double op1,op2;
	ScriptEngineManager mg = new ScriptEngineManager();
	ScriptEngine eg = mg.getEngineByName("JavaScript");
	JTextField ip;	
	Layout() {
		//frame properties
		setTitle("Calculator");
		setSize(600,500);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		
		//JPanel mainPanel = new JPanel();
		
		JPanel DigitsPanel = new JPanel();
        DigitsPanel.setLayout(new GridLayout(5,3));
        DigitsPanel.setBackground(Color.BLACK);
        
        JPanel OprPanel = new JPanel();
        OprPanel.setLayout(new GridLayout(4,5));
        OprPanel.setBackground(Color.BLACK);
        
        JPanel IpPanel = new JPanel();
        IpPanel.setLayout(new FlowLayout());
        IpPanel.setBackground(Color.BLACK);
        
        //Input text field
        ip = new JTextField("",20);
        ip.setBounds(5, 5, 250, 80);
        ip.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        ip.setText("0");
        ip.setBackground(Color.white);
        ip.addActionListener(this);
        IpPanel.add(ip);
        IpPanel.setBounds(5, 5, 350, 80);
        
        add(IpPanel);
        IpPanel.setVisible(true);        
        
		//digit buttons		
		bt1 = new JButton("1");
		bt2 = new JButton("2");	
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		bt0 = new JButton("0");
		dec = new JButton(".");	
		eq = new JButton("=");
		clr = new JButton("Clr");
		
		//opr buttons
		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		mod = new JButton("%");
		sin = new JButton("sin");
		cos = new JButton("cos");
		tan = new JButton("tan");
		cot = new JButton("cot");
		sec = new JButton("sec");
		cosec = new JButton("csc");
		sq = new JButton("x^2");
		cube = new JButton("x^3");
		logx = new JButton("log");
		lnx = new JButton("ln");
		pi = new JButton("pi");
		bte = new JButton("e");
		pow = new JButton("x^y");
		sqrt = new JButton("Sqrt");
		pn = new JButton("+/-");
		
		//adding digit buttons and DigitsPanel
		
		DigitsPanel.add(bt7);
		bt7.addActionListener(this);
		DigitsPanel.add(bt8);
		bt8.addActionListener(this);
		DigitsPanel.add(bt9);
		bt9.addActionListener(this);
		DigitsPanel.add(bt4);
		bt4.addActionListener(this);
		DigitsPanel.add(bt5);
		bt5.addActionListener(this);
		DigitsPanel.add(bt6);
		bt6.addActionListener(this);
		DigitsPanel.add(bt1);
		bt1.addActionListener(this);
		DigitsPanel.add(bt2);
		bt2.addActionListener(this);
		DigitsPanel.add(bt3);
		bt3.addActionListener(this);
		DigitsPanel.add(bt0);
		bt0.addActionListener(this);
		DigitsPanel.add(dec);
		dec.addActionListener(this);
		DigitsPanel.add(eq);
		eq.addActionListener(this);
		DigitsPanel.add(clr);
		clr.addActionListener(this);
		
		//adding DigitsPanel to frame
		
		DigitsPanel.setBounds(0, 100, 220, 300);
		add(DigitsPanel);	
		
		//adding opr buttons 
		
		OprPanel.add(plus);
		plus.addActionListener(this);
		OprPanel.add(minus);
		minus.addActionListener(this);
		OprPanel.add(mult);
		mult.addActionListener(this);
		OprPanel.add(div);
		div.addActionListener(this);
		OprPanel.add(mod);
		mod.addActionListener(this);
		OprPanel.add(sin);
		sin.addActionListener(this);
		OprPanel.add(cos);
		cos.addActionListener(this);
		OprPanel.add(tan);
		tan.addActionListener(this);
	    OprPanel.add(cot);
		cot.addActionListener(this);
		OprPanel.add(sec);
		sec.addActionListener(this);
		OprPanel.add(cosec);
		cosec.addActionListener(this);
		OprPanel.add(sq);
		sq.addActionListener(this);
		OprPanel.add(cube);
		cube.addActionListener(this);
		OprPanel.add(logx);
		logx.addActionListener(this);
		OprPanel.add(lnx);
		lnx.addActionListener(this);
		OprPanel.add(pi);
		pi.addActionListener(this);
		OprPanel.add(bte);
		bte.addActionListener(this);
		OprPanel.add(pow);
		pow.addActionListener(this);
		OprPanel.add(sqrt);
		sqrt.addActionListener(this);		
		OprPanel.add(pn);
		pn.addActionListener(this);
		
		//adding OprPanel to frame
		
		OprPanel.setBounds(300, 100, 290, 300);
		add(OprPanel);	
		
		
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setResizable(false);		
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==bt0) {
			
			ip.setText(ip.getText() + "0");
		}
		if(e.getSource()==bt1) {
			
			ip.setText(ip.getText() + "1");
		}
		if(e.getSource()==bt2) {
			ip.setText(ip.getText() + "2");
		}
		if(e.getSource()==bt3) {
			ip.setText(ip.getText() + "3");
		}
		if(e.getSource()==bt4) {
			ip.setText(ip.getText() + "4");
		}
		if(e.getSource()==bt5) {
			ip.setText(ip.getText() + "5");
		}
		if(e.getSource()==bt6) {
			ip.setText(ip.getText() + "6");
		}
		if(e.getSource()==bt7) {
			ip.setText(ip.getText() + "7");
		}
		if(e.getSource()==bt8) {
			ip.setText(ip.getText() + "8");
		}
		if(e.getSource()==bt9) {
			ip.setText(ip.getText() + "9");
		}
		if(e.getSource()==dec) {
			if(ip.getText().contains(".")) 
				return;
			ip.setText(ip.getText() + ".");
		}
		if(e.getSource()==clr) {
			ip.setText("");
		}
		if(e.getSource()==logx) {
			ip.setText(Double.toString(Math.log10(Double.parseDouble(ip.getText()))));
		}
		if(e.getSource()==sin) {
			ip.setText(Double.toString(Math.sin(Math.toRadians(Double.parseDouble(ip.getText())))));
		}
		if(e.getSource()==cos) {
			ip.setText(Double.toString(Math.cos(Math.toRadians(Double.parseDouble(ip.getText())))));
		}
		if(e.getSource()==tan) {
			ip.setText(Double.toString(Math.tan(Math.toRadians(Double.parseDouble(ip.getText())))));
		}
		if(e.getSource()==cot) {
			ip.setText(Double.toString(1.0/Math.tan(Math.toRadians(Double.parseDouble(ip.getText())))));
		}
		if(e.getSource()==sec) {
			ip.setText(Double.toString(1/Math.cos(Math.toRadians(Double.parseDouble(ip.getText())))));
		}
		if(e.getSource()==cosec) {
			ip.setText(Double.toString(1.0/Math.sin(Math.toRadians(Double.parseDouble(ip.getText())))));
		}
		if(e.getSource()==sq) {
			ip.setText(Double.toString(Math.pow(Double.parseDouble(ip.getText()) , 2)));
			if(ip.getText().endsWith(".0")) {
				ip.setText(ip.getText().replace(".0", ""));
			}
		}
		if(e.getSource()==cube) {
			ip.setText(Double.toString(Math.pow(Double.parseDouble(ip.getText()) , 3)));
			if(ip.getText().endsWith(".0")) {
				ip.setText(ip.getText().replace(".0", ""));
			}
		}
		if(e.getSource()==sqrt) {
			ip.setText(Double.toString(Math.pow(Double.parseDouble(ip.getText()) , 0.5)));
		}
		if(e.getSource()==pn) {
			ip.setText(Double.toString(Double.parseDouble(ip.getText())*(-1)));
			if(ip.getText().endsWith(".0")) {
				ip.setText(ip.getText().replace(".0", ""));
			}
		}
		if(e.getSource()==plus) {
			ip.setText(ip.getText()+"+");
		}
		if(e.getSource()==minus) {
			ip.setText(ip.getText()+"-");
		}
		if(e.getSource()==mult) {
			ip.setText(ip.getText()+"*");
		}
		if(e.getSource()==div) {
			ip.setText(ip.getText()+"/");
		}
		if(e.getSource()==mod) {
			ip.setText(ip.getText()+"%");
		}
		if(e.getSource()==eq) {
			equall();
		}
		if(e.getSource()==pi) {
			ip.setText(ip.getText()+Math.PI);
		}
		if(e.getSource()==bte) {
			ip.setText(ip.getText()+Math.E);
		}
		if(e.getSource()==lnx) {
			ip.setText(Double.toString(Math.log(Double.parseDouble(ip.getText()))));
		}
		if(e.getSource()==pow) {
			if(ip.getText().isEmpty())
				ip.setText("Math.pow(x,y)");
			else
				ip.setText("Math.pow("+ip.getText()+",y)");
				
		}
		
		
	}
	
	public void equall() {
		if(ip.getText()!="") {
			String txt = ip.getText();double res=0;
			try{
				res = Double.parseDouble(eg.eval(txt).toString());
			}
			catch(ScriptException se) {
				Logger.getLogger(Layout.class.getName()).log(Level.SEVERE, null, se); 
			}
			ip.setText(Double.toString(res));
			if(ip.getText().endsWith(".0")) {
				ip.setText(ip.getText().replace(".0", ""));
			}
			
		    
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) { 		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		  if(e.getKeyCode() == 13) {
		      equall();
		   }		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {		
	}
	
	public static void main(String arg[]) {
		new Layout();
		
	}
}
