package com.example;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;
import java.security.KeyManagementException;

public class SetSslContext {
    public static void main(String[] args) {
        try {
            // Initialize the SSL context with BCFIPS provider
            SSLContext sslContext = SSLContext.getInstance("TLS", "BCFIPS");
            sslContext.init(null, null, new java.security.SecureRandom());
            SSLContext.setDefault(sslContext);
            System.out.println("SSLContext set to BCFIPS successfully");
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }
}

