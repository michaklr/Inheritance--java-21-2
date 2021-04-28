package de.neuefische.studendb.model;

import java.util.Objects;

public class ComputerScienceStudent implements Student{

    private String name;
    private String id;


    public ComputerScienceStudent(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String printClasses() {
       return "Computer Science Class";
    }
}
