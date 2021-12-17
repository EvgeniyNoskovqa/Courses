package com.teachmeskills.lesson5.task1;

public class Main {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt("XL", "Red", "I like red");
        Shirt shirt2 = new Shirt("S", "Black", "I like black");
        Pants pants1 = new Pants("XXL", "Black");
        Pants pants2 = new Pants("S", "Grey");

        Person person = new Person("Alex","Alex",100.5,"Male"," ", pants1, shirt1);
        person.run();
        System.out.println(person);
        person.age();
        System.out.println("Меняем майку");
        person.changeShirt(shirt2);
        System.out.println("Меняем штаны");
        person.changePants(pants2);
        System.out.println(person);


    }

}


