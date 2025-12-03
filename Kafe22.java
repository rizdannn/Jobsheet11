import java.util.Scanner;
public class Kafe22 { 
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!" ) ;

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap poembelian!");
        }
        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===============================");
        System.out.println("Silakan pilih menu yang Anda inginkan:");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: DISKON50");
            System.out.println("Diskon 50% diberikan.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: DISKON30");
            System.out.println("Diskon 30% diberikan.");
        } else {
            System.out.println("Kode promo invalid.");
        }
        
        }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, int jumlahItemBaru, String kodePromo) {

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: DISKON50");
            diskon = hargaTotal / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: DISKON30");
            diskon = (int)(hargaTotal * 0.3);
        } else {
            System.out.println("Kode promo invalid.");
        }

    return hargaTotal - diskon;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu("andi",true, "DISKON50");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        String pesanLagi = "";

        do {
            System.out.print("\nApakah ingin memesan menu lain? (y/n): ");
            pesanLagi = sc.next();

            if (pesanLagi.equalsIgnoreCase("y") || pesanLagi.equalsIgnoreCase("ya")) {

                System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
                int pilihanMenuBaru = sc.nextInt();

                System.out.print("Masukkan jumlah item: ");
                int jumlahItemBaru = sc.nextInt();

                System.out.print("Masukkan kode promo: ");
                String kodePromoBaru = sc.next();

                int totalBaru = hitungTotalHarga(pilihanMenuBaru, jumlahItemBaru, jumlahItemBaru, kodePromoBaru);

                System.out.println("Total harga pesanan: Rp" + totalBaru);
            }

        } while (pesanLagi.equalsIgnoreCase("y") || pesanLagi.equalsIgnoreCase("ya"));

        System.out.println("\nTerima kasih sudah memesan!");


    }
}