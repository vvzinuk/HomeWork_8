package com.epam.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(Messenger view, String number) {
        view.printMessage(number);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_DATA + number);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputStringValueWithScanner(Messenger view) {
        view.printMessage(view.INPUT_AUTHOR);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_AUTHOR);
            sc.next();
        }
        return sc.nextLine();
    }
}