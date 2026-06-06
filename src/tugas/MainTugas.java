public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Array String nama mata kuliah
        String[] matkul = {"Pemrograman Java", "Basis Data", "Struktur Data"};
        System.out.println("Mata Kuliah: ");
        for (String m : matkul) System.out.println("- " + m);

        // Poin 3: Inisialisasi & Tambah Mahasiswa
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "101", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "102", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "103", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "104", 45));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "105", 75));

        System.out.println("\nDaftar Mahasiswa:");
        kelas.tampilkanSemua();

        // Poin 5: Rata-rata dan Jumlah Lulus
        System.out.println("\nRata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());

        // Poin 6: Tambah objek baru
        System.out.println("\nMenambahkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fani", "106", 65));
        System.out.println("Jumlah data terbaru: " + kelas.getJumlahData());
    }
}