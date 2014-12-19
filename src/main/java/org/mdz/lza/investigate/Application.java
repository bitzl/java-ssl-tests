package org.mdz.lza.investigate;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Application {

    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            URL url = new URL(args[0]);
            println("Create connection to " + url);
            URLConnection connection = url.openConnection();
            println("Get some content...");
            connection.getContent();
            println("OK");
        }
        else {
            println("Usage: java -jar ssl-handshake.jar URL");
        }
    }

    public static void println(String line) {
        System.out.println(line);
    }

}
