package com.wingdev.training.bingo.test;

public class BingoCardTest {

	public static String[][] getVerticalReachCard1() {
		String[][] test = {
				{" 1"," 2"," 3"," 4"," 5"},
				{"xx","","","",""},
				{"xx","","","",""},
				{"xx","","","",""},
				{"xx","","","",""}
		};
		return test;
	}

	public static String[][] getVerticalReachCard2() {
		String[][] test = {
				{" 1","xx"," 3"," 4"," 5"},
				{  "","xx","","",""},
				{  "","xx","","",""},
				{  "","xx","","",""},
				{  ""," 2","","",""}
		};
		return test;
	}

	public static String[][] getHorizontalReachCard1() {
		String[][] test = {
				{"xx","xx","xx","xx"," 5"},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""}
		};
		return test;
	}

	/**
	 * [0][0], [1][1]
	 * @return
	 */
	public static String[][] getObliqueReachCard1() {
		String[][] test = {
				{"xx",""  ,""  ,""  ,""},
				{""  ,"xx",""  ,""  ,""},
				{""  ,""  ,"xx",""  ,""},
				{""  ,""  ,""  ,"xx",""},
				{""  ,""  ,""  ,""  ,"5"}
		};
		return test;
	}

	/**
	 * [0][4], [1][3], [2][2], [3][1], [4][0]
	 * @return
	 */
	public static String[][] getObliqueReachCard2() {
		String[][] test = {
				{""  ,""  ,""  ,""  ," 6"},
				{""  ,""  ,""  ,"xx",""  },
				{""  ,""  ,"xx",""  ,""  },
				{""  ,"xx",""  ,""  ,""  },
				{"xx",""  ,""  ,""  ,""  },
		};
		return test;
	}
}
