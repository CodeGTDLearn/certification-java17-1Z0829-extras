package extras.records.constructors;

public record Constructor(String name, Integer price) {
  public Constructor(String name) {

    this(("Constructor Only Name: " + name).toUpperCase(), 10);
  }

  public Constructor(Integer price) {

    this("Constructor Only Price", price);
  }

//  public Constructor(String name, Integer price) {
//    this.name = "Custom Default Constructor: " + name;
//    this.price = price;
//  }

  public Constructor   {
    price += 100000;
    name = "Compact-Constructor Substituting Default: " + name;
  }

  public Constructor() {
    this("NoArgs-with-predefined values",5000);
  }

}