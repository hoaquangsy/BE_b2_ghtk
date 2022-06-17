package org.example;

import java.util.Scanner;

public class b1_c2 {
    enum Thang {
        thangle(1),
        thangchan(3),
        thang2(2);

        private int value;
        private Thang(int value) {
            this.value = value;
        }
        }

        class Check{
        Thang thangEnum;
          public  Check(Thang thangEnum){
            this.thangEnum=thangEnum;
          }

          public void CountDay(){
              switch (thangEnum){
                  case thang2:
                      System.out.println("28 ngày");
                      break;
                  case thangle:
                      System.out.println("31 ngày");
                       break;
                  case  thangchan:
                      System.out.println("30 ngày");
                      break;
                  default:
                     System.out.println("Nhập tháng");
                     break;
              }
          }

        }
    public void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tháng");
        int thang=Integer.parseInt(scanner.nextLine());
        int du=thang%2;

        if (thang==2){
            Check check= new Check(Thang.thang2);
            check.CountDay();
        } else if (du==0) {
            Check check= new Check(Thang.thangchan);
            check.CountDay();
        }else {
            Check check= new Check(Thang.thangle);
            check.CountDay();
        }
    }
}
