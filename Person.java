package com.teachmeskills.lesson5.task1;
import java.time.LocalDate;
import java.time.Period;

public class Person {


    private String firstName;
    private String lastName;
    private double weight;
    private String gender;
    private LocalDate age;
    private Pants pants;
    private Shirt shirt;

    public Person(String firstName, String lastName, double weight, String gender, String age, Pants pants, Shirt shirt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.gender = gender;
        this.pants = pants;
        this.shirt = shirt;
    }


    public void run() {
        System.out.println(firstName + " " + lastName + " Идёт" );

    }

    public void age() {
        age = LocalDate.of(1985, 12, 06);
        LocalDate now = LocalDate.now();
        Period.between(age, now).getYears();
        System.out.println("Возраст: " + Period.between(age, now).getYears());

    }

    public void changeShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public void chancePants(Pants pants) {
        this.pants = pants;
    }

    @Override public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", birthDay=" + age +
                ", pants=" + pants +
                ", shirt=" + shirt +
                '}';
    }

    public void changePants(Pants pants2) {
    }
}
