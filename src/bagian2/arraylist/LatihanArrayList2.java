import java.util.ArrayList;

public class LatihanArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(45);
        angka.add(23);
        angka.add(89);
        angka.add(56);
        
        int max = angka.get(0);
        for (int n : angka) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Nilai terbesar: " + max);
    }
}