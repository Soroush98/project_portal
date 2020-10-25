package com.aut.Education;

import java.io.File;
import com.aut.Main.*;


/**
 * @author 9413416
 */
public class Education extends Human {

    private File education;
    private String collage;


    public Education(String name, String id, long phoneNumber, String email, String userName, String password, String collage) {
        super(name, id, phoneNumber, email, userName, password);
        this.collage = collage;
        education = FileUtility.createFolder("C:/", "com/aut/Education");
        saveInFile();
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }


    public void saveInFile() {

        File file = FileUtility.createFile(education, getUserName());
        FileUtility.write(file, toString());
    }

    @Override
    public String toString() {
        return getUserName() + "\r\n" + getPassword() + "\r\n" + getName() + "\r\n" + getId() + "\r\n" + getPhoneNumber() + "\r\n" + getEmail() + "\r\n" + getCollage();
    }

}
