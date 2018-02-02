package com.lalala.lilili.lalalalililisample.model;

public class FruitBuilder {
    private Integer id;
    private String name;
    private String color;
    private String shape;
    private String flavor;

    public FruitBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public FruitBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FruitBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public FruitBuilder setShape(String shape) {
        this.shape = shape;
        return this;
    }

    public FruitBuilder setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    public Fruit createFruit() {
        return new Fruit(id, name, color, shape, flavor);
    }
}