package io.hrushik09.bookmarker.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
    public static BookmarkDTO toDTO(Bookmark bookmark) {
        BookmarkDTO bookmarkDTO = new BookmarkDTO();
        bookmarkDTO.setId(bookmark.getId());
        bookmarkDTO.setTitle(bookmark.getTitle());
        bookmarkDTO.setUrl(bookmark.getUrl());
        bookmarkDTO.setCreatedAt(bookmark.getCreatedAt());

        return bookmarkDTO;
    }
}
