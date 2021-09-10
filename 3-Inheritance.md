# Inheritance

Inheritance adalah pewarian sifat. Class yang berisafat umum akan mewariskan sifatnya ke class yang bersifat khusus. Misalnya class `Manusia` akan memiliki class turunan seperti `Ayah`, `Ibu` dan `Anak`.

Class `Manusia` akan memiliki atribut dan method tersendiri, misalnya `nama`, `jenisKelamin` dan `umur`. Class `Ayah` misalnya akan memiliki method dan atribut dari class `Manusia` namun akan memiliki sifat-sifat dan atribut yang khusus, seperti `suara`, `gayaBerjalan`, `warnaKulit`, dsb.

Untuk mewariskan sifat, digunakan keyword `extend`, dan untuk memanggil atribut dan method dari class induk, menggunakan keyword `super`. 

Misalnya:

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

Class `Ayah` akan mewarisi sifat-sifat dari class `Manusia`.

```java
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
```