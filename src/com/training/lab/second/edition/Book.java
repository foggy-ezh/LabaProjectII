package com.training.lab.second.edition;

import com.training.lab.second.type.CoverType;
import com.training.lab.second.type.Language;
import com.training.lab.second.type.BookGenre;
import com.training.lab.second.type.TypeOfEdition;

/**
 * Created by USER on 28.09.2016.
 */
public class Book extends AbstractEdition {
    private String author;
    private int volumeNumber;
    private BookGenre bookGenre;

    public Book(TypeOfEdition typeOfCurrentEdition,
                long editionId,
                String name,
                String publisher,
                int numberOfPages,
                CoverType coverType,
                Language editionLanguage,
                int publishingYear,
                String author,
                int volumeNumber,
                BookGenre bookGenre) {
        super(typeOfCurrentEdition, editionId, name, publisher, numberOfPages, coverType, editionLanguage, publishingYear);
        this.author = author;
        this.volumeNumber = volumeNumber;
        this.bookGenre = bookGenre;
    }

    public String getAuthor() {
        return author;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public BookGenre getBookBookGenre() {
        return bookGenre;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(
                ", author='" + author + '\'' +
                ", volumeNumber=" + volumeNumber +
                ", bookGenre=" + bookGenre +
                ';');
        return stringBuilder.toString();
    }
}
