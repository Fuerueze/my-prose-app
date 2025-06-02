package com.example.myprose;

import java.util.Arrays;
import java.util.List;

public class SimpleSentence implements Sentence {
    private final String text;

    public SimpleSentence(String text) {
        this.text = text;
    }

    @Override
    public List<String> getWords() {
        return Arrays.asList(text.split(" "));
    }

    @Override
    public String toString() {
        return text;
    }
}
