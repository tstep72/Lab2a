package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul, adresStrony, adresGrafiki, adresMiniaturki;
    public String szerokosc, wysokosc;

    public Infografika(String tekstZPliku) {

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekstZPliku);
        if (m.find()) tytul = m.group(1);
        else tytul = "";

        pat = Pattern.compile("<link>(.*)<\\/link>");
        m = pat.matcher(tekstZPliku);
        if (m.find()) adresStrony = m.group(1);
        else adresStrony = "";

        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher(tekstZPliku);
        if (m.find()) adresGrafiki = m.group(1);
        else adresGrafiki = "";

        pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        m = pat.matcher(tekstZPliku);
        if (m.find()) adresMiniaturki = m.group(1);
        else adresMiniaturki = "";

        pat = Pattern.compile("type=\"(?:.*)\" width=\"(.*)\" height");
        m = pat.matcher(tekstZPliku);
        if (m.find()) szerokosc = m.group(1);
        else szerokosc = "";

        pat = Pattern.compile("type=\"(?:.*)\" width=\"(?:.*)\" height=\"(.*)\"");
        m = pat.matcher(tekstZPliku);
        if (m.find()) wysokosc = m.group(1);
        else wysokosc = "";
    }

}
