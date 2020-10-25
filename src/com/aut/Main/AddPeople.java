package com.aut.Main;

import com.aut.Education.*;
import com.aut.Student.*;
import com.aut.Supervisor.*;
import com.aut.Professor.*;

/**
 * Created by zahra_ynp on 12/9/2017.
 */
public class AddPeople {

    public void add() {

        Student student1 = new Student("zahra younespoor", "270", 87, "zahra.ynp@gmail.com", "9531087", "zahra1234", "azadi", "ce", 16, 30, 43, "adi");
        Student student2 = new Student("arefeh mansuri", "002", 87, "arefemansuri@gmail.com", "9413490", "arefehmansuri", "tajrish", "cs", 17, 50, 66, "adi");
        Student student3 = new Student("maryam rahmanian", "002", 87, "maryam_rahmanian@aut.ac.ir", "9413480", "maryam5678", "valiasr", "cs", 15, 54, 72, "adi");

        Education education1 = new Education("reza pur", "002", 87, "@", "95", "za", "ce");
        Education education2 = new Education("hasani", "002", 87, "@", "95", "za", "ce");

        Supervisor supervisor1 = new Supervisor("hamidreza shahriari", "002", 87, "@", "95", "za", "ce", "s");
        Supervisor supervisor2 = new Supervisor("nazerfard","002", 87, "@", "95", "za", "ce", "s");
        Supervisor supervisor3 = new Supervisor("maryam haeri", "002", 87, "@", "95", "za", "ce", "s");

        Professor professor1 = new Professor("mahdi qhatee", "002", 87, "@", "95", "za", "ce", "s", "df");
        Professor professor2 = new Professor("sabaee","002", 87, "@", "95", "za", "ce", "s", "df");
        Professor professor3 = new Professor("mir mohammad", "002", 87, "@", "95", "za", "ce", "s", "df");

    }
}
