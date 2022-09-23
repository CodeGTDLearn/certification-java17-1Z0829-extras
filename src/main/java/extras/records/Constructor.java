package extras.records;

public record Constructor(String name, Integer price) {
  public Constructor(String name) {

    this(("MyName: " + name).toUpperCase(), 10);
  }

  public Constructor(Integer price) {

    this("OnlyPrice", price);
  }

  public Constructor {

    name = "NoArgs";
    price = 5000;
  }
}