package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    private static String fileName;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        reader.close();

        if ("-c".equals(args[0])) {

            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String tempStr = reader.readLine();
            String lastStrInPrice = "0       ";

            while (true) {
                if (tempStr == null) {
                    break;
                }
                lastStrInPrice = tempStr;
                tempStr = reader.readLine();
            }
            reader.close();

            int maxId = parseId(lastStrInPrice);
            int newId = maxId + 1;

            String itemInfo = getItemInfoFromKeys("crt", newId, args);

            OutputStream out = new FileOutputStream(fileName, true);
            out.write((itemInfo + "\n").getBytes());

            out.flush();
            out.close();
            return;
        }

        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String item = reader.readLine();
        List<String> items = new ArrayList<>();
        while (true) {
            if (item == null) {
                break;
            }
            items.add(item);
            item = reader.readLine();
        }
        reader.close();

        if ("-u".equals(args[0])) {

            if (!items.isEmpty()) {
                boolean itemUpdated = false;
                for (int i = 0; i < items.size(); i++) {
                    int id = parseId(items.get(i));
                    if (id == Integer.parseInt(args[1])) {

                        items.set(i, getItemInfoFromKeys("upd", id, args));
                        itemUpdated = true;
                        break;
                    }
                }

                if (itemUpdated) {
                    reWriteFile(args, items);
                }
            }
        }

        if ("-d".equals(args[0])) {

            if (!items.isEmpty()) {
                boolean itemDeleted = false;
                for (int i = 0; i < items.size(); i++) {
                    int id = parseId(items.get(i));
                    if (id == Integer.parseInt(args[1])) {
                        items.remove(i);
                        itemDeleted = true;
                        break;
                    }
                }

                if (itemDeleted) {
                    reWriteFile(args, items);
                }
            }

        }
    }

    private static void reWriteFile(String[] args, List<String> items) throws IOException {
        OutputStream out = new BufferedOutputStream(new FileOutputStream(fileName));


        long startTime = new Date().getTime();
        for (String item : items) {
            out.write((item + "\n").getBytes());
        }
        long endTime = new Date().getTime();
        System.out.println(endTime - startTime);
        out.flush();
        out.close();
    }

    private static String getItemInfoFromKeys(String mod, int id, String[] args) {
        String idStr = append(8, Integer.toString(id));
        int argsMod = 0;
        switch (mod) {
            case "crt":
                argsMod = 1;
                break;
            case "upd":
                argsMod = 2;
                break;
        }
        StringBuilder builder = new StringBuilder("");
        for (int i = argsMod; i <= args.length - 3; i++) {
            builder.append(args[i]).append(" ");
        }
        String productName = append(30, builder.toString());

        String price = append(8, args[args.length - 2]);
        String quantity = append(4, args[args.length - 1]);

        return idStr + productName + price + quantity;
    }

    private static int parseId(String str) {
        return Integer.parseInt(str.substring(0, 8).trim());
    }

    private static String append(int count, String s) {
        if (s.length() > count) {
            s = s.substring(0, count);
        } else {
            int append = count - s.length();
            for (int i = 0; i < append; i++) {
                s = s + " ";
            }
        }
        return s;
    }
}
