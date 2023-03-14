package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static final int PORT = 8080;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        try (Socket clientSocet = new Socket(HOST, PORT);
             PrintWriter out = new PrintWriter(clientSocet.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocet.getInputStream()))) {
            out.println("Evgeniy");
            String resp = in.readLine();
            System.out.println(resp);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}



