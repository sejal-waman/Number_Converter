//program to convert a number into binary,hexadecimal,and in octal form.

import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements ActionListener
{
   Label l1,l2,l3,l4;
   Button btnconvert,btnclear;
   TextField tf1,tf2,tf3,tf4;
   
   public static void main(String args[])
   {
   MyFrame m=new MyFrame();
   }
   
   MyFrame()
   {
   setTitle("GUI");
   setSize(500,500);
   setLayout(new GridLayout(5,2));
   
   l1=new Label("Enter a Number:");
   l1.setFont(new Font("Serif",Font.PLAIN,50));
   l1.setBackground(Color.YELLOW);
   add(l1);
   
   tf1=new TextField(10);
   tf1.setFont(new Font("Serif",Font.PLAIN,50));
   tf1.setBackground(Color.YELLOW);
   add(tf1);
   
   l2=new Label("Binary:");
   l2.setFont(new Font("Serif",Font.PLAIN,50));
   l2.setBackground(Color.CYAN);
   add(l2);
   
   tf2=new TextField(10);
   tf2.setFont(new Font("Serif",Font.PLAIN,50));
   tf2.setBackground(Color.CYAN);
   add(tf2);
   
   l3=new Label("Hexadecimal:");
   l3.setFont(new Font("Serif",Font.PLAIN,50));
   l3.setBackground(Color.CYAN);
   add(l3);
   
   tf3=new TextField(10);
   tf3.setFont(new Font("Serif",Font.PLAIN,50));
   tf3.setBackground(Color.CYAN);
   add(tf3);
   
   l4=new Label("Octal:");
   l4.setFont(new Font("Serif",Font.PLAIN,50));
   l4.setBackground(Color.CYAN);
   add(l4);
   
   tf4=new TextField(10);
   tf4.setFont(new Font("Serif",Font.PLAIN,50));
   tf4.setBackground(Color.CYAN);
   add(tf4);
   
    
  
   
   btnconvert=new Button("convert");
   btnconvert.setFont(new Font("Serif",Font.PLAIN,50));
   btnconvert.setBackground(Color.green);
  // btnconvert.setBounds(10,150,10,300);
   add(btnconvert);
   btnconvert.addActionListener(this);
   
   
    
   btnclear=new Button("clear");
   btnclear.setFont(new Font("Serif",Font.PLAIN,50));
   btnclear.setBackground(Color.red);
  // btnclear.setBounds(10,150,10,300);
   add(btnclear);
   btnclear.addActionListener(this);
   
   
   addWindowListener(new WindowAdapter()
   {
    public void windowClosing(WindowEvent we)
	{
	System.exit(0);
	}
   });
	
	setVisible(true);
	
   }
	
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==btnconvert)
	{
	int a=Integer.parseInt(tf1.getText());
	
	String binary=Integer.toBinaryString(a);
	tf2.setText(binary+" ");
	
	String hexadecimal=Integer.toHexString(a);
	tf3.setText(hexadecimal+" ");
	
	String octal=Integer.toOctalString(a);
	tf4.setText(octal+" ");
	}
	
	if(ae.getSource()==btnclear)
	{
	    tf1.setText(" ");
	
	    tf2.setText(" ");
	
	    tf3.setText(" ");
	
        tf4.setText(" ");
	}
  }
}
	
	
	



