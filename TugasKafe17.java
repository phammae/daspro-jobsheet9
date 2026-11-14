import java.util.Scanner;

public class TugasKafe17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s : Rp %,d%n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("================================");

        System.out.print("\nIngin mencari menu terlebih dahulu? (y/t): ");
        String jawab = input.nextLine();

        while (jawab.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama menu yang dicari: ");
            String cariMenu = input.nextLine();

            int indeks = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(cariMenu)) {
                    indeks = i;
                    break;
                }
            }

            if (indeks != -1) {
                System.out.println("-> Menu \"" + menu[indeks] + "\" tersedia dengan harga Rp " + harga[indeks]);
            } else {
                System.out.println("-> Maaf, menu \"" + cariMenu + "\" tidak tersedia.");
            }

            System.out.print("\nCari menu lain? (y/t): ");
            jawab = input.nextLine();
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jmlItem = input.nextInt();
        input.nextLine(); 

        String[] daftarPesanan = new String[jmlItem];
        int[] hargaPesanan = new int[jmlItem];
        int totalBiaya = 0;

        for (int i = 0; i < jmlItem; i++) {
            System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
            String inputMenu = input.nextLine();

            int indeksMenu = -1;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(inputMenu)) {
                    indeksMenu = j;
                    break;
                }
            }

            if (indeksMenu != -1) {
                daftarPesanan[i] = menu[indeksMenu];
                hargaPesanan[i] = harga[indeksMenu];
                totalBiaya += harga[indeksMenu];
            } else {
                System.out.println("Menu \"" + inputMenu + "\" tidak tersedia! Silakan masukkan ulang.");
                i--; 
            }
        }

        System.out.println("\n========== STRUK PEMESANAN ==========");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.printf("%d. %-16s : Rp %,d%n", (i + 1), daftarPesanan[i], hargaPesanan[i]);
        }
        System.out.println("-------------------------------------");
        System.out.printf("Total Biaya         : Rp %,d%n", totalBiaya);

        input.close();
    }
}