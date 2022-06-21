package org.example;

import java.util.Scanner;

public class b1_c2 {
    enum Thang {
        THANG1(31), THANG3(31), THANG5(31), THANG7(31), THANG8(31), THANG10(31), THANG12(31), THANG4(30), THANG6(30),
        THANG9(30), THANG11(30), THANG2(28);
        private int value;
        private Thang(int value) {
            this.value = value;
        }
        }


    public void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tháng");
        String thangNhap=scanner.nextLine();

        Thang thangEnum= Thang.values()[Integer.parseInt(thangNhap)-1];

        switch (thangEnum){
            case THANG1:
            case THANG3:
            case THANG5:
            case THANG7:
            case THANG8:
            case THANG10:
            case THANG12:
                System.out.println("Số ngày"+thangEnum.value);
                break;
            case THANG4:
            case THANG6:
            case THANG9:
            case THANG11:
                System.out.println("Số ngày"+thangEnum.value);
                break;
            case THANG2:
                System.out.println("Số ngày"+thangEnum.value);
                break;
            default:
                System.out.println("Số ngày"+thangEnum.value);
                break;
        }
    }
}
