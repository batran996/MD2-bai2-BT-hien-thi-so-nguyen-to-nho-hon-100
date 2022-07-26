import sun.awt.SunToolkit;

import java.util.Scanner;

public class Main {
    private static int j;

    public static boolean checkPrime(int j){
        if (j <=2){
            return true;
        }else {
            for (int i = 2; i <= Math.sqrt(j) ; i++) {
                if (j % i == 0){
                    return false;
                }


            }
            return true;

        }
    }
    public static void main(String[] args) {
        System.out.println("hien thi so nguyen to ");
        System.out.println("bạn cần hiển thị số đến bao nhiêu ?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        int count = 0;
        if (a == 1) {
            System.out.println("2");
        } else {
            int j = 2;
            while (j<= a){
                if (checkPrime(j)){
                    System.out.println(j);
//                    count++;
                }
                j++;
            }
        }
    }

}