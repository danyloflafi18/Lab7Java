package main.java.ua.lviv.iot;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public static String readInputText() throws IOException {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public final String checkUrlAddress(final String string) {
        final Pattern pattern = Pattern.compile(
                "(charmes)|(hacking)|(crack)|(xxx)");
        Matcher matcher = pattern.matcher(string);
        String result = matcher.replaceAll("");
        System.out.println(result);
        return "";
        }


    public final String showResults(final StringBuilder stringBuilder) {
        return stringBuilder.toString();
    }
}