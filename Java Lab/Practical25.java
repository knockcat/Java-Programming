// Create a GUI for student’s information system. A GUI that asks all the relevant information’s related to a student.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame{

    JLabel l1,l2,l3;
    JTextField t1,t2,t3;

    A(){
        l1 = new JLabel("Name");
        l2 = new JLabel("Roll No ");
        l3 = new JLabel("Student ID");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        JRadioButton rb1 = new JRadioButton("Sec : A");
        JRadioButton rb2 = new JRadioButton("Sec : B");
        JRadioButton rb3 = new JRadioButton("Sec : C");

        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox("CSE",true);
        JCheckBox cb3 = new JCheckBox("ESE");
        JCheckBox cb4 = new JCheckBox("ME");

        JButton b1 = new JButton("Submit");

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(rb1);
        add(rb2);
        add(rb3);
        
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);

        add(b1);
    }


    public static void main(String[] args)
    {
        A d = new A();
        d.setSize(400,400);
        d.setVisible(true);
    }
}