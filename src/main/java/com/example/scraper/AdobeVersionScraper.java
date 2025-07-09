package com.example.scraper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class AdobeVersionScraper {
    public static void main(String[] args) {
        // Put the actual URL of the page here, for example:
        String url = "https://get.adobe.com/reader/";

        try {
            Document doc = Jsoup.connect(url).get();

            // Select the span with the unique classes
            Element span = doc.selectFirst("span.AzbucaY8xnkGRMGFTIZw.mt-2");
            if (span != null) {
                // Get only the text directly inside the span (not inside child elements)
                String fullText = span.ownText();
                System.out.println("Full span text: " + fullText);

                // Regex to extract version number after "Version "
                String versionRegex = "Version\\s([\\d\\.]+)";
                Pattern pattern = Pattern.compile(versionRegex);
                Matcher matcher = pattern.matcher(fullText);

                if (matcher.find()) {
                    String version = matcher.group(1);
                    System.out.println("Version found: " + version);
                } else {
                    System.out.println("Version not found in the span text.");
                }
            } else {
                System.out.println("Span with class not found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
