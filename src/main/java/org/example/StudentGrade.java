package org.example;

public class StudentGrade {
    private int passingGrade;


    public StudentGrade() {
        this.passingGrade = 60;
    }

    public String calculateMastersGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            return grade >= this.passingGrade ? "Pass" : "Fail";
        } else {
            return null;
        }
    }

    public char calculateLetterGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                return 'A';
            } else if (grade >= 80) {
                return 'B';
            } else if (grade >= 70) {
                return 'C';
            } else if (grade >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        } else {
            return '\0';
        }
    }

    public double calculateGradeGPA(int grade) {
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                return 4.0;
            } else if (grade >= 80) {
                return 3.0;
            } else if (grade >= 70) {
                return 2.0;
            } else if (grade >= 60) {
                return 1.0;
            } else {
                return 0.0;
            }
        } else {
            return -1.0;
        }
    }

    public boolean isPassing(int grade) {
        if (grade >= 0 && grade <= 100) {
            return grade >= this.passingGrade;
        } else {
            return false;
        }
    }
}




