public class Kafe22 { 
    public static void menu(String namaPelanggan, boolean isMember) {
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
        
    }
    public static void hitungTotal(double totalBelanja, String kodePromo) {

         System.out.println("Total belanja: Rp " + totalBelanja);

        if (kodePromo.equals("DISKON50")) {
            double diskon = totalBelanja * 0.50;
            System.out.println("Diskon 50% diberikan: Rp " + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            double diskon = totalBelanja * 0.30;
            System.out.println("Diskon 30% diberikan: Rp " + diskon);
        } else {
            System.out.println("Kode promo invalid");
        }
     
}
    public static void main(String[] args) {
        menu("andi",true);
        System.out.print("\n");
        hitungTotal(100000, "DISKON50");
    }
}