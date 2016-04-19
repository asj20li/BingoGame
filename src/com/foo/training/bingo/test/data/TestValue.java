package com.foo.training.bingo.test.data;

public class TestValue {
	public static String[][] getSampleCard() {
		String[][] test = {
				{" 1","16","31","46","61"},
				{" 2","17","32","47","62"},
				{" 3","18","xx","48","63"},
				{" 4","19","33","49","64"},
				{" 5","20","34","50","65"}
		};
		return test;
	}

	public static String[][] getEmptyCard() {
		String[][] test = {
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""},
				{"","","","",""}
		};
		return test;
	}
}
