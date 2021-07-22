import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class Cal extends Frame implements ActionListener
 
{
    Label lb1,lb2,lb3,lb4;
 
    TextField txt1,txt2,txt3,txt4;
 
    Button btn1;
 
    public Cal()
    {
        lb1 = new Label("Enter num 1:");
        lb2 = new Label("Enter num 2:");
        lb3 = new Label("Result");
	lb4 = new Label("Enter num 3:");
 
        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);
	txt4 = new TextField(10);

        btn1 = new Button("Calculate");
        
 
            add(lb1);
            add(txt1);
            add(lb2);
            add(txt2);
	    add(lb4);
	    add(txt4);	
            add(lb3);
            add(txt3);
            add(btn1);
           
             
            setSize(200,500);
            setTitle("Calculator");
            setLayout(new FlowLayout());
           
            btn1.addActionListener(this);
             
    }
    public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0,d=0;
        try
        {
            a = Double.parseDouble(txt1.getText());
        }
        catch (NumberFormatException e) {
            txt1.setText("Invalid input");
        }
        try
        {
            b = Double.parseDouble(txt2.getText());
        }
	catch (NumberFormatException e) {
            txt2.setText("Invalid input");
        }
	try
        {
            d = Double.parseDouble(txt4.getText());
        }
        catch (NumberFormatException e) {
            txt4.setText("Invalid input");
        }
        if(ae.getSource()==btn1)
        {
            c = a + b + d;
            txt3.setText(String.valueOf(c));
        }
             
    }
    public static void main(String[] args)
    {
        Cal calC = new Cal();
        calC.setVisible(true);
        calC.setLocation(300,300);
    }
}