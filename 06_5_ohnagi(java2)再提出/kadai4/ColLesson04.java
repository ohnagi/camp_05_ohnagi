package kadai4;

import kadai4.Word;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    public static void main(String[] args) {
        System.out.println("わからなかった単語と意味を半角スペースで区切って入力してください。");
        //１.Wordクラスのインスタンスを生成する領域を確保
        ArrayList<Word> inputs = new ArrayList<>();
        //２.Scannerクラスのインスタンスを生成する
        Scanner scanner = new Scanner(System.in);//scannerクラスを使用し、キーボード入力値を取得
        int i = 0;
        try {
            while (!inputs.equals("e")) {
                //３.入力を受け取る
                String input = scanner.nextLine();
                if (input.equals("e")) {
                    break;
                }
                //４.受け取った入力値をスペース区切りで分割する
                String[] tango = input.split(" ");
                //５.分割した0番目を単語として、1番目を意味としてWordクラスのインスタンスを生成する
                kadai4.Word word = new Word(tango[0], tango[1]);
                //６.配列に生成したWordをセットする
                inputs.add(word);
                i++;
                System.out.println("次の単語を入力してください。「e」で登録を終了します。");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("登録制限を超えました。登録済みのデータは以下の通りです。");
        } finally {
            //出力処理
            for (int j = 0; j < i; j++) {
                System.out.println(inputs.get(j));
            }
            System.out.println("以上"+inputs.size()+"件登録しました。");
        }
    }
}