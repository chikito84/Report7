package jp.ac.uryukyu.ie.e165728;
import java.util.Scanner;

public class Play {
    Field field = new Field();

    private int stone, num;
    private int[] Mt = {field.getVal1(), field.getVal2(), field.getVal3()};

    public void Player(){
        Scanner scan = new Scanner(System.in);
        while (Mt[0] + Mt[1] + Mt[2] != 0) {
            if(Mt[0] + Mt[1] +Mt[2] != 0) {

                System.out.println("何番目の山にしますか？");
                num = scan.nextInt();
                System.out.println(num + "番目の山からいくつ石をとりますか？");
                stone = scan.nextInt();

                if (num == 1) {
                    if (Mt[num-1] >= stone-1 && Mt[num-1] - stone >= 0 && Mt[num-1] != 0) {
                        Mt[num-1] -= stone;
                    } else {
                        System.out.println("そこから石を取ることはできません。");
                    }
                } else if (num == 2) {
                    if (Mt[num-1] >= stone-1 && Mt[num-1] - stone >= 0 && Mt[num-1] != 0) {
                        Mt[num-1] -= stone;
                    } else {
                        System.out.println("そこから石を取ることはできません。");
                    }
                } else if (num == 3) {
                    if (Mt[num-1] >= stone-1 && Mt[num-1] - stone >= 0 && Mt[num-1] != 0) {
                        Mt[num-1] -= stone;
                    } else {
                        System.out.println("そこから石を取ることはできません。");
                    }
                }else{
                    System.out.println("そこに石はありません。");
                }
                System.out.println("山は (" +Mt[0] + "," +Mt[1] + "," +Mt[2] + ")です。");
            }
            Computer();
        }
    }

    public void Computer(){

    }
}
