package JavaJDBC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by shraddha on 3/11/17.
 */
public class SwingJdbcdemo implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;

    SwingJdbcdemo()
    {
        f=new JFrame("Form");//creating instance of JFrame

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t1.setBounds(120,10,250,30);
        t2.setBounds(120,50,250,30);
        t3.setBounds(120,90,250,30);
        t4.setBounds(120,130,250,30);
        t5.setBounds(120,170,250,30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        l1=new JLabel("First Name:");
        l2=new JLabel("Last Name:");
        l3=new JLabel("Contact No:");
        l4=new JLabel("Email Id:");
        l5=new JLabel("Address:");
        l1.setBounds(10,10,200,30);//x,y,Width,hight
        l2.setBounds(10,50,200,30);
        l3.setBounds(10,90,200,30);
        l4.setBounds(10,130,200,30);
        l5.setBounds(10,170,200,30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

        b1=new JButton("Save");
        //b2=new JButton("Clear");
        b1.setBounds(190,220,100,60);
        //b2.setBounds(170,220,100,60);
        f.add(b1);
        //f.add(b2);


        f.setSize(450,300);//width and height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
       // b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        b1=(JButton)e.getSource();
        getOperation();

        /*if(e.getSource()==b2)//clear
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
*/
    }

        public void getOperation() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pdf", "root", "shraddha");
            Statement stmt = con.createStatement();

            // stmt.execute(""+"Create table javatable(id int(10),name varchar(20),sirname varchar(20))");

            PreparedStatement pt = con.prepareStatement("insert RegistrationForm values(?,?,?,?,?);");
            pt.setString(1,t1.getText());
            pt.setString(2,t2.getText());
            pt.setString(3, t3.getText());
            pt.setString(4, t4.getText());
            pt.setString(5, t5.getText());
            pt.execute();

            //PreparedStatement pt2=con.prepareStatement("delete from javatable where id=13;");
            //pt2.execute();

            ResultSet rs = stmt.executeQuery("select * from RegistrationForm;");
            while (rs.next())
                System.out.println(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3) + "\n" + rs.getString(4) + "\n" + rs.getString(5));
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args)
    {
        new SwingJdbcdemo();
    }
}

