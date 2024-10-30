package tutorials;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class VelocityConversion implements ActionListener {
	JTextField t1,t2;
	JButton b;
	VelocityConversion()
	{
		JFrame f=new JFrame("Velocity Conversion");
		f.setSize(400, 300);
		f.setLayout(null);
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBounds(0, 0, 400, 300);
		t1=new JTextField();
		t1.setBounds(160, 50, 150, 30);
		JLabel l1=new JLabel("vel in km/hr");
		l1.setBounds(50, 50, 100, 30);
		t2=new JTextField();
		t2.setBounds(160, 150, 150, 30);
		b=new JButton("Convert");
		b.setBounds(140, 100, 100, 30);
		JLabel l2 = new JLabel("Velocity in m/s:");
        l2.setBounds(50, 150, 100, 30);
		p.add(l1);
		p.add(t1);
		p.add(b);
		p.add(l2);
		p.add(t2);
		b.addActionListener(this);
		f.add(p);
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int c=0;
		String s1=t1.getText();
		int a=Integer.parseInt(s1);
		if(e.getSource()==b)
		{
			c=a*5/18;
		}
		String res=String.valueOf(c);
		t2.setText(res);
	}
	public static void main(String[] args) {
		new VelocityConversion();
	}
}