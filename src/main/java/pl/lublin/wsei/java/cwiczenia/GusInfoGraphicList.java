package pl.lublin.wsei.java.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GusInfoGraphicList {
    public ArrayList<Infografika> infografiki;

    public GusInfoGraphicList(String nazwaPliku) {
        infografiki = new ArrayList<>();
        String contents;

        try {
            contents = new String(Files.readAllBytes(Paths.get(nazwaPliku)));
        } catch (IOException e) {
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml -> " + e.getLocalizedMessage());
            e.printStackTrace();
            contents = "";
        }

        String[] items = contents.split("<item>");
        for (int i = 1; i < items.length; i++) {
            infografiki.add(new Infografika(items[i]));
        }
    }
}
