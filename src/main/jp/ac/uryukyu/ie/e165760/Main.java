package jp.ac.uryukyu.ie.e165760;

import javax.xml.transform.Result;
import java.util.logging.Handler;

//実行用のMainクラス
public class Main {
    public static void main(String args[]){
        Draw draw = new Draw();
        Judge judge = new Judge();
        System.out.println("あなたの手札は"+ Hand +"で役は"+ YourResult +"でした！");
    }
}