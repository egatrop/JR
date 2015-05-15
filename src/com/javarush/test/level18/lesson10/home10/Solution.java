package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> parts = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath;
        while (!"end".equals(filePath = reader.readLine())) {
            parts.put(partNumber(filePath), filePath);
        }
        reader.close();
        filePath = parts.get(1);
        int indexOfLastDot = filePath.lastIndexOf('.');
        String originFileName = filePath.substring(0, indexOfLastDot);
        OutputStream os = new BufferedOutputStream(new FileOutputStream(originFileName));

        for (Map.Entry<Integer, String> pair : parts.entrySet()) {
            InputStream is = new BufferedInputStream(new FileInputStream(pair.getValue()));
            byte[] bytes = new byte[256];
            int count;
            while ((count = is.read(bytes)) != -1) {
                os.write(bytes, 0, count);
            }
            os.flush();
            is.close();
        }
        os.close();
    }

    private static Integer partNumber(String filePath) {
        int indexOfLastDot = filePath.lastIndexOf('.');
        String partNumber = filePath.substring(indexOfLastDot + 1);
        char[] chars = partNumber.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                partNumber = partNumber.substring(1);
            }

        }
        return Integer.parseInt(partNumber);
    }
}

