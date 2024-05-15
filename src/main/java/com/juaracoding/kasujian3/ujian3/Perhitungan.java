package com.juaracoding.kasujian3.ujian3;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 24/04/2024 20:02
@Last Modified 24/04/2024 20:02
Version 1.0
*/
/**
 * Soal Ujian Unit Testing - TestNG Untuk Kelas Perhitungan
 */
public class Perhitungan {

    /** Fungsi aritmatika tambah-tambahan */
    public Integer tambah(String a, String b){
        return Integer.parseInt(a)+Integer.parseInt(b);
    }
    /** Fungsi aritmatika pengurangan */
    public double kurang(String a, String b){
        double douKurang = Integer.parseInt(a)-Integer.parseInt(b);
        return douKurang;
    }
    /** Fungsi aritmatika perkalian */
    public double kali(String a, String b){
        double douKali = Integer.parseInt(a)*Double.parseDouble(b);
        return douKali;
    }
    /** Fungsi aritmatika pembagian */
    public double bagi(String a, String b){
        double douBagi = Integer.parseInt(a)/Double.parseDouble(b);
        return douBagi;
    }

    /** Fungsi aritmatika modulus */
    public int modulus(String a , String b){
        return Integer.parseInt(a)%Integer.parseInt(b);
    }
}
