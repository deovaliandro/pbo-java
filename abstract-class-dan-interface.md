---
title       : Abstract Class dan Interface
author      : Deo Valiandro. M
date        : '2021-05-16'
signed-by   : Deo Valiandro. M <valiandrod@gmail.com>
---

## Abstract method vs Overriding

Abstract method adalah method yang ditulis untuk diimplementasikan nantinya (harus diimplementasikan).
Abstract method ini sebagai perjanjian bahwa method-method yang diberi tanda `abstract` merupakan method yang penting sehingga harus diimplementasikan.
Manfaatnya, digunakan sebagai jembatan antar class.

Perbedaan abstract method dengan overriding - Abstract harus di implementasikan sedangkan overriding itu opsional

Untuk menggunakan abstract class didalam sebuah class, digunakan keyword `abstract`, dan untuk mengimplementasikannya pada class menggunakan keyword `implement`.

```java
class One{
    One(){
        ...
    }

    abstract dataType theMethod();
}

class Main implement One {
    ...
}
```

## Interface

Interface adalah kumpulan abstract method yang digabung menjadi satu class.

```java
interface Orang{
    abstract void makan();
    abstract void suara();
    abstract void jalan();
}

class Manusia {

    private String nama, jenisKelamin;
    int umur;

    public Manusia(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

class Ayah extends Manusia implements Orang {

    public Ayah(String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
    }

    public void makan() {
        System.out.println("Ayah makan");
    }

    public void suara() {
        System.out.println("Ayah bersuara");
    }

    public void jalan() {
        System.out.println("Ayah berjalan");
    }
}

class Ibu extends Manusia implements Orang {

    public Ibu(String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
    }

    public void makan() {
        System.out.println("Ibu makan");
    }

    public void suara() {
        System.out.println("Ibu bersuara");
    }

    public void jalan() {
        System.out.println("Ibu berjalan");
    }
}
```