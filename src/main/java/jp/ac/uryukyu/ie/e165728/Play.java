package jp.ac.uryukyu.ie.e165728;
import java.util.Scanner;

public class Play {
    Field field = new Field();

    private int stone, num, ex, k, i, n, kk;
    private int[] Mt = {field.getVal1(), field.getVal2(), field.getVal3()};   //ランダムでそれぞれの山の石の数を決定

    public int[] getMt(){return Mt;}

    public void Player(){         //プレイヤーによる山の選択、石の取捨選択を行うクラス
        Scanner scan = new Scanner(System.in);
        while (Mt[0] + Mt[1] + Mt[2] != 0) {    //山が(0,0,0)でないとき
            if(Mt[0] + Mt[1] +Mt[2] != 0) {

                System.out.println("何番目の山にしますか？");
                num = scan.nextInt();
                System.out.println(num + "番目の山からいくつ石をとりますか？");
                stone = scan.nextInt();

                if (num == 1) {                       //プレイヤーの入力に応じて処理を対応している
                    if (Mt[num - 1] - stone >= 0 && Mt[num - 1] != 0) {
                        Mt[num - 1] -= stone;
                    } else {
                        System.out.println("そこから石を取ることはできません。");
                    }
                } else if (num == 2) {
                    if (Mt[num - 1] - stone >= 0 && Mt[num - 1] != 0) {
                        Mt[num - 1] -= stone;
                    } else {
                        System.out.println("そこから石を取ることはできません。");
                    }
                } else if (num == 3) {
                    if (Mt[num - 1] - stone >= 0 && Mt[num - 1] != 0) {
                        Mt[num - 1] -= stone;
                    } else {
                        System.out.println("そこから石を取ることはできません。");
                    }
                } else {
                    System.out.println("そこに石はありません。");
                }
                System.out.println("山は (" + Mt[0] + "," + Mt[1] + "," + Mt[2] + ")です。");
            }
            Computer();    //プレイヤーの処理が終わったらコンピュータの番へ
        }
    }

    public void Computer(){

        while (Mt[0] + Mt[1] + Mt[2] != 0) {      //山(0,0,0)でないとき
            if (Mt[0] != 0 && Mt[1] == 0 && Mt[2] == 0) {
                System.out.println("COMは1番目の山から石を" + Mt[0] + "個取った。");
                Mt[0] = 0;
                System.out.println("山は（" + Mt[0] + "," + Mt[1] + "," + Mt[2] + ")です。");

            } else if (Mt[0] == 0 && Mt[1] != 0 && Mt[2] == 0) {
                System.out.println("COMは1番目の山から石を" + Mt[1] + "個取った。");
                Mt[1] = 0;
                System.out.println("山は（" + Mt[0] + "," + Mt[1] + "," + Mt[2] + ")です。");

            } else if (Mt[0] == 0 && Mt[1] == 0 && Mt[2] != 0) {
                System.out.println("COMは1番目の山から石を" + Mt[2] + "個取った。");
                Mt[2] = 0;
                System.out.println("山は（" + Mt[0] + "," + Mt[1] + "," + Mt[2] + ")です。");
            } else{
                ex = Mt[0]^Mt[1]^Mt[2];             //変数exは山の排他的論理和を取る。
                if(ex != 0) {
                    k = 0;                          //変数kは「必勝形でない状態」から「必勝形」にするためにするために用いる
                    for (i = 0; i < 3; i++) {
                        k = Mt[i] ^ ex;             //山Mt[i]をkと同じ数にすることで「必勝形」となる
                        if (Mt[i] > k) {
                            n = i;
                            break;
                        }
                    }
                    kk = Mt[n] - k;               //変数kkはある山から取った石の数
                    Mt[n] = k;
                    System.out.println("COMは" + (n + 1) + "番目の山から" + kk + "個の石を取った。");
                    System.out.println("山は（" + Mt[0] + "," + Mt[1] + "," + Mt[2] + ")です。");
                }
                Player();
            }
        }
    }
}
