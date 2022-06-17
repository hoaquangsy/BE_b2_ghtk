package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class b1_c1
{
    public static void main( String[] args )
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tháng");
        int thang=Integer.parseInt(scanner.nextLine());
        int du=thang%2;
        if (thang==2){
            System.out.println("28 ngày");
            return;
        }
        switch (du){
            case 1:
                System.out.println("31 ngày");
                break;
            case 0:
                System.out.println("30 ngày");
                break;

        }

    }
}
