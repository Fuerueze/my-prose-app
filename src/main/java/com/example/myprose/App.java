/*
 * This file is part of My Prose App.
 *
 * Copyright (C) 2025 Fürüze Saritoprak
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */


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