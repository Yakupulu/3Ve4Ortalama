import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        int k,sum=0,total=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        k = inp.nextInt();


        for (int i = 1; i <= k; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                total++;

            }

        }
        System.out.println(sum/total);

    }
}
