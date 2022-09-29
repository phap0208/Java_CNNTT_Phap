

import java.util.Scanner;

//Viết chương trình tính tổng của các chữ số của môt số nguyên n trong java.
// Số nguyên dương n được nhập từ bàn phím.
// Với n = 1234, tổng các chữ số: 1 + 2 + 3 + 4 = 10
public class bai2 {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhap số nguyên dương n = ");
        int n = scanner.nextInt();
        System.out.printf("Tổng của các chữ số "
                + "của %d là: %d", n, totalDigitsOfNumber(n));
    }

    /**
     * Tính tổng của các chữ số của một số nguyên dương
     *
     * @param n: số nguyên dương
     * @return
     */
    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}