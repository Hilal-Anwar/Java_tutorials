package org.java_tutorials.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

/**
 * @author hilal on 25-03-2023
 * @project Java_tutorials
 */
public class Race {

    public static void main(String[] args) {
        LinkedHashMap<String, String> exchangeData = new LinkedHashMap<>();
        HttpClient client = HttpClient.newHttpClient();
        String CURRENCY_URL = "https://open.er-api.com/v6/latest/USD";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(CURRENCY_URL)).
                build();
        HttpResponse<String> httpResponse;
        try {
            httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            StringTokenizer stringTokenizer = new StringTokenizer(httpResponse.body(),
                    "{}");
            String data = "";
            while (stringTokenizer.countTokens() >= 1) {
                data = stringTokenizer.nextToken();

            }
            stringTokenizer = new StringTokenizer(data, ",");
            String name;
            while (stringTokenizer.hasMoreTokens()) {
                name = stringTokenizer.nextToken();
                exchangeData.put(name.substring(1, name.lastIndexOf('"')),
                        name.substring(name.indexOf(':') + 1));
            }
            System.out.println(exchangeData);
            for (var ex : exchangeData.keySet()) {
                try {
                    var currency = Currency.getInstance(ex);
                    System.out.printf("%s   %s   %s\n", currency.getDisplayName(),
                            ex, currency.getCurrencyCode());
                } catch (IllegalArgumentException illegalArgumentException) {
                    System.out.printf("Local Currency   %s   %s\n", ex, ex);
                }
            }
            System.out.println(exchangeData.size());
        } catch (IOException | InterruptedException e) {
            System.err.println("Check your connection if you are using it for first time");
            System.err.println("If you are connected to internet most recent data is used for conversion");
        }
    }
}
