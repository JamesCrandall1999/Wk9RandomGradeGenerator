package com.company.views;

import com.company.models.StudentGrade;


import java.util.Objects;
import java.util.Scanner;

public class ViewGrades {

    private StudentGrade[] record;
    private int students;


    public void setRecord(StudentGrade[] record) {
        this.record = record;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public void Menu() {
        System.out.println("View Student Grades?");
        System.out.println("Y/N or y/n");


            Scanner input = new Scanner(System.in);

            String choice = input.nextLine();
            System.out.println(choice);
            if (Objects.equals(choice, "Y") || Objects.equals(choice, "y")) {
                printRecords();

            } else if (Objects.equals(choice, "N") || Objects.equals(choice, "n")) {
                System.out.println("Exiting Grade Generator...\n");
            } else {

                System.out.println("Invalid, Enter Y/y or N/n \n");
            }
        }


    public void printRecords(){
        for (int i = 0; i < students;i++){

            System.out.println(record[i].getName() + " " +record[i].getPercentage() + " "+record[i].getLetterGrade()+"\n");
        }

    }



}

