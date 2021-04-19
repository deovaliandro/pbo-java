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

    @Override
    public void makan() {
        System.out.println("Ayah makan");
    }

    @Override
    public void suara() {
        System.out.println("Ayah bersuara");
    }

    @Override
    public void jalan() {
        System.out.println("Ayah berjalan");
    }
}

class Ibu extends Manusia implements Orang {

    public Ibu(String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
    }

    @Override
    public void makan() {
        System.out.println("Ibu makan");
    }

    @Override
    public void suara() {
        System.out.println("Ibu bersuara");
    }

    @Override
    public void jalan() {
        System.out.println("Ibu berjalan");
    }
}

class Main {
    public static void main(String[] args) {
        Ibu ibu = new Ibu("Dia", "P",30);

        System.out.println(ibu.getNama());
        System.out.println(ibu.getJenisKelamin());
        System.out.println(ibu.getUmur());
        ibu.jalan();
    }
}