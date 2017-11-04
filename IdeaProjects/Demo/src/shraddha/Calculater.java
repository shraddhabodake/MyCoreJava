package shraddha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shraddha on 30/10/17.
 */
public class Calculater implements ActionListener
{
    JFrame f;
    JTextField t1;
    JButton b1,b2,b3,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

    static double a=0,b=0,result=0;
    static int operator=0;


    Calculater()
    {
        f=new JFrame("Calculator");//creating instance of JFrame

        t1=new JTextField();
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setBounds(10,10,350,50);

        b1=new JButton("C");
        b2=new JButton("DEL");
        b3=new JButton("%");
        //b4=new JButton("Ac");
        b5=new JButton("7");
        b6=new JButton("8");
        b7=new JButton("9");
        b8=new JButton("/");
        b9=new JButton("4");
        b10=new JButton("5");
        b11=new JButton("6");
        b12=new JButton("*");
        b13=new JButton("1");
        b14=new JButton("2");
        b15=new JButton("3");
        b16=new JButton("-");
        b17=new JButton("0");
        b18=new JButton(".");
        b19=new JButton("=");
        b20=new JButton("+");

        b1.setBounds(10,70,80, 50);
        b2.setBounds(100,70,80, 50);
        b3.setBounds(190,70,80, 50);
        //b4.setBounds(280,70,80, 50);
        b5.setBounds(10,130,80, 50);
        b6.setBounds(100,130,80, 50);
        b7.setBounds(190,130,80, 50);
        b8.setBounds(280,70,80, 50);
        b9.setBounds(10,190,80, 50);
        b10.setBounds(100,190,80, 50);
        b11.setBounds(190,190,80, 50);
        b12.setBounds(280,130,80, 50);
        b13.setBounds(10,250,80, 50);
        b14.setBounds(100,250,80, 50);
        b15.setBounds(190,250,80, 50);
        b16.setBounds(280,190,80, 50);
        b17.setBounds(10,310,80, 50);
        b18.setBounds(100,310,80, 50);
        b19.setBounds(190,310,170, 50);
        b20.setBounds(280,250,80, 50);

        f.add(b1);//adding button in JFrame
        f.add(b2);
        f.add(b3);
        //f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);


        f.add(t1);

        f.setSize(370,370);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        //b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==b1)//clear
          t1.setText("0");

      if (e.getSource()==b2)//delete
      {
          String s= t1.getText();
          t1.setText("");
          for (int i=0;i<s.length()-1;i++)
              t1.setText(t1.getText()+s.charAt(i));
      }

      if (e.getSource()==b5)
          t1.setText(t1.getText().concat("7"));

        if (e.getSource()==b6)
            t1.setText(t1.getText().concat("8"));

        if (e.getSource()==b7)
            t1.setText(t1.getText().concat("9"));

        if (e.getSource()==b9)
            t1.setText(t1.getText().concat("4"));

        if (e.getSource()==b10)
            t1.setText(t1.getText().concat("5"));

        if (e.getSource()==b11)
            t1.setText(t1.getText().concat("6"));

        if (e.getSource()==b13)
            t1.setText(t1.getText().concat("1"));

        if (e.getSource()==b14)
            t1.setText(t1.getText().concat("2"));

        if (e.getSource()==b15)
            t1.setText(t1.getText().concat("3"));

        if (e.getSource()==b17)
            t1.setText(t1.getText().concat("0"));

        if (e.getSource()==b18)
            t1.setText(t1.getText().concat("."));

        if (e.getSource()==b20)//Add
        {
            a=Double.parseDouble(t1.getText());
            operator=1;
            t1.setText("");
        }

        if (e.getSource()==b16)//Sub
        {
            a=Double.parseDouble(t1.getText());
            operator=2;
            t1.setText("");
        }

        if (e.getSource()==b12)//Mul
        {
            a=Double.parseDouble(t1.getText());
            operator=3;
            t1.setText("");
        }

        if (e.getSource()==b8)//Div
        {
            a=Double.parseDouble(t1.getText());
            operator=4;
            t1.setText("");
        }

        if (e.getSource()==b3)//%
        {
            a=Double.parseDouble(t1.getText());
            operator=5;
            t1.setText("");
        }

        if (e.getSource()==b19)//Equals
        {
            b=Double.parseDouble(t1.getText());
            switch (operator)
            {
                case 1:
                    result=a+b;
                    break;
                case 2:
                    result=a-b;
                    break;
                case 3:
                    result=a*b;
                    break;
                case 4:
                    result=a/b;
                    break;
                case 5:
                    result=a%b;
                    break;
                default:
                    result=0;
            }
            t1.setText(""+result);
        }
    }

    public static void main(String[] args)
    {
        new Calculater();
    }
}
