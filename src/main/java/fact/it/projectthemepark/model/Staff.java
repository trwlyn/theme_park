package fact.it.projectthemepark.model;

import java.time.LocalDate;

//Waluyono Tri r1012723
public class Staff extends Person {
    private LocalDate startDate;
    private boolean student;

    public Staff(String firstName, String surName) {
        super(firstName, surName);
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
        return "Staff{" +
                "startDate=" + startDate +
                ", student=" + student +
                '}';
    }
}
