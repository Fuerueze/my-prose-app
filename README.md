# My Prose App

Dieses Java-Projekt demonstriert die Verwendung der Bibliothek **Prose-Builder**, mit der sich aus einzelnen Sätzen flüssige Prosatexte erzeugen lassen. Es enthält eine einfache Beispielimplementierung zur Registrierung und Verarbeitung von Sätzen sowie zur Ausgabe aller enthaltenen Wörter in alphabetischer Reihenfolge.

## Voraussetzungen

- Java 17 oder höher
- Maven (zur Verwaltung der Abhängigkeiten und zum Bauen des Projekts)

## Installation

1. Repository klonen:

```bash
git clone https://github.com/Fuerueze/Uebung_4
cd Uebung_4
cd my-prose-app


2. Projekt mit Maven bauen:

```bash
mvn clean install

## Ausführung

Das Programm kann über Maven direkt gestartet werden:

```bash
mvn exec:java -Dexec.mainClass="de.htw_berlin.fb4.Fuerueze.my-prose-app"

Dabei wird ein Prosatext in der Konsole ausgegeben, basierend auf den implementierten Sätzen.

## Projektstruktur

Die zentralen Klassen befinden sich im Package de.htw_berlin.fb4.ossd.prose:

Sentence: Interface zur Repräsentation eines Satzes mit Methoden zur Textausgabe und Wortanalyse.
Prose: Interface für eine Sammlung von Sätzen.
ProseBuilder: Klasse zum Aufbau von Prosatexten aus mehreren Sätzen.
Im Unterpaket example findest du Beispielimplementierungen:

SimpleSentence: Beispiel für eine konkrete Implementierung des Sentence-Interfaces.
SimpleProse: Implementierung des Prose-Interfaces, gibt Text aus und kann alle enthaltenen Wörter alphabetisch sortiert zurückgeben.


## Abhängigkeit

Dieses Projekt nutzt prose_builder als Maven-Abhängigkeit. Der relevante Ausschnitt in der pom.xml:
<dependency>
  <groupId>de.htw_berlin.fb4.ossd</groupId>
  <artifactId>prose_builder</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>

## Lizenz

Dieses Projekt steht unter der GNU General Public License Version 3 (GPLv3). Details findest du in der Datei LICENSE.