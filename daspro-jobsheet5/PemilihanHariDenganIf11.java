import java.util.Scanner;

public class PemilihanHariDenganIf11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType;
        int bilanganBulat;

        System.out.print("Input bilangan bulat: ");
        bilanganBulat = sc.nextInt();

        if (bilanganBulat >=1 && bilanganBulat <= 5 ) {
            dayType = "weekday";
        } else if (bilanganBulat == 6 || bilanganBulat == 7) {
            dayType = "weekend";
        } else {
            dayType = "invalid number";
        }
        System.out.println(bilanganBulat + " is a " + dayType);

    
    } 
}
