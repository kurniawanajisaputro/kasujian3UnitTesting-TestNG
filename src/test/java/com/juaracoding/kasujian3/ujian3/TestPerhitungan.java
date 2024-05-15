package com.juaracoding.kasujian3.ujian3;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 24/04/2024 20:17
@Last Modified 24/04/2024 20:17
Version 1.0
*/
import com.juaracoding.kasujian3.ujian3.Perhitungan;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestPerhitungan {

    private Random r;
    private Perhitungan z;
    private int AngkaKesatu;
    private int AngkaKedua;


    @BeforeTest
    public void initTest(){
        r = new Random();
        z = new Perhitungan();
        AngkaKesatu = r.nextInt(100);
        AngkaKedua = r.nextInt(100);
    }
    @Test(priority = 4) //urutan kedelepan di kasujian3.xml
    //Testing fungsional penambahan
    public void addTest(){
        System.out.println("Step ke-5");
        int actual = 0;
        int expected = 0;
        System.out.println("Bilangan Pertama : " + AngkaKesatu + " Bilangan Kedua : " + AngkaKedua);
        //Proses Penambahan AngkaKesatu & AngkaKedua
        actual = z.tambah(String.valueOf(AngkaKesatu), String.valueOf(AngkaKedua));
        expected =  AngkaKesatu + AngkaKedua;
        System.out.println("Hasil Penambahan");
        System.out.println("Expected : " + expected);
        System.out.println("Actual : " + actual);
        Assert.assertEquals(actual, expected,"Hasil tidak sama");
    }
    //Testing fungsional perkalian
    @Test(priority = 0) //urutan keempat di kasujian3.xml
    public void multiplicationTest(){
        System.out.println("TestPerhitungan");
        System.out.println("Step ke-1");
        double actual = 0;
        double expected = 0;
        System.out.println("Bilangan Pertama : " + AngkaKesatu + " Bilangan Kedua : " + AngkaKedua);
        //Proses Perkalian AngkaKesatu & AngkaKedua
        actual = z.kali(String.valueOf( AngkaKesatu), String.valueOf(AngkaKedua));
        expected = (double)  AngkaKesatu * AngkaKedua;
        System.out.println("Hasil Perkalian");
        System.out.println("Expected : " + expected);
        System.out.println("Actual : " + actual);
        Assert.assertEquals(actual, expected,"Hasil tidak sama");
    }
    //Testing fungsional perbagian
    @Test(priority = 2) //urutan keenam di kasujian3.xml
    public void distributionTest(){
        System.out.println("Step ke-3");
        double actual = 0;
        double expected = 0;
        System.out.println("Bilangan Pertama : " + AngkaKesatu + " Bilangan Kedua : " + AngkaKedua);
        //Proses Pembagian AngkaKesatu & AngkaKedua
        actual = z.bagi(String.valueOf( AngkaKesatu), String.valueOf(AngkaKedua));
        expected = (double)  AngkaKesatu / AngkaKedua;
        System.out.println("Hasil Pembagian");
        System.out.println("Expected : " + expected);
        System.out.println("Actual : " + actual);
        Assert.assertEquals(actual, expected,"Hasil tidak sama");
    }
    //Testing fungsional modulus
    @Test(priority = 1) //urutan kelima di kasujian3.xml
    public void moduloTest(){
        System.out.println("Step ke-2");
        double actual = 0;
        double expected = 0;
        System.out.println("Bilangan Pertama : " + AngkaKesatu + " Bilangan Kedua : " + AngkaKedua);
        //Proses Modulus AngkaKesatu & AngkaKedua
        actual = z.modulus(String.valueOf( AngkaKesatu), String.valueOf(AngkaKedua));
        expected = (double)  AngkaKesatu % AngkaKedua;
        System.out.println("Hasil Modulos");
        System.out.println("Expected : " + expected);
        System.out.println("Actual : " + actual);
        Assert.assertEquals(actual, expected,"Hasil tidak sama");
    }
    //Testing fungsional pengurangan
    @Test(priority = 3) //urutan ketujuh di kasujian3.xml
    public void substractTest(){
        System.out.println("Step ke-4");
        double actual = 0;
        double expected = 0;
        System.out.println("Bilangan Pertama : " + AngkaKesatu + " Bilangan Kedua : " + AngkaKedua);
        //Proses Pengurangan AngkaKesatu & AngkaKedua
        actual = z.kurang(String.valueOf( AngkaKesatu), String.valueOf(AngkaKedua));
        expected = (double)  AngkaKesatu - AngkaKedua;
        System.out.println("Hasil Pengurangan");
        System.out.println("Expected : " + expected);
        System.out.println("Actual : " + actual);
        Assert.assertEquals(actual, expected,"Hasil tidak sama");
    }
}