// File name Student_Addra.java
// Written by Welton Addra
// Written on February 3rd 2022

import javax.swing.*;
public class Student_Addra extends Person_Addra{
    String major;
    float gpa;

    @Override
    public void setFields() {
        firstName = JOptionPane.showInputDialog(f,"Enter the first name");

        lastName = JOptionPane.showInputDialog(f,"Enter the last name");

        streetAdd = JOptionPane.showInputDialog(f,"Enter the street address");

        unparssedString = JOptionPane.showInputDialog(f,"Enter the zipCode ");
        zipCode = Integer.parseInt(unparssedString);

        unparssedString = JOptionPane.showInputDialog(f,"Enter the gpa");
        gpa = Float.parseFloat(unparssedString);


        major = JOptionPane.showInputDialog(f,"Enter the major field of study.");
    }

    @Override
    public void display() {
        System.out.println("Name : " + firstName + " " + lastName + " " + "      Street address : " + streetAdd + "        Zipcode : " + zipCode + "        Phone number : " + phone + "    Major : " + major + "        Grade point average : " + gpa );

    }
}
