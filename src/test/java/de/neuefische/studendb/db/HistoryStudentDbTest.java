package de.neuefische.studendb.db;

import de.neuefische.studendb.model.HistoryStudent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HistoryStudentDbTest {

    @Test
    @DisplayName("list() returns all students in the db")
    public void testList() {
        // Given
        HistoryStudent[] students = new HistoryStudent[]{
                new HistoryStudent("Jane", "42"),
                new HistoryStudent("Klaus", "13"),
                new HistoryStudent("Franky", "100")
        };
        StudentDb studentDb = new StudentDb(students);

        // When
        HistoryStudent[] actual = studentDb.list();

        // Then
        HistoryStudent[] expected = new HistoryStudent[]{
                new HistoryStudent("Jane", "42"),
                new HistoryStudent("Klaus", "13"),
                new HistoryStudent("Franky", "100")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("toString() returns a formatted list of all students")
    public void testToString() {
        // Given
        HistoryStudent[] students = new HistoryStudent[]{
                new HistoryStudent("Jane", "42"),
                new HistoryStudent("Klaus", "13"),
                new HistoryStudent("Franky", "100")
        };
        StudentDb studentDb = new StudentDb(students);

        // When
        String actual = studentDb.toString();

        // Then
        String expected = "Student{name='Jane', id='42'}\n"
                + "Student{name='Klaus', id='13'}\n"
                + "Student{name='Franky', id='100'}\n";
        assertEquals(expected, actual);
    }



}