package com.training.lab.second.factory;

import com.training.lab.second.constant.Constant;
import com.training.lab.second.edition.Book;
import com.training.lab.second.exception.WrongDataException;
import com.training.lab.second.type.BookGenre;
import com.training.lab.second.type.CoverType;
import com.training.lab.second.type.Language;
import com.training.lab.second.type.TypeOfEdition;

/**
 * Created by USER on 02.10.2016.
 */
public class BookFactory extends AbstractEditionFactory {
    @Override
    public Book getRecentEdition(String currentData) throws WrongDataException {
        if(Constant.QUANTITY_OF_BOOK_ELEMENTS != parser.getQuantityOfElements(currentData)){
            throw new WrongDataException("WRONG QUANTITY OF ELEMENTS IN Line - "+ currentData);
        }
        try {
           return new Book(TypeOfEdition.BOOK,
                    parser.getLongFromCurrentPosition(currentData,Constant.ID_POSITION),
                    parser.getStringFromCurrentPosition(currentData,Constant.NAME_POSITION),
                    parser.getStringFromCurrentPosition(currentData,Constant.PUBLISHER_POSITION),
                    parser.getIntFromCurrentPosition(currentData,Constant.NUMBER_OF_PAGES_POSITION),
             CoverType.valueOf(parser.getStringFromCurrentPosition(currentData,Constant.COVER_TYPE_POSITION).toUpperCase()),
             Language.valueOf(parser.getStringFromCurrentPosition(currentData,Constant.LANGUAGE_POSITION).toUpperCase()),
                    parser.getYearFromCurrentPosition(currentData, Constant.PUBLISHING_YEAR_POSITION),
                    parser.getStringFromCurrentPosition(currentData,Constant.AUTHOR_POSITION),
                    parser.getIntFromCurrentPosition(currentData,Constant.VOLUME_NUMBER_POSITION),
             BookGenre.valueOf(parser.getStringFromCurrentPosition(currentData,Constant.BOOK_GENRE_POSITION).toUpperCase()));
        } catch (WrongDataException | IllegalArgumentException e) {
            throw new WrongDataException("Line"+currentData+e.getMessage(), e);
        }
    }
}
