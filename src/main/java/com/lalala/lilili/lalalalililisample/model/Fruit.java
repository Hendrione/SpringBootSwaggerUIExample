package com.lalala.lilili.lalalalililisample.model;

public class Fruit {
    private Integer id;
    private String name;
    private String color;
    private String shape;
    private String flavor;

    public Fruit() {
    }

    public Fruit(Integer id, String name, String color, String shape, String flavor) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.shape = shape;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
