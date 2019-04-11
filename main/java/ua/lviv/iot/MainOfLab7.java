package main.java.ua.lviv.iot;

import java.io.IOException;

public class MainOfLab7 {
    public static void main(final String[] args) throws IOException {
         System.out.println("Type please your text: ");
         String inputText = StringProcessor.readInputText();
         StringProcessor stringProcessor = new StringProcessor();
         System.out.println(stringProcessor.checkUrlAddress(inputText));
         }
     }