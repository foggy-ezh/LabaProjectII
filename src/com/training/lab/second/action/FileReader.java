package com.training.lab.second.action;

import com.training.lab.second.constant.Constant;
import com.training.lab.second.exception.CantReadDataFromFileException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Created by USER on 02.10.2016.
 */
public class FileReader {

    public List<String> getEditionsFromFile() throws CantReadDataFromFileException {
        try{
            return Files.lines(Paths.get(Constant.FILE_NAME)).collect(Collectors.toList());
        } catch (IOException e) {
            throw new CantReadDataFromFileException("CANT READ DATA FROM FILE", e.getCause());
        }
    }
}
