
package bank.management.systems;


import javax.swing.*;
import java.awt.*;       //for colouring frame which come awt package
import java.util.*;      //for random class which can generate different number for registration form
import com.toedter.calendar.JDateChooser;  //for calender for DOB


public class SignupOne extends JFrame {
    
    SignupOne(){
        
        setLayout(null);                                 //so that number generate on a accute location
        Random ram = new Random();                                          //object of random class
        long random = Math.abs((ram.nextLong() % 9000L) + 1000L);     //for 4 digit positive random number
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);           //only work when setLayout  is null
        add(formno);
        
        
        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);           //only work when setLayout  is null
        add(personDetails);
        
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));    //for name
        name.setBounds(100,140,100,30);
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 145,400,30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));  //for fathers name 
        fname.setBounds(100,190,200,30);
        add(fname);
        
        
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 195,400,30);
        add(fnameTextField);
        
        
         JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));      //for date of birth
        dob.setBounds(98,240,200,30);
        add(dob);
        
       JDateChooser dateChooser = new JDateChooser();            //Calender
       dateChooser.setBounds(300,245,400,30);
       dateChooser.setForeground(new Color(105, 105, 105));
       add(dateChooser);
        
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));      //for gender
        gender.setBounds(98,290,200,30);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");           //for gender
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        JRadioButton female = new JRadioButton("Female");           //for gender
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();              //grouping so that we can click on only one option
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JRadioButton married = new JRadioButton("Married");           //maried
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
        JRadioButton unmarried = new JRadioButton("Unmarried");           //unmarried
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        JRadioButton other = new JRadioButton("Other");           //for gender
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        
        ButtonGroup maritalgroup = new ButtonGroup();              //grouping so that we can click on only one option
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        
       
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));      //for email
        email.setBounds(98,340,200,30);
        add(email);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 345,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));      //for marital status
        marital.setBounds(98,390,200,30);
        add(marital);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));      //for address
        address.setBounds(98,440,200,30);
        add(address);
        
        
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 445,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));      //for city
        city.setBounds(98,490,200,30);
        add(city);
        
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 495,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));      //for state
        state.setBounds(98,540,200,30);
        add(state);
        
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 545,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));      //for pincode
        pincode.setBounds(98,590,200,30);
        add(pincode);
        
        JTextField pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 595,400,30);
        add(pinTextField);
        
        
        JButton next = new JButton("Next");                       //next button
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,640,80,30);
        add(next);
        
        
       getContentPane().setBackground(Color.WHITE);    // background colour of the frame
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public static void main(String args[]) {
        new SignupOne();
    }
}
