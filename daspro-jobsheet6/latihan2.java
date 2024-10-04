import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        String jenisBuku, hariRabu;
        int jumlahBuku, harga;
        double diskon, hargaDiskon, jumlahDiskon;
        System.out.println("Apakah hari rabu (y/n) : ");
        hariRabu = input11.nextLine();
        System.out.println("Masukkan jenis buku : ");
        jenisBuku = input11.nextLine();
        System.out.println("Masukkan jumlah buku : ");
        jumlahBuku = input11.nextInt();
        System.out.println("Masukkan  harga buku : ");
        harga = input11.nextInt();

        if (hariRabu.equalsIgnoreCase("y")) {

        } if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = (1.0 - 0.1) * jumlahBuku * harga;
            if (jumlahBuku > 2) {
                hargaDiskon = (1.0 - 0.02) * diskon;
            } else {
                hargaDiskon = (diskon);
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = (1.0 - 0.07)* jumlahBuku * harga;
            if (jumlahBuku > 3) {
                hargaDiskon = (1.0 - 0.02) * diskon;
            } else {
                hargaDiskon = (1.0 - 0.01) * diskon;
            }
        } else {
            if (jumlahBuku > 3 ) {
                hargaDiskon = (1.0 - 0.05);
            } else {
                hargaDiskon = 0;
            }
        }
        System.out.println("Total harga setelah diskon : " + hargaDiskon);
        jumlahDiskon = (harga * jumlahBuku) - hargaDiskon;
        System.out.println("jumlah diskon (Rp) : " + jumlahDiskon);
    }
}
