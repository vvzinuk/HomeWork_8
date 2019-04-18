package com.epam.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(Messenger view) {
        while( !sc.hasNextInt()) {
            view.printMessage(Messages.WRONG_INPUT_INT_DATA + sc.next());
        }
        return sc.nextInt();
    }

    public static String inputStringValueWithScanner(Messenger view) {
        view.printMessage(Messages.INPUT_AUTHOR);
        while( !sc.hasNextLine()) {
            view.printMessage(Messages.WRONG_INPUT_INT_DATA + Messages.INPUT_AUTHOR);
            sc.next();
        }
        return sc.nextLine();
    }
}