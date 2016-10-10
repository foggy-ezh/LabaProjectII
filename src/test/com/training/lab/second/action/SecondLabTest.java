package test.com.training.lab.second.action;

import com.training.lab.second.action.EditionDataParser;
import com.training.lab.second.action.FileReader;
import com.training.lab.second.action.Report;
import com.training.lab.second.constant.Constant;
import com.training.lab.second.exception.CantReadDataFromFileException;
import com.training.lab.second.exception.WrongDataException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by USER on 02.10.2016.
 */
public class SecondLabTest {
    @Test
    public void getEditionsFromFileTesting(){
        FileReader fileReader = new FileReader();
        try {
            fileReader.getEditionsFromFile();
        } catch (CantReadDataFromFileException e) {
            Assert.fail(e.getMessage(),e.getCause());
        }
    }

    @Test(expectedExceptions = WrongDataException.class )
    public void getLongFromCurrentPositionTesting() throws WrongDataException {
        EditionDataParser parser = new EditionDataParser();
        parser.getLongFromCurrentPosition("0$er4;5",0);
    }

    @Test(expectedExceptions = WrongDataException.class )
    public void getStringFromCurrentPositionTesting() throws WrongDataException {
        EditionDataParser parser = new EditionDataParser();
        parser.getStringFromCurrentPosition("klkl;   ;37fh", 1);

    }

    @Test
    public void getYearFromCurrentPositiontesting() throws WrongDataException{
        EditionDataParser parser = new EditionDataParser();
        parser.getYearFromCurrentPosition("2016;1990;2088; ;0333;FEFS;",4);
    }

    @Test
    public void writerTesting(){
        Report report = new Report();
        report.recordStringData(Constant.TITLE);
    }

}
