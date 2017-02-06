package jp.ac.uryukyu.ie.e165728;
import java.util.Scanner;
// 山を作るクラス
public class Field {
    Scanner scan = new Scanner(System.in);
    private int val1 = (int)(Math.random() * 9) + 1, val2 = (int)(Math.random() * 9) + 1, val3 = (int)(Math.random() * 9) + 1;

    public int getVal1(){
        return val1;
    }
    public int getVal2(){
        return val2;
    }
    public int getVal3() { return val3; }
}

