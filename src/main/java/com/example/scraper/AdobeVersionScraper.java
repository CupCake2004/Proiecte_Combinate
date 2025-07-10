package com.example.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class AdobeVersionScraper {
    public static void main(String[] args) {
        String url = "https://get.adobe.com/reader/";
        String outputFile = "adobe_version_output.csv";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements spans = doc.select("span.AzbucaY8xnkGRMGFTIZw.mt-2");

            FileWriter writer = new FileWriter(outputFile);
            writer.write("Product,Version,URL\n");

            for (Element span : spans) {
                String versionText = span.text();
                if (versionText.contains("Version")) {
                    String product = "Adobe Acrobat Reader";
                    writer.write(product + "," + versionText + "," + url + "\n");
                    System.out.println(product + " - " + versionText);
                }
            }

            writer.close();
            System.out.println("Saved version info to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
