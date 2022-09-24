package extras.records.constructors;

public record Constructor(String name, Integer price) {
  public Constructor(String name) {

    this(("MyName: " + name).toUpperCase(), 10);
  }

  public Constructor(Integer price) {

    this("OnlyPrice", price);
  }

  public Constructor() {
    this("NoArgs-with-predefined values",5000);
  }

}