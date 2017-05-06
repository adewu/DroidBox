package me.wxm.droidkit;

/**
 * Created by wuxm on 06/05/2017.
 * Email 380510218@qq.com
 */

public class StringUtil {

    public static boolean isNullString(String str){
        if (null == str)
            return true;
        if ("".equals(str))
            return true;
        return false;
    }
}
