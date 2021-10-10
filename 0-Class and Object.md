---
title       : Class dan Object
author      : Deo Valiandro. M
signed-by   : Deo Valiandro. M <valiandrod@gmail.com>
---

# Class and Object

Konsep dasar dari Pemrograman Berorientasi objek sendiri adalah menyatakan
sebuah objek real kedalam bahasa bahasa pemrograman.

## Objek (object)

Objek adalah hal, perkara, benda atau orang yang menjadi pokok pembicaraan
(KBBI, 2018). Misalnya seorang manusia, seekor kucing, seekor anjing atau benda
lain, misalnya sebuah kursi. Itu adalah sebuah objek.

Nah, setiap objek pasti memiliki identitas atau atribut, misalnya seorang
manusia memiliki identitan atau atribut nama, umur, tinggi, berat dan berbagai
identitas lainnya.

Selain itu, sebuah objek juga pasti memiliki tingka laku, misalnya seorang
manusia bisa makan, tidur, berjalan, bermain, koding dan berbagai kegiatan
aktivitas lainnya.

Sebuah objek dalam PBO juga demikian, objek tersebut akan memiliki
sifat/atrribute dan perilaku/behaviour.

Sifat/atribut yang dimaksud di PBO adalah sesuatu yang memiliki nilai, seperti
ukuran, warna, berat, keterangan, dan semacamnya.

Sedangkan tingkah laku/behaviour adalah kumpulan perintah yang melakukan suatu
kegiatan spesifik.

## Class

Setiap objek memiliki blueprint atau cetakan, digunakan untuk membuat objek.
Suatu cetakan akan ditentukan apa-apa saja yang akan dimasukkan kedalam sebuah
objek. Sehingga dapat kita katakan bahwa:

> Class adalah blueprint dari objek dan objek adalah instance dari sebuah class.

Di Java, semuanya dibungkus dengan sebuah `class`. `class` adalah core dari Java
itu sendiri.

Aturan untuk `class` Java:
1. `class` dapat memiliki `public` atau default (no modifier).
2. Dapat berupa `abstract` atau `final` (`class` normal).
3. Harus mempunyai keyword `class` dan harus diikuti nama `class` yang
   berupa PascalCase.
4. Dapat meng-extend hanya sebuah `parent class`. Secara default, meng-extend
   class `Object`.
5. Variabel dan method dibungkus didalam kurung kurawal (`{}`).

Bentuk umum:

```java
class  ClassName {
     field;
     method;
}
```

Misalnya seorang anak yang baru lahir, pastilah dia akan memiliki nama, namun
kita belum memberikannya nama. Kenyataan bahwa dia akan memiliki nama, itu
dimisalkan kedalam sebuah blueprint, bahwa seorang manusia pastilah memiliki
nama, umur, perilaku, dan sebagainya.

Misalnya blueprintnya:
1. Perilaku: bernafas, makan, bergerak, melihat, ... dst.
2. Atribut: nama, umur, jenis kelamin, ... dsb.

```java
class Manusia {
    int umur;
    String nama, jenisKelamin;

    void bernafas() {}
    void makan() {}
    void berbicara() {}
}
```

Untuk menggunakan cetakan ini untuk membuat manusia, maka dapat menggunakan
perintah:

```java
Manusia deo = new Manusia();
```

maka akan muncul sebuah objek baru, dengan nama objek `deo`, dan memiliki nama,
umur, jenis kelamin, bernafas, dll.

Setiap kali objek di-instance dari sebuah class, maka objek tersebut mewarisi
atribut dan perilaku dari class yang di-intace-kan. Artinya objek *deo* yang
telah dibuat juga mempunyai atribut nama, umur dan semua atribut dan perilaku
yang ada di *class Manusia*.

Perintah `new` adalah sebuah keyword untuk mengalokasikan memory untuk object
tersebut.

Tapi, datanya belum diisi, dan masih sebatas sebuah template sehingga defaultnya
nilainya `0`/`null`/`false`, kita dapat mengisinya dengan menggunakan perintah:

```java
deo.nama = "Deo";
deo.umur = 22;
deo.jenisKelamin = "Laki-laki";
```