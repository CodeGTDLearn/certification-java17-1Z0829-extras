package extras.sealed_class.classes.advanced;

import lombok.Getter;

@Getter
public final class Dog extends Animal {

  private final String movement;

  public Dog(String cover, String moveStyle) {

    super(cover);
    this.movement = moveStyle;
  }

  @Override
  public String moveStyle() {
    return movement;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}