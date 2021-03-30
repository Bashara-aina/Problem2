import java.util.Scanner;

public class ProsessAName5026201066 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama kamu siapa?");
        String nama = scan.nextLine();
        int idx = nama.indexOf(" ");
	System.out.println(idx);
        String akhir = nama.substring(idx);
        char namaSingkat = nama.charAt(0);
        System.out.println("Your name is: " + akhir + ", " + namaSingkat +  '.' );

    }

}