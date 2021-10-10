---
title       : Polymorphism
author      : Deo Valiandro. M
date        : '2021-05-17'
signed-by   : Deo Valiandro. M <valiandrod@gmail.com>
---

Polymorphism adalah kemampuan dari suatu objek untuk merepresentasikan satu bentuk ke dalam banyak bentuk. Penggunaan paling umum dari polymorphism pada OOP terjadi ketika reference superclass digunakan untuk merujuk ke inheritance objek class.

Method ini menggunakan override yang dituliskan dalam bentuk keyword `@Override`.

```java
//Superclass
public class Manusia {
    void makan(){
        System.out.println("Manusia makan");
    }

    void tidur(){
        System.out.println("Manusia tidur");
    }

    void bergerak(){
        System.out.println("Manusia bergerak");
    }
}

public class Mahasiswa extends Manusia {
    @Override
    void makan(){
        System.out.println("Mahasiswa makan");
    }

    @Override
    void tidur(){
        System.out.println("Mahasiswa tidur");
    }

    @Override
    void bergerak(){
        System.out.println("Mahasiswa bergerak");
    }
}

public class Asisten extends Manusia {
    @Override
    void makan(){
        System.out.println("Asisten makan");
    }
    
    @Override
    void tidur(){
        System.out.println("Asisten tidur");
    }

    @Override
    void bergerak(){
        System.out.println("Asisten bergerak");
    }
}
```