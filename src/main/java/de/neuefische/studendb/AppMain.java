package de.neuefische.studendb;

import de.neuefische.studendb.db.StudentDb;
import de.neuefische.studendb.model.ComputerScienceStudent;
import de.neuefische.studendb.model.HistoryStudent;
import de.neuefische.studendb.model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new HistoryStudent("Jane", "42"),
                new ComputerScienceStudent ("Klaus"),
                new HistoryStudent("Franky", "100")
        };
        /*StudentDb studentDb = new StudentDb(students);

        for(int i=0; i < 5; i++){
            System.out.println(studentDb.randomStudent());
        } */

Student neuerStudent1 = new ComputerScienceStudent("Josh");
        System.out.println(neuerStudent1.printClasses());
        for (Student student : students) {
            System.out.println( student.printClasses());
        }
    }

}
