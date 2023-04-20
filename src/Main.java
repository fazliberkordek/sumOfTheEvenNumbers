/**
 * @author fazliberkordek
 */

import java.util.Scanner;

//Todo:
// Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, modFourTotal = 0, otherEvens = 0;
        //
        do {
            System.out.print("Please type a number:");
            n = input.nextInt();
            //Check wheter the  number is mod of 4 true :
            if (n % 4 == 0) {
                modFourTotal += n;
            } else {
                otherEvens += n;
            }
        } while (n % 2 == 0); // Until number is odd,the user will able flow.
        System.out.print("Total is :" + modFourTotal);
        System.out.println(" and the other evens total is : " + otherEvens);

    }
}