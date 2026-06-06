public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public double getNilai() { return nilai; }
    
    public boolean lulus() {
        return nilai >= 60;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NPM: " + npm + ", Nilai: " + nilai;
    }
}