package fact.it.projectthemepark.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Waluyono Tri r1012723
public class Staff extends Person {
    private LocalDate startDate;
    private boolean student;

    public Staff(String firstName, String surName) {
        super(firstName, surName);
        this.startDate = LocalDate.now();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (student)
            return "Staff member " + getSurName().toUpperCase() + " " + getFirstName() + " (working student) is employed since " + getStartDate().format(formatter);
        else
            return "Staff member " + getSurName().toUpperCase() + " " + getFirstName()  + " is employed since " + getStartDate().format(formatter);

    }
}
