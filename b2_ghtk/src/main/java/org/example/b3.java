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
        int i=0;
        while ( i <10000){
          tong=tong+sodau+socuoi;
          sodau++;
          socuoi--;
          i++;
        }
        return tong;
    }

    public static int sumWithFor(){
        int sodau=1;
        int socuoi=10000;
        int tong=0;
        int i=0;
        for (i=0; i <10000;i++){
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
        int i=0;
        do {
            tong=tong+sodau+socuoi;
            sodau++;
            socuoi--;
            i++;
        }while ( i <10000);

        return tong;
    }

}
