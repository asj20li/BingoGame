package com.foo.training.bingo.test.data;

public class ObliqueTestValue {
	public static String[][] getReachCard1() {
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
	public static String[][] getReachCard2() {
		String[][] test = {
				{""  ,""  ,""  ,""  ," 6"},
				{""  ,""  ,""  ,"xx",""  },
				{""  ,""  ,"xx",""  ,""  },
				{""  ,"xx",""  ,""  ,""  },
				{"xx",""  ,""  ,""  ,""  },
		};
		return test;
	}

	public static String[][] getBingoCard1() {
		String[][] test = {
				{"xx",""  ,""  ,""  ,""},
				{""  ,"xx",""  ,""  ,""},
				{""  ,""  ,"xx",""  ,""},
				{""  ,""  ,""  ,"xx",""},
				{""  ,""  ,""  ,""  ,"xx"}
		};
		return test;
	}

	/**
	 * [0][4], [1][3], [2][2], [3][1], [4][0]
	 * @return
	 */
	public static String[][] getBingoCard2() {
		String[][] test = {
				{""  ,""  ,""  ,""  ,"xx"},
				{""  ,""  ,""  ,"xx",""  },
				{""  ,""  ,"xx",""  ,""  },
				{""  ,"xx",""  ,""  ,""  },
				{"xx",""  ,""  ,""  ,""  },
		};
		return test;
	}

}
