package com.juaracoding.kasujian3.ujian3;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 24/04/2024 20:18
@Last Modified 24/04/2024 20:18
Version 1.0
*/
import com.juaracoding.kasujian3.ujian3.FungsionalString;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Random;
public class TestFungsionalString {

        private String text;
        private Integer randomTextlenght;
        private Random r;

        @BeforeTest
        public void initTest() {
            r = new Random();
            text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            randomTextlenght = 0;
            randomTextlenght = randomizePanjangText(100);
            text = randomizeIsiText(text, randomTextlenght);
        }

        @Test(priority = 0) //urutan kedua di kasujian3.xml
        public void testGetStringLength() {
            System.out.println("TestFungsionalString");
            //Expected panjang sama dengan panjang text random
            int expectedLength = text.length();
            System.out.println("Text : " + text);
            System.out.println("Total Text : " + expectedLength);
            // Panggil the GetStringLenght fungsi
            int actualLength = new FungsionalString().getStringLength(text);
            System.out.println("Expected : " + expectedLength);
            System.out.println("Actual : " + actualLength);
            //menegaskan bahwa expected sama dengan actual
            Assert.assertEquals(expectedLength, actualLength);

        }
        @Test(priority = 1) //urutan kedua di kasujian3.xml
        public void testGetCharFromString() {
            //generate random integer dari rentang 0 sampai randomTextlenght
            int randomIndex = r.nextInt(randomTextlenght);
            System.out.println("Huruf Ke : " + randomIndex);
            //expected karakter sebuah karakter di dalam random point
            char expectedChar = text.charAt(randomIndex);
            //memanggil fungsi getCharFromString
            char actualChar = new FungsionalString().getCharFromString(text, randomIndex);
            System.out.println("Expected : " + expectedChar);
            System.out.println("Actual : " + actualChar);
            System.out.println();
            //Menegaskan expected dan actualnya sama
            Assert.assertEquals(expectedChar, actualChar);
        }
        //fungsi dari randomizePanjangText
        public static Integer randomizePanjangText(int lenghtMax){
            Random random = new Random();
            return random.nextInt(lenghtMax) + 1; //Perhitungan dari 1 sampai panjang lenghtMax
        }
        //fungsi dari randomizeIsiText
        public static String randomizeIsiText(String teks, int lenghtRandm){
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i=0; i < lenghtRandm; i++){
                int indexRandom = random.nextInt(teks.length());// Mengambil index random dari teks
                char charRandom = teks.charAt(indexRandom); // Mendapatkan char di index random
                sb.append(charRandom); // Menambahan karakter random ke StringBuilder
            }
            return sb.toString();
        }
}
