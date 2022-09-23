package extras.records;

import java.util.List;

public record MutableBook(String title, int numPages, List<String> chapters) {

}