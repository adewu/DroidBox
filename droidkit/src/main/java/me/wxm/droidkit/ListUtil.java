package me.wxm.droidkit;

import java.util.List;

/**
 * Created by wuxm on 06/05/2017.
 * Email 380510218@qq.com
 */

public class ListUtil {

    public static boolean isNullList(List list){
        if (null == list)
            return true;
        if (0 == list.size())
            return true;
        return false;
    }
}
