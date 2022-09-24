package extras.sealed_class.classes.advanced;

import lombok.Getter;

@Getter
public sealed class Bird extends Animal permits Chicken, Falcon {
  private final String movement;
  private final String type;

  public Bird(String cover, String moveStyle, String type) {

    super(cover);
    this.movement = moveStyle;
    this.type = type;
  }

  @Override
  public String moveStyle() {

    return movement;
  }

  @Override
  public String toString() {

    final String simpleName = this.getClass()
                                  .getSimpleName();
    return """
         Bird Type: %s
         - Move Style is: %s
         - Cover is: %s
         - Type is: %s
         """.formatted(simpleName, moveStyle(), cover, type);
  }

  public String type() {

    return movement;
  }
}