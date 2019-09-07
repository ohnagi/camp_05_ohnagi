package kadai;

import com.company.practice2.Monster;

import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        System.out.println("わからなかった単語と意味を半角スペースで区切って入力してください。");
        Scanner scanner = new Scanner(System.in);//scannerクラスを使用し、キーボード入力値を取得
        Word[] inputs = new Word[10];//Wordクラスのインスタンスを生成する領域を確保
        int i = 0;
        while (i < 10) {
            i++;
            String input = scanner.nextLine();//inputは文字列で、キーボード入力値
            String[] tango = input.split(" ");//tangoは文字配列で、wordを半角スペースで分割された値を取得
            Word word = new Word(tango[0], tango[1]);//Wordクラスのインスタンス”word”を生成
            System.out.println("次の単語を入力してください。「e」で登録を終了します。");
            if (input == "e") {
                break;
            }
        }
        //for(int j=0;j<10;j++) {
           // inputs.output();
        }
        //System.out.println(inputs.length+"件登録しました。");
    }


