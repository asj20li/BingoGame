package com.foo.training.bingo.util;

/**
 * 定数保持クラス
 * @author
 *
 */
public final class BingoConstant {

	/**
	 * 番号が一致した場合の代替文字列
	 */
	public static final String done = "xx";

	/**
	 * ビンゴの玉の最大値 (25以上75以下に設定する)
	 */
	public static final int maxBallNumber = 75;

	/**
	 * カード 1 辺に含まれている要素数
	 */
	public static final int matrixSize = 5;

	/**
	 * 事前ゲーム実施回数
	 */
	public static final int preGameCount = 10;

	/**
	 * 手動ゲーム実施回数
	 */
	public static final int gameCount = 10;
}
