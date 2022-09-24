package extras.sealed_class.classes.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public sealed abstract class Shape permits Circle, Square {

  protected String color;

  public abstract double area();

  @Override
  public String toString() {

    return """
         That's my %s:
         - Area: %.2f
         - Color: %s
         """.formatted(this.getClass(),area(),color);
  }
}