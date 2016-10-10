package com.training.lab.second.action;

import com.training.lab.second.constant.Constant;
import com.training.lab.second.edition.AbstractEdition;
import com.training.lab.second.exception.CantReadDataFromFileException;
import com.training.lab.second.exception.DataNotFoundInFileException;
import com.training.lab.second.exception.WrongDataException;
import com.training.lab.second.factory.AbstractEditionFactory;
import com.training.lab.second.factory.BookFactory;
import com.training.lab.second.factory.MagazineFactory;
import com.training.lab.second.factory.ScrapbookFactory;
import com.training.lab.second.library.Library;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


/**
 * Created by USER on 02.10.2016.
 */
public class LibraryCreator {
private static final Logger LOGGER = LogManager.getLogger();

    public Library createSimpleLibrary(String libraryName) throws CantReadDataFromFileException, DataNotFoundInFileException, WrongDataException {
        FileReader fileReader = new FileReader();
        List<String> receivedData = fileReader.getEditionsFromFile();
        if (receivedData.isEmpty()) {
            throw new DataNotFoundInFileException("NO DATA IN FILE");
        }
        Library currentLibrary = new Library(libraryName);
        EditionDataParser parser = new EditionDataParser();
        AbstractEditionFactory factory;
        for (String currentData : receivedData) {
            try {
                switch (parser.getStringFromCurrentPosition(currentData, Constant.TYPE_OF_EDITION_POSITION).toUpperCase()) {
                    case Constant.BOOK:
                        factory = new BookFactory();
                        break;
                    case Constant.SCRAPBOOK:
                        factory = new ScrapbookFactory();
                        break;
                    case Constant.MAGAZINE:
                        factory = new MagazineFactory();
                        break;
                    default:
                        throw new WrongDataException("UNKNOWN TYPE OF EDITION IN Line - " + currentData);
                }
                AbstractEdition edition = factory.getRecentEdition(currentData);
                currentLibrary.addToEditionList(edition);

            } catch (WrongDataException e) {
                LOGGER.log(Level.ERROR, e);
            }
        }
        if (currentLibrary.getEditionList().isEmpty()) {
            throw new WrongDataException("NO CORRECT DATA IN FILE" + receivedData.toString());
        }
        return currentLibrary;
    }
}
