package com.macaulish.top.mylibrary;
import com.macaulish.top.mylibrary.FileUtils;
/**
 * created by hu
 * at 2018/7/5
 * in project ApplicationTest
 * description
 */
public class FileUtilJava {
    public static String test(){
        FileUtils.INSTANCE.toReadableSize(1221);
        return "test";
    }
}
