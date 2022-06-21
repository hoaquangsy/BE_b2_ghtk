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

        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("31 ngày");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 ngày");
                break;
            case 2:
                System.out.println("28 ngày");
                break;
            default:
                System.out.println("Không hợp lệ");
                break;

        }

        }

    }

