package org.java_tutorials.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
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

    public static void main(String[] args) throws IOException {
        /*LinkedHashMap<String, String> exchangeData = new LinkedHashMap<>();
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
        }*/
        // Setting URL
        String url_str = "https://open.er-api.com/v6/latest/USD";
        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();
        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();
        // Accessing object
        String req_result = jsonobj.get("rates").getAsJsonObject().get("INR").toString();
        System.out.println(req_result);
        System.out.println(jsonobj.asMap());
    }
}
