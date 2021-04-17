class Manusia {
    
    private String nama, jenisKelamin;
    private int umur;

    public Manusia(String nama, int umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    public void setjenisKelamin(String kelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    String getjenisKelamin() {
        return jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    int getUmur() {
        return umur;
    }

    void bernafas() {
        System.out.println("bernafas");
    }

    void makan() {
        System.out.println("makan ayam");
    }

    void berbicara() {
        System.out.println("nyenyenye");
    }
}

class Main {
    public static void main(String[] args) {
        Manusia anak = new Manusia("Deo", 22, "Laki-laki");
        System.out.println(anak.getNama() + " " + anak.getUmur() + " " + anak.getjenisKelamin());
    }
}