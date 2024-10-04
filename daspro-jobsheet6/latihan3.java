import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        
        String merk, kategori;
        int ukuran, harga;

        System.out.println("Apa merk sepatu (Convers/Sketcher/Nike) : ");
        merk = input11.nextLine();
        System.out.println("Kategori apa : ");
        System.out.println("Convers : slip on/high top");
        System.out.println("Sketcher : woman/man");
        System.out.println("Nike : kids/adult");
        System.out.print("Kategori : ");
        kategori = input11.nextLine();
        System.out.println("Berapa ukuran sepatu : ");
        System.out.println("slip on : 36-40");
        System.out.println("high top : 40-44");
        System.out.println("woman : 36-41");
        System.out.println("man : 41-44");
        System.out.println("kids : 36-40");
        System.out.println("adult : 40-44");
        System.out.print("Ukuran :");
        ukuran = input11.nextInt();

        if (merk.equalsIgnoreCase("Convers")) {
            if (kategori.equals("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equals("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harga = " + harga);
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equals("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harga = " + harga);
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran <= 36) {
                    if (ukuran >= 40) {
                        harga = 750000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equals("adult")) {
                if (ukuran <= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harga = " + harga);
                    }
                }
            }
        }
        input11.close();
    }
}
