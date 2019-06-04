package com.company;

public interface Shape {
  public double calculateArea();
}

class Rectangle implements Shape{
  public double length;
  public double width;

  public double calculateArea() {
    return this.length * this.width;
  }
}

class Circle implements Shape {
  public double radius;

  public double calculateArea() {
    return (22/7) * this.radius * this.radius;
  }
}

class AreaCalculator {
  public double calculateShapeArea( Shape shape ) {
    return shape.calculateArea();
  }
}