package com.javarush.test;


import java.io.*;

public class IODemo {

    public static void main(String[] args) {



        String s;
        int i = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\1.txt"))) {

            while (null != (s = bufferedReader.readLine())) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileInputStream = new FileInputStream("D:\\1.txt")) {
            while ( i != -1){
                i = fileInputStream.read();
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
