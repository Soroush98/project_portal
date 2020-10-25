package com.aut.Supervisor;
import com.aut.Main.*;
import com.aut.Lesson.*;
import java.io.File;
import java.util.ArrayList;

public class Supervisor extends Human {

    private ArrayList<Lesson> lessons;
    private File supervisor;
    private String collage;
    private String academicRank;

    public Supervisor(String name, String id, long phoneNumber, String email, String userName, String password, String collage, String academicRank) {
        super(name, id, phoneNumber, email, userName, password);
        this.collage = collage;
        this.academicRank = academicRank;
        lessons = new ArrayList<>();
        supervisor = FileUtility.createFolder("C:/", "Supervisor");
        saveInFile();
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }


    public String getCollage() {
        return collage;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public void saveInFile() {

        File file = FileUtility.createFile(supervisor, getUserName());
        FileUtility.write(file, toString());

    }

    @Override
    public String toString() {
        return getUserName() + "\r\n" + getPassword() + "\r\n" + getName() + "\r\n" + getId() + "\r\n" + getPhoneNumber() + "\r\n" + getEmail() + "\r\n" + getCollage() + "\r\n" + getAcademicRank();
    }


}