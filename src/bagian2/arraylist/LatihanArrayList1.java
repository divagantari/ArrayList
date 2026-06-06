import java.util.ArrayList;

public class LatihanArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Apel");
        daftarBelanja.add("Jeruk");
        daftarBelanja.add("Mangga");
        daftarBelanja.add("Anggur");
        
        // Hapus item ke-2 (index 1)
        daftarBelanja.remove(1);
        
        System.out.println("Isi daftar belanja: " + daftarBelanja);
        System.out.println("Jumlah akhir: " + daftarBelanja.size());
    }
}
