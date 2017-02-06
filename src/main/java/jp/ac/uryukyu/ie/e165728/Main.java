package jp.ac.uryukyu.ie.e165728;

public class Main {
     public static void main(String[] args){
        Play play = new Play();
        int[] a = play.getMt();
        int b = a[0]^a[1]^a[2];    //初期状態の山の排他的理論和
        System.out.println("山は（" + a[0] + "," + a[1] + "," + a[2] + ")です。");

        if(b == 0){               //先攻後攻を調整
            play.Player();        //山が「必勝形」ならプレイヤーを先攻とする
        }else{
            play.Computer();      //「必勝形でない状態」ならコンピュータが先攻とする
        }
        System.out.println("COMの勝利です。");
    }
}
