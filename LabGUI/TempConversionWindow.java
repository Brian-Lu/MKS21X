import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;
    private JButton c, f;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	c = new JButton("Celcius to Fahrenheit");
	c.addActionListener(this);
	c.setActionCommand("Celcius-Fahrenheit");
	f = new JButton("Fahrenheit to Celcius");
	f.addActionListener(this);
	f.setActionCommand("Fahrenheit-Celcius");
	t = new JTextField(10);
	j = new JLabel("Temperature is  ", null, JLabel.CENTER);
	pane.add(c);
	pane.add(t);
	pane.add(f);
	pane.add(j);
    }
    public static double CtoF (double temp) {
	return (temp * 1.8) + 32;
    }
    public static double FtoC (double temp) {
	return (temp - 32) / 1.8;
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	double init = Double.parseDouble(t.getText());
	String setter;
	double converted;
	if(event.equals("Celcius-Fahrenheit")){
	    converted = CtoF(init);
	    setter=String.valueOf(converted);
	    j.setText(setter);
	}
	if(event.equals("Fahrenheit-Celcius")){
	    converted = FtoC(init);
	    setter=String.valueOf(converted);
	    j.setText(setter);
	}
  
    }
}


