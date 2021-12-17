package com.teachmeskills.lesson5.task1;

public class Shirt {
    private String sizeShirt;
    private String colorShirt;
    private String waterMarkShirt;

    public Shirt(String sizeShirt, String colorShirt, String waterMarkShirt) {
        this.sizeShirt = sizeShirt;
        this.colorShirt = colorShirt;
        this.waterMarkShirt = waterMarkShirt;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "colorShirt='" + colorShirt + '\'' +
                ", sizeShirt='" + sizeShirt + '\'' +
                ", waterMarkShirt='" + waterMarkShirt + '\'' +
                '}';
    }
}