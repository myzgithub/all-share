package com.risker.allshared.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Created by myz on 16/8/28.
 */
public class PropertiesUtil {
    private PropertiesUtil(){}

    private Properties properties = new Properties();

    public void init(){

        File file = new File("");
        try {
            new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

//        properties.load();

    }

    public static String getValueByKey(String key){

        return null;
    }
}
