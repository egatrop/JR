package com.javarush.test.level04.lesson16.home01;

/*
 Я никогда не буду работать за копейки
Используя цикл вывести на экран сто раз надпись:
«Я никогда не буду работать за копейки. Амиго»
*/



import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {

  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String inputFile = reader.readLine();
        String fileToCopy = reader.readLine();
        try(FileInputStream fin = new FileInputStream(inputFile);
        FileOutputStream fout = new FileOutputStream(fileToCopy)){
       /* try(DataInputStream fin = new DataInputStream(new FileInputStream(inputFile));
            DataOutputStream fout = new DataOutputStream(new FileOutputStream(fileToCopy))){*/

            do {
                 i = fin.read();
                if (i != -1)
             fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O exception " + e);
        }


 String rafName = reader.readLine();
        double[] doubles = new double[]{1.2, 1.3, 10.2, 10.01 };
        double d;

        try (RandomAccessFile raf = new RandomAccessFile(rafName, "rw")){

for (int j = 0; j < doubles.length; j++) {
                    raf.writeDouble(doubles[j]);
                }
            for (i = 0; i <=24 ; i+=8) {
                raf.seek(i); d = raf.readDouble();
                System.out.println("from raf - " + d);

            }



        } catch (IOException e){
            System.out.println("Exception from raf" + e);
        }



      PrintWriter pw = new PrintWriter(System.out, false);
        pw.print("12312313");
        pw.print("asdsadasdsa");
        pw.print("qqqqq");
        pw.println();


        }
    }

