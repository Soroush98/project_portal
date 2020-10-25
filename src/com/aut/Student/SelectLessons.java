package com.aut.Student;
import com.aut.Lesson.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface SelectLessons {
    
    ArrayList<Lesson> addLesson(int LessonCode);
    ArrayList<Lesson> addLesson(String LessonName);
    boolean removeLesson(int LessonCode);
    boolean removeLesson(String LessonName);
}
