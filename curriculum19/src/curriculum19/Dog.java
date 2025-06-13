package curriculum19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String animal;

	// Q2：フィールドに動物の数の変数を定義してください。
	private int number;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog() {
		animal = "犬";
		number = 0;
	}

	public void setDog(String animal, int number) { //コンストラクタ作成
		this.animal = animal;
		this.number = number;
	}

	public void animals() {
		System.out.println(animal);
		System.out.println("" + number + "匹");
	}
}
