// File name Faculty_Addra.java
// Written by Welton Addra
// Written on February 3rd 2022

import javax.swing.*;
import java.util.*;
public class Faculty_Addra extends CollegeEmployee_Addra {
    Scanner input = new Scanner(System.in);
    String enter;
    boolean restart = true;

    @Override
    public void setFields() {
        departmentName = JOptionPane.showInputDialog(f,"Enter the department name");

        unparssedString = JOptionPane.showInputDialog(f,"Enter social security number ");
        socialSecurity = Integer.parseInt(unparssedString);

        unparssedString = JOptionPane.showInputDialog(f,"Enter the annual salary ");
        annualSal = Integer.parseInt(unparssedString);

        System.out.println("Are you a tenured faculty member? yes or no.");
        enter = input.nextLine();
    }

    @Override
    public void display() {
        do {

            if (enter.equalsIgnoreCase("yes")) {
                System.out.print("Social security : " + socialSecurity + "     Annual salary : " + annualSal + "        Department name : " + departmentName + "        Tenured : True");
                restart = false;
            } else if (enter.equalsIgnoreCase("no")) {
                System.out.print("Social security : " + socialSecurity + "       Annual salary : " + annualSal + "   Department name : " + departmentName + "    Tenured : False");
                restart = false;
            } else {
                System.out.println("You have entered an invalid value, the program will restart.");
            }

        } while (restart);

    }
}
