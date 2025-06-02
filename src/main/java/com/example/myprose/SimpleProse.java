package com.example.myprose;


import java.util.List;
import java.util.stream.Collectors;

public class SimpleProse implements Prose {
    private final List<Sentence> sentences;

    public SimpleProse(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String getText() {
        return sentences.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(". ")) + ".";
    }
}
