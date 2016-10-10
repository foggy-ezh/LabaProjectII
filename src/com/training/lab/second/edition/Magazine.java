package com.training.lab.second.edition;

import com.training.lab.second.type.CoverType;
import com.training.lab.second.type.Language;
import com.training.lab.second.type.SubjectOfMagazine;
import com.training.lab.second.type.TypeOfEdition;

/**
 * Created by USER on 30.09.2016.
 */
public class Magazine extends AbstractEdition {
    private long issueNumber;
    private SubjectOfMagazine subjectOfMagazine;

    public Magazine(TypeOfEdition typeOfCurrentEdition,
                    long editionId,
                    String name,
                    String publisher,
                    int numberOfPages,
                    CoverType coverType,
                    Language editionLanguage,
                    int publishingYear,
                    long issueNumber,
                    SubjectOfMagazine subjectOfMagazine) {
        super(typeOfCurrentEdition, editionId, name, publisher, numberOfPages, coverType, editionLanguage, publishingYear);
        this.issueNumber = issueNumber;
        this.subjectOfMagazine = subjectOfMagazine;
    }

    public long getIssueNumber() {
        return issueNumber;
    }

    public SubjectOfMagazine getSubjectOfMagazine() {
        return subjectOfMagazine;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(
                ", issueNumber=" + issueNumber +
                ", subjectOfMagazine=" + subjectOfMagazine +
                ';');
        return stringBuilder.toString();
    }
}
