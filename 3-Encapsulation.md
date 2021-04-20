# Encapsulation

Dalam Java dikenal 4 macam modifier sebagai berikut. Apabila sebuah modifier tidak ditentukan maka secara otomatis compiler memberikan default modifier pada attribute atau method tersebut.
1. Public
Sebuah attribute atau method yang diberikan access modifier public artinya dapat diakses dari class yang berbeda. Penggunaan public modifier biasanya untuk method-method yang bekerja sebagai transportasi data seperti Setter Method dan Getter.

2. Protected
Sebuah attribute atau method yang diberikan access modifier protected artinya dapat diakses dari class lain yang merupakan subclassnya. Access modifier ini biasa digunakan untuk attribute dalam sebuah Class yang menjadi superclass.

3. Private
Attribute atau method dengan access modifier private hanya dapat diakses dari dalam Classnya sendiri. Umumnya sebuah method dalam sebuah class diberikan Private modifier apabila method tersebut hanya berkerja di dalam classnya sendiri atau pada method dan attribute yang harus disembunyikan dari class lain termasuk.

4. Default Modifier (blank)
Default modifier yaitu modifier yang diberikan kepada method atau attribute yang tidak ditentukan modifiernya. Sebuah attribute atau method dengan access modifier default dapat diakses dari luar Class walaupun class tersebut bukan subclassnya selama berada dalam package yang sama.

## Setter and Getter

Setter dan Getter adalah istilah untuk method dengan access modifier public yang digunakan untuk mengubah (Set) atau mengambil (Get) nilai suatu attribute private atau protected dalam sebuah Class.

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