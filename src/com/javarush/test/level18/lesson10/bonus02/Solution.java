package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        if ("-c".equals(args[0])) {

            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String tempStr = reader.readLine();
            String countStr = "0       ";
            while(true) {
                if (tempStr == null){
                    break;
                }
                countStr = tempStr;
                tempStr = reader.readLine();
            }
            reader.close();
            String s1 = countStr.substring(0, 8);
            String s2 = s1.trim();
            int count = Integer.parseInt(s2);

            StringBuilder builder = new StringBuilder("");
            for (int i = 1; i <= args.length - 3; i++) {
                builder.append(args[i]).append(" ");
            }
            String id = append(8, Integer.toString(count + 1));
            String productName = append(30, builder.toString());
            String price = append(8, args[args.length - 2]);
            String quantity = append(4, args[args.length - 1]);

            OutputStream out = new FileOutputStream(fileName, true);
            out.write(id.getBytes());
            out.write(productName.getBytes());
            out.write(price.getBytes());
            out.write(quantity.getBytes());
            out.write("\n".getBytes());
            out.flush();
            out.close();
        }
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
