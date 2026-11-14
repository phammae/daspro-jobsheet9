import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jmlElemen = input.nextInt();

        int[] nilai = new int[jmlElemen];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i + ".");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: angka " + key + " tidak ada di dalam " + nilai.length + " elemen array " + Arrays.toString(nilai) + ".");
        }

        input.close();
    }
}