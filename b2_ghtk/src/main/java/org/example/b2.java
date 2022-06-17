package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class b2 {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        b2 b= new b2();
        Date date1=b.getdate();
        Date date2=b.getdate();
        while (date1.before(date2)){
            System.out.println("Ngày 1 phải lớn hơn ngày2");
            date1=b.getdate();
            date2=b.getdate();
        }
        System.out.println((date1.getTime()-date2.getTime())/ (24 * 60 * 60 * 1000));



    }

    public  Date getdate() throws  Exception{
        System.out.print("Nhap ngay (dinh dang yyyy/MM/dd): ");
        String dateTypeString=sc.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
        Date date=simpleDateFormat.parse(dateTypeString);
        return date;
    }
}
