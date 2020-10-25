package com.aut.Student;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface StudentsInformationInterface {
    
    ArrayList<String> StudentsName();
    ArrayList<String> StudentLesson(int StudentUser);
    ArrayList<String> StudentLesson(String StudentName);
    ArrayList<Double> StudentMarks(int StudentUser);
    ArrayList<Double> StudentMarks(String StudentName);
}
