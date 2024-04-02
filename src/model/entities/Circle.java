package model.entities;

public class Circle  implements Shape{
    private static final Double PI = 3.14;
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double caculateArea() {
        return PI* Math.pow(radius, 2);
    }
}
