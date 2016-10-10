package com.training.lab.second.action;

import com.training.lab.second.constant.Constant;
import com.training.lab.second.exception.CantReadDataFromFileException;
import com.training.lab.second.exception.DataNotFoundInFileException;
import com.training.lab.second.exception.WrongDataException;
import com.training.lab.second.library.Library;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by USER on 02.10.2016.
 */
public class Runner {
    public static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LibraryCreator simpleLibrary = new LibraryCreator();
        LibraryAction libraryAction = new LibraryAction();
        Report report = new Report();
        try {
            Library nationalLibrary = simpleLibrary.createSimpleLibrary(Constant.LIBRARY_NAME);
            libraryAction.sortEditionByPages(nationalLibrary);
            String searchingResult = libraryAction.searchByEditionId(nationalLibrary, Constant.ID_FOR_SEARCH);
            report.recordLibraryData(nationalLibrary);
            report.recordStringData(searchingResult);
        } catch (CantReadDataFromFileException | WrongDataException | DataNotFoundInFileException e) {
            LOGGER.log(Level.FATAL, e);
            throw new RuntimeException();
        }
    }
}
