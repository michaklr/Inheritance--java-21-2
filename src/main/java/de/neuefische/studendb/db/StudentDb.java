package de.neuefische.studendb.db;

import de.neuefische.studendb.model.HistoryStudent;

public class StudentDb {

    private HistoryStudent[] students;

    public StudentDb(HistoryStudent[] students) {
        this.students = students;
    }

    public HistoryStudent[] list() {
        return students;
    }

    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < students.length; i++) {
            result += students[i] + "\n";
        }
        return result;
    }

    public HistoryStudent randomStudent() {
        int index = (int) Math.floor(Math.random() * students.length);
        return students[index];
    }



}
