import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        int NIM = sc.nextInt();
        System.out.print("Masukkan kelas: ");
        char Kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        int nomorAbsen = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = sc.nextInt();
        System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + NIM + ") kelas " + " nomor absen " + nomorAbsen);

        int nilaiAkhir;
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nilai akhir: " + nilaiAkhir);

        String nilaiAkhirHuruf, kualifikasi;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "c+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "c";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }
        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

    
     

    }
}