---
title       : Encapsulation
author      : Deo Valiandro. M
date        : '2021-05-15'
signed-by   : Deo Valiandro. M <valiandrod@gmail.com>
---

Encapsulation atau enkapsulasi adalah pembatasan akses terhadap suatu atribut,
method atau konstruktor dalam suatu class. Enkapsulasi memastikan bahwa hanya
program hanya dapat diakses oleh yang diberi izin saja.

## 1. Access Modifier
Access modifier adalah tingkat level akses yang dapat diberikan. Secara umum,
dalam Java ada 4 macam jenis modifier, yaitu: public, private, protected dan
default modifier (blank). Apabila sebuah modifier tidak ditentukan maka secara
otomatis compiler memberikan default modifier pada attribute atau method
tersebut.

1. Public
Sebuah attribute atau method yang diberikan access modifier public artinya dapat
diakses dari class yang berbeda. Penggunaan public modifier biasanya untuk
method-method yang bekerja sebagai transportasi data seperti Setter Method dan
Getter.

2. Protected
Sebuah attribute atau method yang diberikan access modifier protected artinya
dapat diakses dari class lain yang merupakan subclassnya. Access modifier ini
biasa digunakan untuk attribute dalam sebuah Class yang menjadi superclass.

3. Private
Attribute atau method dengan access modifier private hanya dapat diakses dari
dalam Classnya sendiri. Umumnya sebuah method dalam sebuah class diberikan
Private modifier apabila method tersebut hanya berkerja di dalam classnya
sendiri atau pada method dan attribute yang harus disembunyikan dari class lain
termasuk.

4. Default Modifier (blank)
Default modifier yaitu modifier yang diberikan kepada method atau attribute yang
tidak ditentukan modifiernya. Sebuah attribute atau method dengan access
modifier default dapat diakses dari luar Class walaupun class tersebut bukan
subclassnya selama berada dalam package yang sama.

Tabel jangkauan untuk tiap modifier:

|Modifier|Class|Package|Subclass|World|
|---|---|---|---|---|
|public|Y|Y|Y|Y|
|protected|Y|Y|Y|N|
|default modifier|Y|Y|N|N|
|private|Y|N|N|N|

Keterangan:
- Y artinya bisa diakses,
- N artinya tidak bisa diakses,
- Subclass artinya class anak,
- World artinya seluruh package di aplikasi.

## Setter and Getter

Setter dan Getter adalah istilah untuk method dengan access modifier public yang
digunakan untuk mengubah (Set) atau mengambil (Get) nilai suatu attribute
private atau protected dalam sebuah Class.

> Setter adalah sarana untuk mengambil nilai di dalam sebuah *atribut private*

> Getter adalah sarana untuk mengubah nilai di dalam sebuah *atribut private*

Setter dan getter ini memiliki akses *public*, sehingga dapat diakses kelas
lainnya, sedangkan method utamanya tidak perlu diketahui oleh orang lain.

```java
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
```