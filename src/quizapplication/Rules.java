package quizapplication;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Welcome, "+name+" to Quiz");
        heading.setBounds(50, 20,700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. You are trained here to be a programmer." + "<br><br>" +
                "2. Do not unnecessarily waste your time." + "<br><br>" +
                "3. There is only 15 seconds given to you for each question." + "<br><br>" +
                "4. Total question is 10 and each right answer will give you 10 marks." + "<br><br>" +
                "5. There is no negative marking." + "<br><br>" +
                "6. You can also use 50-50 lifeline." + "<br><br>" +
                "7. You can use 50-50 lifeline only for one time." + "<br><br>" +
                "8. Good Luck." + "<br><br>" +
            "<html>"
        );
        add(rules);

        back=new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800,650);
        setLocation(350, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==start)
        {
            setVisible(false);
            new Quiz(name);
        }
        else {  
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args)
    {
        new Rules("User");
    }
}
