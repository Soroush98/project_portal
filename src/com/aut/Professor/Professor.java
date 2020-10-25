package com.aut.Professor;
import com.aut.Main.*;
import java.io.File;

/**
 * @author 9413416
 */

public class Professor extends Human {

    private File professor;
    private String academicRank;
    private String post;
    private String collage;

    public Professor(String name, String id, long phoneNumber, String email, String userName, String password, String academicRank, String post, String collage) {
        super(name, id, phoneNumber, email, userName, password);
        this.academicRank = academicRank;
        this.post = post;
        this.collage = collage;
        professor = FileUtility.createFolder("C:/", "Professor");
        saveInFile();
    }

    public File getProfessor() {
        return professor;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public String getPost() {
        return post;
    }

    public String getCollage() {
        return collage;
    }

    public void saveInFile() {

        File file = FileUtility.createFile(professor, getUserName());
        FileUtility.write(file, toString());
    }

    @Override
    public String toString() {
        return getUserName() + "\r\n" + getPassword() + "\r\n" + getName() + "\r\n" + getId() + "\r\n" + getPhoneNumber() + "\r\n" + getEmail() + "\r\n" + getAcademicRank() + "\r\n" + getPost() + "\r\n" + getCollage();
    }
}