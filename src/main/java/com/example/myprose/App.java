package com.example.myprose;


import java.util.List;

public class App {
    public static void main(String[] args) {
        SimpleSentence s1 = new SimpleSentence("Hello world");
        SimpleSentence s2 = new SimpleSentence("GitHub Packages are cool");

        SimpleProse prose = new SimpleProse(List.of(s1, s2));

        System.out.println(prose.getText()); // Ausgabe: Hello world. GitHub Packages are cool.
    }
}
// This is a simple Java application that demonstrates the use of the SimpleProse and SimpleSentence interfaces.
// It creates two sentences and combines them into a prose object, then prints the combined text.
// The SimpleSentence class implements the SimpleSentence interface, and the SimpleProse class implements the SimpleProse interface.