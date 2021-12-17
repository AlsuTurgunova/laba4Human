package com.company;

/**
 * This class was created to fill in fields with data about a person
 * */
import java.util.Objects;

public class Human {

    private String id;
    private String name;
    private String gender;
    private String salary;
    private String BirthDate;
    private Division division;

    /**
     * Constructor with parameters
     *
     * @param id        Id
     * @param name      Name
     * @param gender    Gender
     * @param salary    Salary
     * @param BirthDate BirthDate
     * @param div       Division
     * @param genId     generated id
     */
    public Human(String id, String name, String gender, String salary, String BirthDate, String div, int genId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.BirthDate = BirthDate;
        division = new Division(div, genId);
    }

    public Human() {
    }

    /**
     * Getting the field value Id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Getting the field value Name
     *
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Getting the field value Gender
     *
     * @return Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Getting the field value Salary
     *
     * @return
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Getting the field value Birth Date
     *
     * @return Birth Date
     */
    public String getBirthDate() {
        return BirthDate;
    }

    /**
     * Getting the field value Division
     *
     * @return Division
     */
    public String getDivision() {
        return division.getDivision();
    }

    /**
     * Getting the value of the generated id field
     *
     * @return generated id
     */
    public int getGenId() {
        return division.getId();
    }

    /**
     * toString method
     *
     * @return string with parameters
     */
    @Override
    public String toString() {
        return this.id + "; " + this.name + "; Gender: " + this.gender + "; division: " + this.division.getDivision() + "; salary: " + this.salary + "; birthdate: " + BirthDate + "\n";
    }

    /**
     * A method for comparing two objects. Is overridden.
     *
     * @param o The object to be compared with the current object.
     * @return True if they are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Human human = (Human) o;
            return this.id == human.id && this.salary == human.salary && Objects.equals(this.name, human.name) && Objects.equals(this.gender, human.gender) && Objects.equals(this.BirthDate, human.BirthDate);
        } else {
            return false;
        }
    }

    /**
     * ListTest the hash code of this object.
     *
     * @return Hash code in integer.
     */
    @Override
    public int hashCode() {
        return this.id.length() + this.name.length() + this.gender.length();
    }
}