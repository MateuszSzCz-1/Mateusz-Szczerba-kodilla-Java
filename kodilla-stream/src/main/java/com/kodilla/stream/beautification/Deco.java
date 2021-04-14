package com.kodilla.stream.beautification;

public class Deco {

    public static String decoToUppercase(String sentence) {
        return sentence.toUpperCase();
    }

    public static String decoWithThreeDots(String sentence) {
        return sentence + "...";
    }

    public static String decoWithSmileEmoji(String sentence) {
        return sentence + " :-D";
    }

    public static String decoWithHash(String sentence) { return "###" + sentence + "###"; }
}
