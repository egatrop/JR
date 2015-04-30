/*
 * Copyright (c) 2005 Eugene Matyushkin
 */
package com.javarush.test.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.Iterator;
import java.nio.charset.Charset;


/**
 * CharsetTest
 *
 * @author Eugene Matyushkin
 */
public class CharsetTest {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( new FileInputStream("1.txt"), Charset.defaultCharset() ));
        SortedMap<String, Charset> charsetsMap = Charset.availableCharsets();
        System.out.println("Charsets available: "+charsetsMap.size());
        for(String name : charsetsMap.keySet()){
            Charset charset = charsetsMap.get(name);
            StringBuffer sb = new StringBuffer();
            sb.append(name);
            sb.append(" (");
            for(Iterator<String> aliases = charset.aliases().iterator();aliases.hasNext();){
                sb.append(aliases.next());
                if (aliases.hasNext())
                    sb.append(",");
            }
            sb.append(")");
            System.out.println(sb.toString());
        }
    }
}