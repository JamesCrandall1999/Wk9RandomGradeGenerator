package com.company.controllers;

public class GetLetterGrade {
    public int percentage;



    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public char getLetterGrade(){
        if(percentage >= 90){
            return 'A';
        }
        else if(percentage >= 80){
            return 'B';
        }
        else if(percentage >= 70){
            return 'C';
        }
        else if(percentage >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
