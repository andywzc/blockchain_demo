package indi.wu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by wuzichao on 2018/3/14.
 */
public class HashUtil {

    private static final String SHA_ALGORITHM = "SHA-512";
    public static String sha512(byte[] bytes) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA_ALGORITHM);
            return new String(digest.digest(bytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
