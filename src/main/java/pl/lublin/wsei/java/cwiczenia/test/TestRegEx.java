package pl.lublin.wsei.java.cwiczenia.test;

import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {
    public static void main(String[] args) {
        String exItem = "<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Koniunktura gospodarcza w maju 2022 r.]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Fri, 27 May 2022 15:42:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-maju-2022-r-,38,71.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-maju-2022-r-,38,71.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022.png\" type=\"image/png\" width=\"2362\" height=\"4548\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";

        //Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        //Pattern pat = Pattern.compile("<link>(.*)<\\/link>");
        //Pattern pat = Pattern.compile("<media:content url=\"(.*)\" type");
        Pattern pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        //Pattern pat = Pattern.compile("type=\"(?:.*)\" width=\"(.*)\" height");
        //Pattern pat = Pattern.compile("type=\"(?:.*)\" width=\"(?:.*)\" height=\"(.*)\"");

        Matcher m = pat.matcher(exItem);
        if (m.find()) System.out.println("Znaleziono tekst: " + m.group(1));
        else System.out.println("Nie znaleziono tekstu ...");
    }
}
