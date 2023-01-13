package extras.sealed_class.more_examples;

public interface Readable_example2 {
}

sealed class Document implements Readable_example2 permits Book {
}

non-sealed class Book extends Document implements Readable_example2 {
//non-sealed class Book implements Readable2 {
}

final class Journal extends Book {
}