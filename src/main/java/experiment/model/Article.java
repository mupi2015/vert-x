package experiment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private String id;
    private String content;
    private String author;
    private String datePublished;
    private int wordCount;
}
