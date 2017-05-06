package me.wxm.droidkit;

/**
 * Created by wuxm on 06/05/2017.
 * Email 380510218@qq.com
 */

public class ArrayUtils {
    public static <T> int indexOf(T[] array, T value) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static int[] stringArrayToIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }


    private ArrayUtils() {}
}
