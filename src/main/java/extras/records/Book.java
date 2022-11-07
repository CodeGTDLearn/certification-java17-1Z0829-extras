package extras.records;

public record Book(String title, int numPages) {

  @Override
  public String toString() {
    return """
         This is my Book:
          -> Title: %s
          -> Numer of Pages: %s
         """.formatted(this.title, this.numPages);       }

  public boolean isPagesAbove100() {  return this.numPages > 100;  }

  @Override
  public String title() {
    return "this is My new title: " + title;            }
}