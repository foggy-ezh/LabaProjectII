package com.training.lab.second.constant;

import java.util.regex.Pattern;

/**
 * Created by USER on 07.10.2016.
 */
 public class Constant {

 private Constant(){}

 public static final String FILE_NAME = "data/editionsData.txt";
 public static final String REPORT_FILE_NAME = "data/report.txt";
 public static final String LIBRARY_NAME = "National library";

 public static final String BOOK = "BOOK";
 public static final String MAGAZINE = "MAGAZINE";
 public static final String SCRAPBOOK = "SCRAPBOOK";

 public static final Long ID_FOR_SEARCH = 1L;
 public static final String ID_NOT_FOUND = "EDITION NOT FOUND WITH ID: ";
 public static final String SEARCHING_RESULT = "Searching result: ";

 public static final Pattern SPLIT_PATTERN = Pattern.compile("[;/]");
 public static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]\\d*");
 public static final Pattern WRONG_STRING_PATTERN = Pattern.compile("\\p{Blank}*");

 public static final  int QUANTITY_OF_BOOK_ELEMENTS = 11;
 public static final  int QUANTITY_OF_MAGAZINE_ELEMENTS = 10;
 public static final  int QUANTITY_OF_SCRAPBOOK_ELEMENTS = 10;

 public static final int TYPE_OF_EDITION_POSITION = 0;
 public static final int ID_POSITION = 1;
 public static final int NAME_POSITION = 2;
 public static final int PUBLISHER_POSITION = 3;
 public static final int NUMBER_OF_PAGES_POSITION = 4;
 public static final int COVER_TYPE_POSITION = 5;
 public static final int LANGUAGE_POSITION = 6;
 public static final int PUBLISHING_YEAR_POSITION = 7;
 public static final int AUTHOR_POSITION = 8;
 public static final int ARTIST_POSITION = 8;
 public static final int ISSUE_NUMBER_POSITION = 8;
 public static final int VOLUME_NUMBER_POSITION = 9;
 public static final int SCRAPBOOK_THEME_POSITION = 9;
 public static final int SUBJECT_OF_MAGAZINE_POSITION = 9;
 public static final int BOOK_GENRE_POSITION = 10;

 public static final String TITLE = "————————————————————————————————————————————————";
}
