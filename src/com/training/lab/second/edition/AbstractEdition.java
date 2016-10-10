package com.training.lab.second.edition;

import com.training.lab.second.type.CoverType;
import com.training.lab.second.type.Language;
import com.training.lab.second.type.TypeOfEdition;

/**
 * Created by USER on 28.09.2016.
 */
public abstract class AbstractEdition {
    private TypeOfEdition typeOfCurrentEdition;
    private long editionId;
    private String name;
    private String publisher;
    private int numberOfPages;
    private CoverType coverType;
    private Language editionLanguage;
    private int publishingYear;


    public AbstractEdition(TypeOfEdition typeOfCurrentEdition,
                           long editionId,
                           String name,
                           String publisher,
                           int numberOfPages,
                           CoverType coverType,
                           Language editionLanguage,
                           int publishingYear) {
        this.typeOfCurrentEdition = typeOfCurrentEdition;
        this.editionId = editionId;
        this.name = name;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.coverType = coverType;
        this.editionLanguage = editionLanguage;
        this.publishingYear = publishingYear;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public long getEditionId() {
        return editionId;
    }


    public String getName() {
        return name;
    }


    public String getPublisher() {
        return publisher;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }


    public CoverType getCoverType() {
        return coverType;
    }

    public Language getEditionLanguage() {
        return editionLanguage;
    }


    public TypeOfEdition getTypeOfCurrentEdition() {
        return typeOfCurrentEdition;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(
                typeOfCurrentEdition+ ": " +
                "editionId=" + editionId +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", coverType=" + coverType +
                ", editionLanguage=" + editionLanguage +
                ", publishingYear=" + publishingYear);
        return stringBuilder.toString();
    }
}