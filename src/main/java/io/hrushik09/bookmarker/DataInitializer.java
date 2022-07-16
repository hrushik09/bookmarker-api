package io.hrushik09.bookmarker;

import io.hrushik09.bookmarker.domain.Bookmark;
import io.hrushik09.bookmarker.domain.BookmarkRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "Google", "https://www.google.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Amazon", "https://www.amazon.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Twitter", "https://twitter.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Reddit", "https://www.reddit.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "GitHub", "https://github.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "JetBrains Academy", "https://hyperskill.org/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "YouTube", "https://www.youtube.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Spring Initializr", "https://start.spring.io/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "GeeksforGeeks", "https://www.geeksforgeeks.org/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Coursera", "https://www.coursera.org/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "stackoverflow", "https://stackoverflow.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "MDN Web Docs", "https://developer.mozilla.org/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Refactoring and Design Patterns", "https://refactoring.guru/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Excalidraw", "https://excalidraw.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Medium", "https://medium.com/", Instant.now()));
    }
}
