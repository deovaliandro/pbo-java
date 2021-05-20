# Class and Object

Pemrograman berorientasi objek,

- berorientasi = disepertikan
- objek = manusia, hewan, laptop, monitor, buku, keyboard

Konsep dasar dari Pemrograman Berorientasi objek sendiri adalah menyatakan sebuah objek real kedalam bahasa bahasa pemrograman.

Objek adalah hal, perkara, benda atau orang yang menjadi pokok pembicaraan (KBBI, 2018).
Misalnya seorang manusi, seekor kucing, seekor anjing atau benda lain, misalnya sebuah kursi. Itu adalah sebuah objek.

Memiliki:
1. Perilaku, mis: manusia memiliki sifat duduk, bicara, makan, ... dsb.
2. Atribut, mis: manusia memiliki nama, umur, jenis kelamin, ... dsb.

Setiap objek memiliki blueprint atau cetakan, digunakan untuk membuat objek.
Suatu cetakan akan ditentukan apa-apa saja yang akan dimasukkan kedalam sebuah objek.

> Class adalah blueprint dari objek.

Misalnya manusia, blueprintnya mis:
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

Untuk menggunakan cetakan ini untuk membuat manusia, maka dapat menggunakan perintah:

```java
Manusia deo = new Manusia();
```

maka akan muncul sebuah objek baru, dengan nama objek `deo`, dan memiliki nama, umur, jenis kelamin, bernafas, dll.

Tapi, itu belum diisi, sehingga defaultnya nilainya `0`/`null`/`false`, kita dapat mengisinya dengan menggunakan perintah:

```java
deo.nama = "Deo";
deo.umur = 22;
deo.jenisKelamin = "Laki-laki";
```