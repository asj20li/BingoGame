package com.foo.training.bingo.test.data;

/**
 * 垂直リーチテスト用データクラス
 * TODO テストデータが不足しています。不足分を補ってください。
 * @author
 *
 */
public class VerticalReachTestValue {

	public static String[][] getCard1() {
		String[][] test = {
				{"xx","","","",""},
				{"xx","","","",""},
				{"xx","","","",""},
				{"xx","","","",""},
				{"99","","","",""}
		};
		return test;
	}

	public static String[][] getCard2() {
		String[][] test = {
				{"","xx","","",""},
				{"","xx","","",""},
				{"","xx","","",""},
				{"","xx","","",""},
				{"","99","","",""}
		};
		return test;
	}

	public static String[][] getCard3() {
		String[][] test = {
				{"","","xx","",""},
				{"","","xx","",""},
				{"","","xx","",""},
				{"","","xx","",""},
				{"","","99","",""}
		};
		return test;
	}

	public static String[][] getCard4() {
		String[][] test = {
				{"","","","xx",""},
				{"","","","xx",""},
				{"","","","xx",""},
				{"","","","xx",""},
				{"","","","99",""}
		};
		return test;
	}

	public static String[][] getCard5() {
		String[][] test = {
				{"","","","","xx"},
				{"","","","","xx"},
				{"","","","","xx"},
				{"","","","","xx"},
				{"","","","","99"}
		};
		return test;
	}

}
