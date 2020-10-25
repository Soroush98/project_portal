package com.aut.Student;
import com.aut.Main.*;
import com.aut.Lesson.*;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by user on 11/5/2017.
 */
public class Student extends Human implements StudentsInformationInterface {

    private ArrayList<Lesson> lessons;
    private File student;
    private String address;
    private String major;
    private double average;
    private int passedUnits;
    private int tokenUnits;
    private String condition;

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public Student(String name, String id, long phoneNumber, String email, String userName, String password, String address, String major, double average, int passedUnits, int tokenUnits, String condition) {
        super(name, id, phoneNumber, email, userName, password);
        this.address = address;
        this.major = major;
        this.average = average;
        this.passedUnits = passedUnits;
        this.tokenUnits = tokenUnits;
        this.condition = condition;
        lessons = new ArrayList<>();
        student = FileUtility.createFolder("C:/", "Student");
        saveInFile();
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public double getAverage() {
        return average;
    }

    public int getPassedUnits() {
        return passedUnits;
    }

    public int getTokenUnits() {
        return tokenUnits;
    }

    public String getCondition() {
        return condition;
    }

    public void saveInFile() {

        File file = FileUtility.createFile(student, getUserName());
        FileUtility.write(file, toString());

    }

    @Override
    public String toString() {
        return getUserName() + "\r\n" + getPassword() + "\r\n" + getName() + "\r\n" + getId() + "\r\n" + getPhoneNumber() + "\r\n" + getEmail() + "\r\n" + getAddress() + "\r\n" + getMajor() + "\r\n" + getAverage() + "\r\n" + getPassedUnits() + "\r\n" + getTokenUnits() + "\r\n" + getCondition();
    }

    @Override
    public ArrayList<String> StudentsName() {
        return null;
    }

    @Override
    public ArrayList<String> StudentLesson(int StudentUser) {
        return null;
    }

    @Override
    public ArrayList<String> StudentLesson(String StudentName) {
        return null;
    }

    @Override
    public ArrayList<Double> StudentMarks(int StudentUser) {
        return null;
    }

    @Override
    public ArrayList<Double> StudentMarks(String StudentName) {
        return null;
    }
    public boolean prerequistiecheck(String username,String lesson){
        try {
            String SQL2 = "select * from lesson";
            ResultSet rs2 = stmt.executeQuery(SQL2);
            while (rs2.next()) {
                String name = rs2.getString(1);
                String prerequiestie = rs2.getString(9);
                if (name.equals(lesson)) {
                if (prerequiestie.equals(null)){
                    return true;
                }
                else {

                    String SQL3 = "select * from student";
                    ResultSet rs3 = stmt.executeQuery(SQL3);
                    while (rs3.next()) {
                        if (username.equals(rs3.getString("userName"))){
                        String passedLesson=rs3.getString("passedLesson");
                        String [] token = passedLesson.split("-");
                        for (int i=0;i<token.length;i++){
                            if (token[i].equals(prerequiestie))
                                return true;
                        }
                        return false;

                        }
                    }
                }
            }
            }
        }
        catch (SQLException e){

        }
        return false;
    }


}
