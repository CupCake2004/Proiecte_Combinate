package com.example.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AdobeVersionScraper {
    public static void main(String[] args) {
        String url = "https://get.adobe.com/reader/";
        List<VersionInfo> versionList = new ArrayList<>();

        try {
            // Connect to the Adobe Reader download page
            Document doc = Jsoup.connect(url).get();

            // Select span elements containing version info
            Elements spans = doc.select("span.AzbucaY8xnkGRMGFTIZw.mt-2");

            for (Element span : spans) {
                String versionText = span.text();
                String linkText = span.select("a").text();

                if (versionText.contains("Version")) {
                    VersionInfo info = new VersionInfo();
                    info.setProduct("Adobe Acrobat Reader");
                    info.setVersion(versionText);
                    info.setUrl(url);
                    info.setLinkText(linkText);
                    versionList.add(info);
                }
            }

            // Save to CSV
            File csvFile = new File("adobe_version_output.csv");
            try (PrintWriter writer = new PrintWriter(csvFile, StandardCharsets.UTF_8)) {
                writer.write('\ufeff'); // BOM for Excel
                writer.println("\"Product\",\"Version\",\"URL\",\"LinkText\"");

                for (VersionInfo info : versionList) {
                    List<String> row = new ArrayList<>();
                    row.add("\"" + info.getProduct() + "\"");
                    row.add("\"" + info.getVersion() + "\"");
                    row.add("\"" + info.getUrl() + "\"");
                    row.add("\"" + info.getLinkText() + "\"");
                    writer.println(String.join(",", row));
                }

                System.out.println("Saved version info to adobe_version_output.csv");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
