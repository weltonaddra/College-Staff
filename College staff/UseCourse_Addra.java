// File name UseCourse_Addra.java
// Written by Welton Addra
// Written on February 3rd 2022
import java.util.*;
public class UseCourse_Addra {
    public static void main(String[] args) {
    String inputDepartment;a
    int inputCourseNum;
    int inputCredits;
    int fee;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter class department >> ");

    inputDepartment = input.nextLine();


    System.out.print("Enter the course number >> ");
    inputCourseNum = input.nextInt();

    System.out.print("Enter the amount of credits >> ");
    inputCredits = input.nextInt();
        
    if (inputDepartment.equalsIgnoreCase("BIO") || inputDepartment.equalsIgnoreCase("CHM") || inputDepartment.equalsIgnoreCase("CIS") || inputDepartment.equalsIgnoreCase("PHY")){
        LabCourse_Addra labClass = new LabCourse_Addra(inputDepartment, inputCourseNum, inputCredits);
        labClass.display(inputDepartment, inputCourseNum, inputCredits);

    }
    else {
        CollegeCourse_Addra  normalClass = new CollegeCourse_Addra(inputDepartment, inputCourseNum, inputCredits);
        normalClass.display(inputDepartment, inputCourseNum, inputCredits);
    }
    
}  
}

