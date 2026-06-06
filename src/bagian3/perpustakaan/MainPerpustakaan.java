public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        perpus.tampilkanKoleksi();
        
        System.out.println("\n--- Pengujian Fitur ---");
        perpus.pinjamBuku("Bumi Manusia");
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.cariPenulis("Andrea Hirata");
        
        System.out.println("\nBuku tersedia: " + perpus.jumlahTersedia());
    }
}