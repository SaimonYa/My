package lab2_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Employee extends JFrame {
    public JTextField jta = new JTextField(15);
    JTextField jta1 = new JTextField(15);
    JTextField jta2 = new JTextField(15);
    JTextField jta3 = new JTextField(15);
    JButton button = new JButton("Show");
    JButton button1 = new JButton("Exit");
    Font fnt = new Font("Times new roman",Font.BOLD,20);;
    public Employee() {
        super("Employee");
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JFrame frame = new JFrame();
        frame.setSize(200,300);
        setSize(200, 300);
        flow.add(new JLabel("Name:"));
        flow.add(jta);
        flow.add(new JLabel("Age:"));
        flow.add(jta1);
        flow.add(new JLabel("Department:"));
        flow.add(jta2);
        flow.add(new JLabel("Position:"));
        flow.add(jta3);
        flow.add(button);
        flow.add(button1);
        frame.add(flow);
        frame.setResizable(false);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String name = String.format(jta.getText().trim());
                String age = String.format(jta1.getText().trim());
                String department = String.format(jta2.getText().trim());
                String position = String.format(jta3.getText().trim());
                JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age + "\nDepartment: " + department + "\nPosition: " + position, "Person",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frame.setVisible(false);
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Employee();
    }
}
