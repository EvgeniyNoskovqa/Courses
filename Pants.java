package com.teachmeskills.lesson5.task1;

public class Pants {
    private String sizePants;
    private String colorPants;

    public Pants(String sizePants, String colorPants) {
        this.sizePants = sizePants;
        this.colorPants = colorPants;
    }

    public Pants() {

    }

    @Override
    public String toString (){
        return "Pants{" +
                "colorPants='" + colorPants + '\'' +
                ", sizePants='" + sizePants + '\'' +
                '}';
    }
}
