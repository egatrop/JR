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
19847983Куртка для сноубордистов, разм10173.991234    e:\price.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        File file = new File(fileName);

        String id = append(8, Integer.toString((int) ((file.length()) / 81 + 1)));
        System.out.println(file.length());
        String productName = append(60, args[1]);
        String price = append(8, args[2]);
        String quantity = append(4, args[3]);

        OutputStream out = new FileOutputStream(fileName, true);
        out.write(id.getBytes());
        out.write(productName.getBytes());
        out.write(price.getBytes());
        out.write(quantity.getBytes());
        out.write("\n".getBytes());

    }

    private static String append(int count, String s) {
        if ( s.length() > count) {
            s = s.substring(0, count + 1);
        } else {
            int append = count - s.length();
            for (int i = 0; i < append; i++) {
                s = s + " ";
            }
        }
        return s;
    }
}
