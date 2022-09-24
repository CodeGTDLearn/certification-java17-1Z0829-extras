package extras.sealed_class.classes.advanced;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public sealed abstract class Animal permits Dog, Bird {

  protected String cover;

  public abstract String moveStyle();

  @Override
  public String toString() {

    final String simpleName = this.getClass()
                                  .getSimpleName();

    return """
         Animal Type: %s
         - Move Style is: %s
         - Cover is: %s
         """.formatted(simpleName, moveStyle(), cover);
  }
}