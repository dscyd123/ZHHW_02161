package com.aiton.administrator.shane_library.shane.utils;

/**
 * Created  on 2016/11/17.
 */

public class ClickUtils {

    private static long lastClickTime;
    private final static int SPACE_TIME = 1000;

    public static void initLastClickTime() {
        lastClickTime = 0;
    }

    public synchronized static boolean isFastDoubleClick() {
        long currentTime = System.currentTimeMillis();
        boolean isClick2;
        if (currentTime - lastClickTime >
                1000) {
            isClick2 = false;
        } else {
            isClick2 = true;
        }
        lastClickTime = currentTime;
        return isClick2;
    }
    public synchronized static boolean isFastDoubleClick(int space_time) {
        long currentTime = System.currentTimeMillis();
        boolean isClick2;
        if (currentTime - lastClickTime >
                space_time) {
            isClick2 = false;
        } else {
            isClick2 = true;
        }
        lastClickTime = currentTime;
        return isClick2;
    }
}

