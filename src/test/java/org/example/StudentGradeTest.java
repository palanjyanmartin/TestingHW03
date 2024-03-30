package org.example;

import static org.testng.Assert.*;

public class StudentGradeTest {

    @org.testng.annotations.Test
    public void testCalculateMastersGrade() {
        StudentGrade studentGrade = new StudentGrade();
        assertEquals("Fail", studentGrade.calculateMastersGrade(20), "The grade 20 should return Fail");
        assertEquals("Pass", studentGrade.calculateMastersGrade(70), "The grade 70 should return Pass");
        assertNull(studentGrade.calculateMastersGrade(-20), "The grade -20 should return null");
    }

    @org.testng.annotations.Test
    public void testCalculateLetterGrade() {
        StudentGrade studentGrade = new StudentGrade();
        assertEquals('A', studentGrade.calculateLetterGrade(100), "The grade 100 should return the letter A");
        assertEquals('B', studentGrade.calculateLetterGrade(85), "The grade 100 should return the letter B");
        assertEquals('C', studentGrade.calculateLetterGrade(75), "The grade 100 should return the letter C");
        assertEquals('D', studentGrade.calculateLetterGrade(65), "The grade 100 should return the letter D");
        assertEquals('F', studentGrade.calculateLetterGrade(40), "The grade 100 should return the letter F");
        assertEquals('\0', studentGrade.calculateLetterGrade(-20), "The grade 100 should return the letter '\0'");
    }

    @org.testng.annotations.Test
    public void testCalculateGradeGPA() {
        StudentGrade studentGrade = new StudentGrade();
        assertEquals(4.0, studentGrade.calculateGradeGPA(100), "The grade 100 should return 4.0 GPA");
        assertEquals(3.0, studentGrade.calculateGradeGPA(85), "The grade 85 should return 3.0 GPA");
        assertEquals(2.0, studentGrade.calculateGradeGPA(75), "The grade 75 should return 2.0 GPA");
        assertEquals(1.0, studentGrade.calculateGradeGPA(65), "The grade 65 should return 1.0 GPA");
        assertEquals(0.0, studentGrade.calculateGradeGPA(40), "The grade 40 should return 0.0 GPA");
        assertEquals(-1.0, studentGrade.calculateGradeGPA(-20), "The grade -20 should return -1.0 GPA");
    }

    @org.testng.annotations.Test
    public void testIsPassing() {
        StudentGrade studentGrade = new StudentGrade();
        assertTrue(studentGrade.isPassing(70), "The grade 70 should return true");
        assertFalse(studentGrade.isPassing(40), "The grade 40 should return false");
        assertFalse(studentGrade.isPassing(-20), "The grade -20 should return false");
    }
}