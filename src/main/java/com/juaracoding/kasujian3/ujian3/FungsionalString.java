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
 * Soal Ujian Unit Testing - TestNG Untuk Kelas Fungsional String
 */
public class FungsionalString {

    /** mengambil karakter dari index suatu string */
    public Character getCharFromString(String s, int intPointer){
        return s.charAt(intPointer);
    }

    /** mendapatkan informasi panjang string */
    public Integer getStringLength(String s){
        return s.length();
    }
}

