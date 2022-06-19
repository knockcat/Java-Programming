
// Write a JFrame having three textfields. The first two textfields refers to two numbers on which sum or subtraction will happen.
//  The third textfield will show the result. There are two buttons “SUM” and “SUBTRACTION”. Once user will click on sum or subtraction.
//  buttons then the corresponding result will be displayed in result field.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener
{
    JLabel l1, l2,l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    A()
    {
        l1 = new JLabel("Enter the First Number : ");
        t1 = new JTextField(20);

        l2 = new JLabel("Enter the Second Number : ");
        t2 = new JTextField(20);

        b1 = new JButton("Sum");
        b2 = new JButton("Sub");

        l3 = new JLabel("Result : ");
        t3 = new JTextField(20);

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
        add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        int res = 0;
        String s = e.getActionCommand();
       
        if(s.equals("Sum"))
        {
            res = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
        }
        if(s.equals("Sub"))
        {
            res = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
        }
        t3.setText(Integer.toString(res));      
    }


    public static void main(String[] args)
    {
        A d = new A();
        d.setSize(300,400);
        d.setVisible(true);
    }
}
