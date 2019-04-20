package com.epam.validator;

import java.util.Calendar;
import java.util.regex.Pattern;

public class Validator {

    public static int checkPercent(int percent) throws WrongPercentException {
        if (percent < -99 || percent > 1000 ) throw new WrongPercentException();
        else return percent;
    }

    public static String checkAuthor (String author) throws WrongAuthorException{
        boolean isValid = Pattern.matches("[a-zA-Z]{1,15}", author);
        if(!isValid) throw new WrongAuthorException();
        else return author;
    }

    public static int checkYear (int year) throws WrongYearException {
        int current = Calendar.getInstance().get(Calendar.YEAR);
        if (year < 1454 || year > current) throw new WrongYearException();
        else return year;
    }

    public static class WrongAuthorException extends Exception {
        @Override
        public String getMessage() {
            return "Author's name must contain only letters and be no longer than 15 characters\n";
        }
    }

    public static class WrongPercentException extends Exception {
        @Override
        public String getMessage() {
            return "Percent value should be from -99 to 1000\n";
        }
    }

    public static class WrongYearException extends Exception {
        @Override
        public String getMessage() {
            return "Year must be between 1454 and current date\n";
        }
    }
}
