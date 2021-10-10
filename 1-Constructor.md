---
title       : Constructor
author      : Deo Valiandro. M
date        : '2021-05-14'
signed-by   : Deo Valiandro. M <valiandrod@gmail.com>
---

# Constructor

Konstruktor adalah method yang dijalankan ketika pertama kali sebuah objek
dipanggil. Sebuah `class` tanpa konstruktor akan otomatis dibuatkan konstruktor
`default` oleh java.

Constructor adalah method tanpa return type dan nama methodnya sama dengan nama
classnya.

```java
class Manusia {
    int umur;
    String nama, jenisKelamin;

    void bernafas() {}
    void makan() {}
    void berbicara() {}

    // Ini constructor
    Manusia () {
        nama = "Nama saya ..";
        umur = 21;
        jenisKelamin = "L";
    }
}
```

Ketika dibuat sebuah objek dari class di atas dengan statement
`Employee emp = new Employee();` maka nilai attribute `name = Shelena`
dan nilai attribute `salary = 0`.

```java
class Manusia {
    int umur;
    String nama, jenisKelamin;

    void bernafas() {}
    void makan() {}
    void berbicara() {}

    // Ini constructor
    Manusia () {
        nama = "Nama saya ..";
        umur = 21;
        jenisKelamin = "L";
    }
}

public class Main {
    public static void main (String[] args) {
        Manusia manusia = new Manusia();
        System.out.println("Nama = "+ manusia.nama);
        System.out.println("Umur = "+ manusia.umur);
        System.out.println("Jenis Kelamin = "+ manusia.jenisKelamin);
    }
}
```

Java memperbolehkan sebuah class memiliki banyak constructor dengan ketentuan:

- Setiap Constructor memiliki jumlah parameter yang berbeda,
- Jumlah parameter boleh sama tetapi type data masing-masing parameternya harus
  berbeda,
- Apabila terdapat lebih dari satu constructor dalam class maka Constructor yang
  digunakan adalah constructor yang sesuai dengan ketika objek di-instansikan.

Contoh:
```java
class Manusia {
    int umur;
    String nama, jenisKelamin;

    void bernafas() {}
    void makan() {}
    void berbicara() {}

    Manusia(String nama) {
        this.nama = nama;
    }

    Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    Manusia (String nama, int umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
}

public class Main {
    public static void main (String[] args) {
        Manusia manusia1 = new Manusia("A", 22, "L");
        Manusia manusia2 = new Manusia("B", 20);
        Manusia manusia3 = new Manusia("C");       
        System.out.println("Nama 1 = "+ manusia1.nama);
        System.out.println("Nama 2 = "+ manusia2.nama);
        System.out.println("Nama 3 = "+ manusia3.nama);
    }
}

// Output
/*  Nama 1 = A 
*   Nama 2 = B
*   Nama 3 = C
*/
```
