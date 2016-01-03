package com.passionke.youtube.util;

/**
 * Created by passionke on 16/1/3.
 * wanliang@wacai.com
 */
public class Utils {

    public static String getApplicationPath() {
       return Utils.class.getResource("/").getPath();
    }
}
