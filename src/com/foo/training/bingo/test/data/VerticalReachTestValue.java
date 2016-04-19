package com.foo.training.bingo.test.data;

public class VerticalReachTestValue {

	public static String[][] getCard1() {
		String[][] test = {
				{" 1"," 2"," 3"," 4"," 5"},
				{"xx","","","",""},
				{"xx","","","",""},
				{"xx","","","",""},
				{"xx","","","",""}
		};
		return test;
	}

	public static String[][] getCard2() {
		String[][] test = {
				{" 1","xx"," 3"," 4"," 5"},
				{  "","xx","","",""},
				{  "","xx","","",""},
				{  "","xx","","",""},
				{  "","99","","",""}
		};
		return test;
	}

	public static String[][] getCard3() {
		String[][] test = {
				{" 1","2","xx"," 4"," 5"},
				{  "","","xx","",""},
				{  "","","xx","",""},
				{  "","","xx","",""},
				{  "","","99","",""}
		};
		return test;
	}

	public static String[][] getCard4() {
		String[][] test = {
				{" 1","2"," 3","xx"," 5"},
				{  "","","","xx",""},
				{  "","","","xx",""},
				{  "","","","xx",""},
				{  "","","","99",""}
		};
		return test;
	}

	public static String[][] getCard5() {
		String[][] test = {
				{" 1","2"," 3"," 4","xx"},
				{  "","","","","xx"},
				{  "","","","","xx"},
				{  "","","","","xx"},
				{  "","","","","99"}
		};
		return test;
	}

}
