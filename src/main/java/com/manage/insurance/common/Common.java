package com.manage.insurance.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Common {

    /**
     * Method check data isEmpty
     * 
     * @param str String to check
     * @return true if isEmpty false if notisEmpty
     */
    public static boolean isEmpty(String str) {
        if (str.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Encrypt specified signature string by MD5 algorithm
     * 
     * @param str String to encode
     * @return Encoded String
     * @throws NoSuchAlgorithmException
     */
    public static String cryptMD5(String str) {
        String result = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest.digest());
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
