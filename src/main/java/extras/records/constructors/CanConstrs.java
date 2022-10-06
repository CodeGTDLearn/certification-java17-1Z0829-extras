package extras.records.constructors;

public record CanConstrs(int id, String name) {

    // non-canonical constructor
    // must invoke another constructor
  public CanConstrs() {
    this(10, ""); //this line is required
  }

  //canonical constructor
  public CanConstrs(int id, String name) {
    this.id = id;
    this.name = name;
  }
}