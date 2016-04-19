package com.foo.training.bingo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wingdev.training.bingo.base.BingoConstant;

/**
 * ビンゴカードクラス
 * 1列目：1～15
 * 2列目：16～30
 * 3列目：31～45(FreeSpaceあり）
 * 4列目：46～60
 * 5列目：61～75
 * @author
 *
 */
public class BingoCard {

	public static String[][] getCard() {
		String[][] cardNum = new String[BingoConstant.matrixSize][BingoConstant.matrixSize];
		for (int i = 1; i <= BingoConstant.matrixSize; i++) {
			int min = 1 + (i - 1) * 15;
			int max = 15 * i;
			boolean isMiddle = (i == 3) ? true : false;
			String[] result = getSuffledNum(min, max, isMiddle);
			cardNum[i - 1] = result;
		}
		return cardNum;
	}

	// privateメソッド -----------------------------------
	/**
	 * 引数で指定した範囲内の数字をシャッフルして5つを返します。
	 * isMiddle が真の場合は、真ん中の要素を done に設定します。
	 * @param min
	 * @param max
	 * @param isMiddle
	 * @return
	 */
	private static String[] getSuffledNum(int min, int max, boolean isMiddle) {
		// 数字をリストにadd
		List<String> cardNoList = new ArrayList<String>();
		for(int i = min; i <= max; i++) {
			cardNoList.add(String.valueOf(i));
		}
		Collections.shuffle(cardNoList);
		// 先頭の 5 つを取得して返す
		String[] result = {cardNoList.get(0), cardNoList.get(1), cardNoList.get(2), cardNoList.get(3), cardNoList.get(4)};
		if (isMiddle) {
			result[2] = BingoConstant.done;
		}
		return result;
	}
	// ---------------------------------------------------

}
