package com.kodilla.stream.beautification;

public class PoemBeautifier {
    public void beautify(String sentence, PoemDeco poemDeco) {
        String result = poemDeco.deco(sentence);

        System.out.println("Result sentence: " + result);
    }
}
