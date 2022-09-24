package extras.sealed_class.classes.basic;

import lombok.Getter;

@Getter
public final class Circle extends Shape {

  private final double radius;

  public Circle(String color, double radius) {

    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(radius,2);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}