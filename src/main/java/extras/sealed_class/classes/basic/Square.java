package extras.sealed_class.classes.basic;

import lombok.Getter;

@Getter
public non-sealed class Square extends Shape {

  private final double side;

  public Square(String color, double side) {
    super(color);
    this.side = side;
  }

  @Override
  public double area() {

    return Math.pow(side,2);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}