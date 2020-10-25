package com.aut.Main;

import java.io.*;

/**
 * Created by zahra_ynp on 12/24/2017.
 */
public class FileUtility {


    public static File createFolder(String folderPath, String folderName) {

        File folder = new File(folderPath, folderName);
        try {
            folder.mkdirs();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return folder;
    }

    public static File createFile(File parent, String fileName) {
        File file = new File(parent, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    public static String write(File src, String msg) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(src);
            fileOutputStream.write(msg.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return msg;
    }

    public static String read(File src) {

        String result = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                result += line + "\n";
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}
