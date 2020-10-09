package util;

import java.util.Scanner;

/**
 *
 * @author 8pg
 */
public class Read {

    private static Scanner read = new Scanner(System.in);

    public static String readString(String input) {
        System.out.print(input);
        return read.nextLine();
    }
}
