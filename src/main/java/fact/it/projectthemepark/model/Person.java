package fact.it.projectthemepark.model;
//Waluyono Tri r1012723
public class Person {
    private String firstName, surName;

    public Person() {
    }

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return surName.toUpperCase() + " ," + firstName;
    }
}
