package me.wxm.droidkit;

import android.content.Context;

/**
 * Created by wuxm on 06/05/2017.
 * Email 380510218@qq.com
 */

public class BuildUtils {

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    public static void throwOrPrint(Throwable throwable) {
        if (BuildConfig.DEBUG) {
            throwRuntimeException(throwable);
        } else {
            throwable.printStackTrace();
        }
    }

    private static void throwRuntimeException(Throwable throwable) {
        if (throwable instanceof RuntimeException) {
            throw (RuntimeException) throwable;
        } else {
            throw new RuntimeException(throwable);
        }
    }




    private BuildUtils() {}
}
