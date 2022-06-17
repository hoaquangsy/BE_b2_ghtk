package org.example;

public class b3 {
    public static void main(String[] args) {

//      int tong=sumWithWhile();
        System.out.println("tong"+ sumWithDoWhile());
    }
    public static int sumWithWhile(){
        int sodau=1;
        int socuoi=10000;
        int tong=0;
        int socaphientai=0;
        while ( socaphientai <5000){
          tong=tong+sodau+socuoi;
          sodau++;
          socuoi--;
          socaphientai++;
        }
        return tong;
    }

    public static int sumWithFor(){
        int sodau=1;
        int socuoi=10000;
        int tong=0;
        int socaphientai=0;
        for (socaphientai=0; socaphientai <5000;socaphientai++){
            tong=tong+sodau+socuoi;
            sodau++;
            socuoi--;
        }
        return tong;
    }

    public static int sumWithDoWhile(){
        int sodau=1;
        int socuoi=10000;
        int tong=0;
        int socaphientai=0;
        do {
            tong=tong+sodau+socuoi;
            sodau++;
            socuoi--;
            socaphientai++;
        }while ( socaphientai <5000);

        return tong;
    }

}
