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
}
