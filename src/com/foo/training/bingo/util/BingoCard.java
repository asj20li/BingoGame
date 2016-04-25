package com.foo.training.bingo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * ビンゴカードクラス
 * 基数(a)：BingoConstant.maxBallNumber / BingoConstant.matrixSize
 * 1列目：     1 ～ a
 * 2列目： a + 1 ～ 2a
 * 3列目：2a + 1 ～ 3a(FreeSpaceあり）
 * 4列目：3a + 1 ～ 4a
 * 5列目：4a + 1 ～ 5a
 *   :       :
 *   :       :
 * n列目：(n - 1)a + 1 ～ n*a
 * @author
 *
 */
public class BingoCard {

	/**
	 * ビンゴカードを取得します。
	 * まず [行][列] で値を決定してください。
	 * 基数(a)：BingoConstant.maxBallNumber / BingoConstant.matrixSize
	 * [0][] は      1 ～  a のうち任意の BingoConstant.matrixSize 個
	 * [1][] は  a + 1 ～ 2a のうち任意の BingoConstant.matrixSize 個
	 * [2][] は 2a + 1 ～ 3a のうち任意の BingoConstant.matrixSize 個
	 * [3][] は 3a + 1 ～ 4a のうち任意の BingoConstant.matrixSize 個
	 * [4][] は 4a + 1 ～ 5a のうち任意の BingoConstant.matrixSize 個
	 * 次に、2 次元配列の行と列を入れ替えてカードを生成します。
	 * @return
	 */
	public static String[][] getCard() {
		// 2次元配列に値を入れます



		// 行と列を入れ替えます



	}

	// --- private ---
	/**
	 * 引数で指定した範囲内の数字をシャッフルして BingoConstant.matrixSize 個を返します。
	 * isMiddle が真の場合は、真ん中の要素を BingoConstant.done に設定します。
	 * @param min
	 * @param max
	 * @param isMiddle
	 * @return
	 */
	private static String[] getSuffledNum(int min, int max, boolean isMiddle) {
	}

}
