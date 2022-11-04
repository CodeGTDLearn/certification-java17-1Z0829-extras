package extras.sealed_class;

interface Readable { }

//non-sealed class Device implements Readable { }

//sealed class DocType implements Readable permits Book, Journal  { }

//final non-sealed class Book extends DocType{ }

//final class Journal extends DocType{ }