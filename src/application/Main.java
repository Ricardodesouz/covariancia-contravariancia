package application;

import model.entities.Circle;
import model.entities.Shape;
import model.entities.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        Circle circle= new Circle(12.24);

        circles.add(new Circle(25.22));
        circles.add(new Circle(30.22));

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(33.88,10.00));
        triangles.add(new Triangle(44.88, 10.00));

        totalArea(circles);
        totalArea(triangles);
        






    }
    public static Double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for( Shape shapes: list){
            sum = shapes.caculateArea();
        }
        System.out.printf("total area: %.2f \n", sum);
        return sum;
        }

    }

