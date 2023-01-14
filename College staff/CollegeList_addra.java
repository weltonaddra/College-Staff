// File name CollegeList_addra.java
// Written by Welton Addra
// Written on February 3rd 2022
// Instructor: Udeme Aaron

import java.util.*;
public class CollegeList_addra {
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        Person_Addra[] people = {new CollegeEmployee_Addra(), new CollegeEmployee_Addra(), new CollegeEmployee_Addra(), new CollegeEmployee_Addra(), new Faculty_Addra(), new Faculty_Addra(), new Faculty_Addra(), new Student_Addra(), new Student_Addra(), new Student_Addra(), new Student_Addra(), new Student_Addra(), new Student_Addra(), new Student_Addra()
        };

        boolean restart = true;
        String typeOfPerson;
        int cNum = 0;
        int cFull = 3;
        int fNum = 4;
        int fFull = 6;
        int sNum = 7;
        int sFull = 13;
        int i;
        boolean hasC = false;
        boolean hasF = false;
        boolean hasS = false;


        while (restart) {
            System.out.println("What type of person will be be entered? college employee (c), faculty(f), student(s), or would you like to quit(q)");
            typeOfPerson = input.next();

            if (typeOfPerson.equalsIgnoreCase("q")) {
                restart = false;

            }

            if (typeOfPerson.equalsIgnoreCase("c")) {
                if (cNum <= cFull) {
                    people[cNum].setFields();
                    hasC = true;
                    ++cNum;
                } else {
                    System.out.print("You have reached the maximum amount of college employees allowed to be entered.");
                    System.out.println("");
                }
            }

            else if (typeOfPerson.charAt(0).equalsIgnoreCase("f"))
            {
                if (fNum <= fFull) {
                    people[fNum].setFields();
                    fNum += 1;
                    hasF = true;
                } else {
                    System.out.print("You have reached the maximum amount of faculty allowed to be entered.");
                    System.out.println("");
                }

            }
            else if (typeOfPerson.equalsIgnoreCase("s")) {
                if (sNum <= sFull) {
                    people[sNum].setFields();
                    hasS = true;
                    sNum += 1;
                } else {
                    System.out.print("You have reached the maximum amount of students allowed to be entered.");
                    System.out.println("");

                }
            }

            }

            if(hasC){
                i = 0;
                System.out.println("");
                System.out.println("College employees ");
                while (i < cNum){
                    people[i].display();
                    i++;
                }
            }

            if(hasF){
                i = 4;
                System.out.println("");
                System.out.println("Faculty ");
                while (i < fNum){
                    people[i].display();
                    ++i;
                }
            }

        if(hasS){
            i = 7;
            System.out.println("");
            System.out.println("Students ");
            while (i < sNum){
                people[i].display();
                ++i;
            }
        }
        System.out.println("");
        System.out.println("This is the end of the code");

                }

    }


