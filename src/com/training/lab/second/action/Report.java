package com.training.lab.second.action;

import com.training.lab.second.constant.Constant;
import com.training.lab.second.edition.AbstractEdition;
import com.training.lab.second.library.Library;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by USER on 09.10.2016.
 */
public class Report {
    private final Logger LOGGER = LogManager.getLogger();

    public void recordLibraryData(Library library){
        recordStringData(Constant.TITLE);
        recordStringData(library.getName());
        recordStringData(Constant.TITLE);
        for(AbstractEdition edition : library.getEditionList()){
            recordStringData(edition.toString());
        }
        recordStringData(Constant.TITLE);
    }

    public void recordStringData(String str){
        try {
            Files.write(Paths.get(Constant.REPORT_FILE_NAME), (str+"\r\n").getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        }
    }
}
