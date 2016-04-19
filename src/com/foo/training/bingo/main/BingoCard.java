package com.foo.training.bingo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.foo.training.bingo.base.BingoConstant;


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

	/**
	 * ビンゴカードを取得します。
	 * まず [行][列] で値を決定してください。
	 * [0][] は  1 ～ 15 のうち任意の BingoConstant.matrixSize 個
	 * [1][] は 16 ～ 30 のうち任意の BingoConstant.matrixSize 個
	 * [2][] は 31 ～ 45 のうち任意の BingoConstant.matrixSize 個
	 * [3][] は 46 ～ 60 のうち任意の BingoConstant.matrixSize 個
	 * [4][] は 61 ～ 75 のうち任意の BingoConstant.matrixSize 個
	 * 次に、2 次元配列の行と列を入れ替えてカードを生成します。
	 * @return
	 */
	public static String[][] getCard() {
		String[][] cardNum = new String[BingoConstant.matrixSize][BingoConstant.matrixSize];
		for (int i = 1; i <= BingoConstant.matrixSize; i++) {
			int min = 1 + (i - 1) * 15;
			int max = 15 * i;
			boolean isMiddle = (i == (BingoConstant.matrixSize / 2 + 1)) ? true : false;
			String[] result = getSuffledNum(min, max, isMiddle);
			cardNum[i - 1] = result;
		}
		// 行と列を入れ替え
		for (int i = 0; i < BingoConstant.matrixSize; i++ ) {
			for (int j = i; j < BingoConstant.matrixSize; j++) {
				String buff = cardNum[i][j];
				cardNum[i][j] = cardNum[j][i];
				cardNum[j][i] = buff;
			}
		}
		return cardNum;
	}

	// privateメソッド -----------------------------------
	/**
	 * 引数で指定した範囲内の数字をシャッフルして 5 つを返します。
	 * isMiddle が真の場合は、真ん中の要素を BingoConstant.done に設定します。
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
		// 先頭の要素を BingoConstant.matrixSize 個だけ取得する
		String[] result = new String[BingoConstant.matrixSize];
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			result[i] = cardNoList.get(i);
		}
		if (isMiddle) {
			result[BingoConstant.matrixSize / 2] = BingoConstant.done;
		}
		return result;
	}
	// ---------------------------------------------------

}
