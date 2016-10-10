package com.training.lab.second.comparator;

import com.training.lab.second.edition.AbstractEdition;

import java.util.Comparator;

/**
 * Created by USER on 09.10.2016.
 */
public class PagesComparator implements Comparator<AbstractEdition> {

    public int compare(AbstractEdition abstractEdition1, AbstractEdition abstractEdition2) {
        int result = abstractEdition1.getNumberOfPages() < abstractEdition2.getNumberOfPages() ? -1 : 1;
        return result;
    }
}