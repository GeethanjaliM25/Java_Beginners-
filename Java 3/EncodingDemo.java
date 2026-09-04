package com.mit.sam;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {

    public static void main(String[] args) {

        String password = "P@ssw0rd123";

        System.out.println("Original: " + password);

        // =========================
        // 1. ENCODING
        // =========================

        Encoder encoder = Base64.getEncoder();

        String encodedStr = encoder.encodeToString(password.getBytes());

        System.out.println("Encoded: " + encodedStr);

        // =========================
        // 2. DECODING
        // =========================

        Decoder decoder = Base64.getDecoder();

        byte[] decoded = decoder.decode(encodedStr);

        String decodedStr = new String(decoded);

        System.out.println("Decoded: " + decodedStr);
    }
}