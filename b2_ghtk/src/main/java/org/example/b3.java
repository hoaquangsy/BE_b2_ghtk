package org.example;

public class b3 {
    public static void main(String[] args) {

//      int tong=sumWithWhile();
        System.out.println("tong"+ sumWithWhile());


    }
    public static int sumWithWhile(){
        int sodau=1;
        int socuoi=10000;
        int tong=0;
        while ( sodau <=socuoi){
            if (check(sodau)){
                tong+=sodau;
            }
            sodau++;
        }
        return tong;
    }

    public static int sumWithFor(){
        int tong=0;
        for (int i=0; i <=10000;i++){
            if (check(i)){
                tong+=i;
            }
        }
        return tong;
    }

    public static int sumWithDoWhile(){
        int sodau=1;
        int socuoi=10000;
        int tong=0;
        do {
            if (check(sodau)){
                tong+=sodau;
            }
            sodau++;
        }while ( sodau <=socuoi);

        return tong;
    }

    public static boolean check(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }

        }
        return true;
    }

}
