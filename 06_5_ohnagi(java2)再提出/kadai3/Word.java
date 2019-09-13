package kadai3;

//クラス（Wordの金型(設計図)）を作る
public class Word {
    //①フィールド(「Word」クラスが持つデータ)を設定する
    public String word;
    public String meaning;

    //②メソッド（「Word」クラスの振る舞い）を設定する
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }//toString()：参照型のハッシュコードを文字列化する
    @Override
    public String toString(){
        return"単語："+this.word+"、意味："+this.meaning;
    }
}