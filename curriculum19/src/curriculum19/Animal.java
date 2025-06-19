package curriculum19;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog animal = new Dog("犬", 3);
		animal.showInfo();

		//現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDate today = LocalDate.now(); // 現在の日付を取得
		LocalTime nowTime = LocalTime.now(); // 現在の時刻を取得
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		//秒までのフォーマット
		String formatted = nowTime.format(formatter);
		System.out.println(today + " " + formatted);
	}
}