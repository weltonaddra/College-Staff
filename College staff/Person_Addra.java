// File name Person_Addra.java
// Written by Welton Addra
// Written on February 3rd 2022
import javax.swing.*;
public class Person_Addra {
    JFrame f;
    String firstName,lastName,streetAdd,unparssedString;
    int zipCode,phone;


    public void setFields(){

       firstName = JOptionPane.showInputDialog(f,"Enter the first name");

        lastName = JOptionPane.showInputDialog(f,"Enter the last name");

        streetAdd = JOptionPane.showInputDialog(f,"Enter the street address");


        unparssedString = JOptionPane.showInputDialog(f,"Enter the zipCode ");
        zipCode = Integer.parseInt(unparssedString);


        unparssedString = JOptionPane.showInputDialog(f,"Enter the first name");
        zipCode = Integer.parseInt(unparssedString);

}

  public void display () {
      System.out.println("");
      System.out.println("Name :" + firstName + " " + lastName + " " + " Street address : " + streetAdd + " Zipcode : " + zipCode + "Phone number : " + phone);
}
}