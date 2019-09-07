package kadai;

import java.util.Scanner;

//クラス（Wordの金型(設計図)）を作る
public class Word {
    //①フィールド(「Word」クラスが持つデータ)を設定する
    public String word;
    public String meaning;

    //②メソッド（「Word」クラスの振る舞い）を設定する
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
    public void output(String word,String meaning){
        System.out.println("単語："+word+"、意味："+meaning);
    }
}
    //外部入力値を取得する
    //public static String[] get (String word,String meaning) {

        //scannerクラスを使用し、外部入力値を取得
        //Scanner scanner = new Scanner(System.in);

        //外部入力値を変数で受け取る
        //String getting = scanner.nextLine();

        //外部取得値を半角スペースで分割する
        //String[] tango = getting.split(" ");

        //変数で受け取り、戻り値に設定する
        //tango[0]=word;
        //tango[1]=meaning;
        //return get(word,meaning);
    //}
    //public static void get() {
        //System.out.println("単語：" + word + "、" + "意味：" + meaning);
    //}
