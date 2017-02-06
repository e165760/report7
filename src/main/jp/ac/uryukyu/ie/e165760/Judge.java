package jp.ac.uryukyu.ie.e165760;

//Draw.java で引いた手札における役を判定する
import java.util.Map;
import java.util.HashMap;


public class Judge{
    public static void method(){
        //オブジェクト生成
        Draw draw = new Draw();

        //重複データ格納用マップ
        Map<Integer,Integer> box = new HashMap<Integer,Integer>();
        //格納処理
        for(int i = 0; i < Hand.length; i++) {
            int num = (Integer) Hand.get(i);
            //重複が無い場合は新しく格納
            if (box.get(num) != null) {
                box.put(num, 1);
            } else {
                //重複がある場合は追加して格納
                box.put(num, box.get(num)++);
            }
        }

        //得点計算
        int score = 0;
        for(int u = 0; u <= 12; u++){
            if(box[u] = 4){
                score = score + 5;
            }else if(box[u] = 3){
                score = score + 3;
            }else if(box[u] = 2){
                score = score + 1;
            }else{
                score = score + 0;
            }
        }

        //役を判定
        String YourResult;
        if(score = 5){
            YourResult = "フォーカード";
        }else if(score = 4){
            YourResult = "フルハウス";
        }else if(score = 3){
            YourResult = "スリーカード";
        }else if(score = 2){
            YourResult = "ツーペア";
        }else if(score = 1){
            YourResult = "ワンペア";
        }else{
            YourResult = "ありません";
        }
    }
}