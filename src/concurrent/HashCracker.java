package concurrent;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCracker {

    private static final String alphabet = getAlphabet();
    private static final String hashToCrack1 =
            "8acc8c0c32ada9bb46fe682f50331fe8ba68fbf93d6ae0125ba980abb4df89f1";
    private static final String hashToCrack2 =
            "f1e524a4cf9bf9e5df8cc0f745fa190f42a0aecdd75263361135a9013c1195a0";

    public static void main(String[] args) {

        String plainText = "hello";

        System.out.println(sha256(plainText));

    }

    private static String sha256(String plainText) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        byte[] bytes = digest.digest(plainText.getBytes(StandardCharsets.UTF_8));

        return bytesToHex(bytes);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte byteValue : bytes) {
            String hex = Integer.toHexString(0xff & byteValue);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    private static String getAlphabet() {
        StringBuilder sb = new StringBuilder();
        for (char i = 48; i < 123; i++) {
            sb.append(i);
        }

        return sb.toString();
    }


}

