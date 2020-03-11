package org.dp.birdes.bo;

public abstract class Bird {
    private String name;
    private double weight;

    public Bird(){}

    public Bird(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //public abstract void fly();


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
