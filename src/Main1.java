import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        int k, i = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        k = inp.nextInt();

        while (i <= k) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
