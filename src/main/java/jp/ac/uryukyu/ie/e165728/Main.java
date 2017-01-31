package jp.ac.uryukyu.ie.e165728;

public class Main {
    public static void main(String[] args){
        Play play = new Play();
        int[] a = play.getMt();
        int b = a[0]^a[1]^a[2];
        System.out.println("山は（" + a[0] + "," + a[1] + "," + a[2] + ")です。");

        if(b == 0){
            play.Player();
        }else{
            play.Computer();
        }
        System.out.println("COMの勝利です。");
    }
}
