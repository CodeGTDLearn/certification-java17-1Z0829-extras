package extras.records.mutablity;

import java.util.List;

public record MutableBook(String title, int numPages, List<String> chapters) {

}