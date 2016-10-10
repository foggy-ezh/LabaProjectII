package com.training.lab.second.action;

import com.training.lab.second.comparator.PagesComparator;
import com.training.lab.second.constant.Constant;
import com.training.lab.second.edition.AbstractEdition;
import com.training.lab.second.exception.WrongDataException;
import com.training.lab.second.library.Library;

import java.util.Collections;

/**
 * Created by USER on 09.10.2016.
 */
public class LibraryAction {

    public void sortEditionByPages(Library library) throws WrongDataException {
        if (library == null || library.getEditionList().isEmpty()) {
            throw new WrongDataException("LIBRARY IS EMPTY");
        }
        Collections.sort(library.getEditionList(), new PagesComparator());
    }

    public String searchByEditionId(Library library, Long searchingId) throws WrongDataException {
        if (library == null || library.getEditionList().isEmpty()) {
            throw new WrongDataException("LIBRARY IS EMPTY");
        }
        for (AbstractEdition currentEdition : library.getEditionList()) {
            if (currentEdition.getEditionId() == searchingId) {
                return Constant.SEARCHING_RESULT + currentEdition.toString();
            }
        }
        return Constant.ID_NOT_FOUND + searchingId;
    }
}
