package com.training.lab.second.edition;

import com.training.lab.second.type.CoverType;
import com.training.lab.second.type.Language;
import com.training.lab.second.type.ScrapbookTheme;
import com.training.lab.second.type.TypeOfEdition;

/**
 * Created by USER on 30.09.2016.
 */
public class Scrapbook extends AbstractEdition{
    private String artist;
    private ScrapbookTheme scrapbookTheme;

    public Scrapbook(TypeOfEdition typeOfCurrentEdition,
                     long editionId,
                     String name,
                     String publisher,
                     int numberOfPages,
                     CoverType coverType,
                     Language editionLanguage,
                     int publishingYear,
                     String artist,
                     ScrapbookTheme scrapbookTheme) {
        super(typeOfCurrentEdition, editionId, name, publisher, numberOfPages, coverType, editionLanguage, publishingYear);
        this.artist = artist;
        this.scrapbookTheme = scrapbookTheme;
    }

    public String getArtist() {
        return artist;
    }

    public ScrapbookTheme getScrapbookTheme() {
        return scrapbookTheme;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(
                ", artist='" + artist + '\'' +
                ", scrapbookTheme=" + scrapbookTheme +
                ';');
        return stringBuilder.toString();
    }
}
