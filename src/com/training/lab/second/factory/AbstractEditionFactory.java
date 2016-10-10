package com.training.lab.second.factory;

import com.training.lab.second.action.EditionDataParser;
import com.training.lab.second.edition.AbstractEdition;
import com.training.lab.second.exception.WrongDataException;

/**
 * Created by USER on 02.10.2016.
 */
public abstract class AbstractEditionFactory {
    public EditionDataParser parser = new EditionDataParser();
    public abstract AbstractEdition getRecentEdition(String currentData) throws WrongDataException;
}
