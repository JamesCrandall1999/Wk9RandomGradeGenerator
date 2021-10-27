package com.company.controllers;


import com.company.models.StudentGrade;
import com.company.views.ViewGrades;

import java.util.Random;

public class Main {

    public int students;



    public static void main(String[] args) {
        ViewGrades view = new ViewGrades();
        GetStudentNames getNames = new GetStudentNames();
        GetLetterGrade getGrade = new GetLetterGrade();
        String names[] = getNames.getTheNames();

        int students = getNames.getTheNames().length;

        StudentGrade[] record = new StudentGrade[students];
        view.setStudents(students);
        view.setRecord(record);
        for (int i = 0; i < students;i++){
            record[i]= new StudentGrade();
            Random rand = new Random();
            record[i].setName(names[i]);
            record[i].setPercentage(rand.nextInt((100-0)+1)+0);
            getGrade.setPercentage(record[i].getPercentage());
            record[i].setLetterGrade(getGrade.getLetterGrade());
        }
        view.Menu();
        /*for (int i = 0; i < students;i++){

            System.out.println(record[i].getName() + " " +record[i].getPercentage() + " "+record[i].getLetterGrade()+"\n");
        }
       */
        //GetWord getWord = new GetWord();
       // String theWord = getWord.getTheWord();
    }


}
