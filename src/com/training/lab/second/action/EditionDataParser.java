package com.training.lab.second.action;


import com.training.lab.second.constant.Constant;
import com.training.lab.second.exception.WrongDataException;


import java.time.Year;

/**
 * Created by USER on 07.10.2016.
 */
public class EditionDataParser {


    public String getStringFromCurrentPosition(String currentData, int position) throws WrongDataException {
        String str = Constant.SPLIT_PATTERN.split(currentData)[position];
        if (Constant.WRONG_STRING_PATTERN.matcher(str).matches()) {
            throw new WrongDataException(" CAN'T GET String POSITION [" + position + "]");
        }
        return str;
    }

    public long getLongFromCurrentPosition(String currentData, int position) throws WrongDataException {
        String str = Constant.SPLIT_PATTERN.split(currentData)[position];
        if (!Constant.NUMBER_PATTERN.matcher(str).matches()) {
            throw new WrongDataException(" CAN'T GET Long POSITION [" + position + "]");
        }
        return Long.parseLong(str);
    }

    public int getIntFromCurrentPosition(String currentData, int position) throws WrongDataException {
        String str = Constant.SPLIT_PATTERN.split(currentData)[position];
        if (!Constant.NUMBER_PATTERN.matcher(str).matches()) {
            throw new WrongDataException(" CAN'T GET Integer POSITION [" + position + "]");
        }
        return Integer.parseInt(str);
    }

    public int getQuantityOfElements(String currentData) {
        System.out.print(Constant.SPLIT_PATTERN.split(currentData).length);
        return Constant.SPLIT_PATTERN.split(currentData).length;
    }

    public int getYearFromCurrentPosition(String currentData, int position) throws WrongDataException {
        String str = Constant.SPLIT_PATTERN.split(currentData)[position];
        if (!Constant.NUMBER_PATTERN.matcher(str).matches()) {
            throw new WrongDataException(" CAN'T GET Year POSITION [" + position + "]");
        }
        if (Integer.parseInt(str) > Year.now().getValue()) {
            throw new WrongDataException(" WRONG YEAR [" + str + " ]");
        }
        return Integer.parseInt(str);
    }
}
