# Class and Object

Pemrograman berorientasi objek,

- berorientasi = disepertikan
- objek = manusia, hewan, laptop, monitor, buku, keyboard

Konsep dasar dari Pemrograman Berorientasi objek sendiri adalah menyatakan
sebuah objek real kedalam bahasa bahasa pemrograman.

Objek adalah hal, perkara, benda atau orang yang menjadi pokok pembicaraan
(KBBI, 2018). Misalnya seorang manusi, seekor kucing, seekor anjing atau benda
lain, misalnya sebuah kursi. Itu adalah sebuah objek.

Memiliki:
1. Perilaku, mis: manusia memiliki sifat duduk, bicara, makan, ... dsb.
2. Atribut, mis: manusia memiliki nama, umur, jenis kelamin, ... dsb.

Setiap objek memiliki blueprint atau cetakan, digunakan untuk membuat objek.
Suatu cetakan akan ditentukan apa-apa saja yang akan dimasukkan kedalam sebuah
objek.

Di Java, semuanya dibungkus dengan sebuah `class`. `class` adalah core dari Java
itu sendiri.

> Class adalah blueprint dari objek dan objek adalah instance dari sebuah class.

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

Misalnya seorang manusia manusia, blueprintnya misalnya:
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

Perintah `new` adalah sebuah keyword untuk mengalokasikan memory untuk object
tersebut.

Tapi, itu belum diisi, sehingga defaultnya nilainya `0`/`null`/`false`, kita
dapat mengisinya dengan menggunakan perintah:

```java
deo.nama = "Deo";
deo.umur = 22;
deo.jenisKelamin = "Laki-laki";
```