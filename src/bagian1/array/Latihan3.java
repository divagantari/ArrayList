public class Latihan3 {
    public static void main(String[] args) {
        double[] suhu = {25.5, 28.0, 22.3, 30.1, 26.7, 24.0};
        double max = suhu[0];
        double min = suhu[0];

        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("--- Latihan 1: Suhu ---");
        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah: " + min);
        System.out.println();

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("--- Latihan 2: Nama Hari (> 5 huruf) ---");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        System.out.println();

        int[] angka = {4, 8, 15, 16, 23, 42};
        int count = 0;
        for (int a : angka) {
            if (a % 2 == 0) {
                count++;
            }
        }
        System.out.println("--- Latihan 3: Angka Genap ---");
        System.out.println("Jumlah angka genap: " + count);
}
}