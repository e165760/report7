package jp.ac.uryukyu.ie.e165760;

//山札からランダムな5枚を手札に加える
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Draw {
    //山札からトランプを5枚引いて表示する
    public static void method(){
        //山札を作る
        List<String> BoardCard = new ArrayList<String>(52);
        for (int i = 0; i < 4; i++) {
            BoardCard.add("1");
            BoardCard.add("2");
            BoardCard.add("3");
            BoardCard.add("4");
            BoardCard.add("5");
            BoardCard.add("6");
            BoardCard.add("7");
            BoardCard.add("8");
            BoardCard.add("9");
            BoardCard.add("10");
            BoardCard.add("11");
            BoardCard.add("12");
            BoardCard.add("13");
        }

        //カードを5枚引く
        int[] Hand = new int[5];
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            int l = rnd.nextInt(13) + 1;
            String m = BoardCard.get(l);
            int n = Integer.parseInt(m);
            Hand[i] = n;
        }

        //手札を並び替える
        Arrays.sort(Hand);
    }
}