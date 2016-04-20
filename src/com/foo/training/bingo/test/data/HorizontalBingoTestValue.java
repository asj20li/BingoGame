package com.foo.training.bingo.test.data;

/**
 * 水平 Bingo テスト用データクラス
 * @author
 *
 */
public class HorizontalBingoTestValue {
	public static String[][] getCard1() {
		String[][] test = {
				{"xx","xx","xx","xx","xx"},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""}
		};
		return test;
	}

	public static String[][] getCard2() {
		String[][] test = {
				{"","","","",""},
				{"xx","xx","xx","xx","xx"},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""}
		};
		return test;
	}

	public static String[][] getCard3() {
		String[][] test = {
				{"","","","",""},
				{"","","","",""},
				{"xx","xx","xx","xx","xx"},
				{"","","","",""},
				{"","","","",""}
		};
		return test;
	}

	public static String[][] getCard4() {
		String[][] test = {
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"xx","xx","xx","xx","xx"},
				{"","","","",""}
		};
		return test;
	}

	public static String[][] getCard5() {
		String[][] test = {
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"xx","xx","xx","xx","xx"}
		};
		return test;
	}
}
