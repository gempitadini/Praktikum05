import java. util.Scanner;

public class Pemilihan2Percobaan111modif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;
        System.out.print("Masukkan Tahun: ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Adalah tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Adalah tahun kabisat");
            }  
        } else {
            System.out.println("Bukan tahun kabisat");
        }
        sc.close();  
    }
}
