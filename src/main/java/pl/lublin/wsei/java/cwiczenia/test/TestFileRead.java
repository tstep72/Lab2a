package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

//wzorce regularne:
//  tytuł:      <title><!\\[CDATA\\[(.*)\\]\\]
//  adresStrony     <link>(.*)<\\/link>
//  adresGrafiki    <media:content url="(.*)" type
//  adresMiniaturki     <media:thumbnail url="(.*)"
//  szerokosc       type=\"(?:.*)\" width=\"(.*)\" height"
//  wysokosc        type="(?:.*)" width="(?:.*)" height="(.*)"

public class TestFileRead {
    public static void main(String[] args) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("ZAWARTOŚĆ PLIKU gusInfoGraphic.xml");
            System.out.print(contents);
        }
        catch (IOException e) {
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml -> " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
