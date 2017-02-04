package jp.ac.uryukyu.ie.e165728;
import java.util.Scanner;

public class Play {
    Field field = new Field();

    private int stone, num, ex, k, i, n, kk;
    private int[] Mt = {field.getVal1(), field.getVal2(), field.getVal3()};

    public int[] getMt(){return Mt;}

    public void Player(){
        Scanner scan = new Scanner(System.in);
        while (Mt[0] + Mt[1] + Mt[2] != 0) {
            if(Mt[0] + Mt[1] +Mt[2] != 0) {

                System.out.println("何番目の山にしますか？");
                num = scan.nextInt();
                System.out.println(num + "番目の山からいくつ石をとりますか？");
                stone = scan.nextInt();

                if (num == 1) {
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
            Computer();
        }
    }

    public void Computer(){

        while (Mt[0] + Mt[1] + Mt[2] != 0) {
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
                ex = Mt[0]^Mt[1]^Mt[2];
                if (ex != 0) {
                    k = 0;
                    for (i = 0; i < 3; i++) {
                        k = Mt[i] ^ ex;
                        if (Mt[i] > k) {
                            n = i;
                            break;
                        }
                    }
                    kk = Mt[n] - k;
                    Mt[n] = k;
                    System.out.println("COMは" + (n + 1) + "番目の山から" + kk + "個の石を取った。");
                    System.out.println("山は（" + Mt[0] + "," + Mt[1] + "," + Mt[2] + ")です。");
                }
                Player();
            }
        }
    }
}
