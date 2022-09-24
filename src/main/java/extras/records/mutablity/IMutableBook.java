package extras.records.mutablity;

import java.util.List;

public record IMutableBook(String title, int numPages, List<String> chapters) {
}