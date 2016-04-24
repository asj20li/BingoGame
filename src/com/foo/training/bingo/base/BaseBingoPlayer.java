package com.foo.training.bingo.base;

import com.foo.training.bingo.util.BingoConstant;

/**
 * Bingoプレイヤー基底クラス
 * @author
 *
 */
public abstract class BaseBingoPlayer{

	/**
	 * ビンゴカード
	 */
	protected String[][] myCard;
	/**
	 * プレイヤー名
	 */
	protected String myName = "";
	/**
	 * リーチか否かのフラグ
	 */
	protected boolean isReached = false;

	/**
	 * デフォルトコンストラクタ
	 */
	public BaseBingoPlayer() {}

	/**
	 * コンストラクタ
	 * 指定されたパラメータで自分のデータを設定します。
	 * @param name プレイヤー名
	 * @param card ビンゴカード
	 */
	public BaseBingoPlayer(String name, String[][] card) {
		this.myName = name;
		this.myCard = card;
	}

	/**
	 * 自分のカードの全要素をコンソール表示します。
	 * 数値が 1 桁だった場合は半角空白を 10 の位に設定して表示します。
	 * 下記を参考にしてください。
		----- PlayerName -----
		  1  24  36  46  67
		 11  xx  42  47  xx
		 12  18  xx  57  73
		 14  21  33  53  70
		  8  26  32  58  74
	 */
	public void showMyCard() {
		System.out.println("----- " + myName + " -----");
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			for (int j = 0; j < BingoConstant.matrixSize; j++) {
				String val = myCard[i][j].length() == 1 ? " " + myCard[i][j] : myCard[i][j];
				System.out.print(" " + val + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	/**
	 * Bingo の場合に叫びます。
	 * コンソールに叫び声を表示します。
	 * @return
	 */
	public abstract void shoutBingo();

	/**
	 * リーチの場合に叫びます。
	 * コンソールに叫び声を表示します。
	 */
	public abstract void shoutReach();

	/**
	 * Bingo か否かを判別します。
	 * Bingo だった場合は叫びます。
	 * Bingo では無かった場合にリーチか否かを判別しリーチの場合は叫びます。
	 * リーチを 1 度叫んだ後は、Bingo になるまで叫びません。
	 * @param ballVal
	 * @return
	 */
	public boolean judgeBingo(String ballVal) {
		replaceDone(ballVal);
		boolean isBingo = isBingoVertical() || isBingoHorizontal() || isBingoOblique();
		if (isBingo) {
			shoutBingo();
		}
		if (!isBingo && !isReached) {
			isReached = isReachVertical() || isReachHorizontal() || isReachOblique();
			if (isReached) {
				shoutReach();
			}
		}
		return isBingo;
	}

	// --- getter ---
	public String getMyName() {
		return myName;
	}

	public String[][] getMyCard() {
		return myCard;
	}

	// --- private ---
	/**
	 * カード内の各要素とボールの値を比較して
	 * 一致した要素を BingoConstant.done で置き換えます。
	 * @param ボール文字列
	 */
	private void replaceDone(String ballVal) {
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			for (int j = 0; j < BingoConstant.matrixSize; j++) {
				if (myCard[i][j].equals(ballVal)) {
					myCard[i][j] = BingoConstant.done;
				}
			}
		}
	}

	/**
	 * 縦の要素が全て BingoConstant.done か否かを判別します。
	 * @return ビンゴの場合は true、そうでない場合は false
	 */
	private boolean isBingoVertical() {
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			boolean result = true;
			for (int j = 0; j < BingoConstant.matrixSize; j++) {
				result = result && myCard[j][i].equals(BingoConstant.done);
				if (!result) {
					break;
				}
			}
			if (result) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 縦の要素が Reach か否かを判別します。
	 * @return リーチの場合は true、そうでない場合は false
	 */
	private boolean isReachVertical() {
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			int count = 0;
			for (int j = 0; j < BingoConstant.matrixSize; j++) {
				if (myCard[j][i].equals(BingoConstant.done)) {count++;}
			}
			if (count == BingoConstant.matrixSize - 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 横の要素が全て BingoConstant.done か否かを判別します。
	 * @return ビンゴの場合は true、そうでない場合は false
	 */
	private boolean isBingoHorizontal() {
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			boolean result = true;
			for (int j = 0; j < BingoConstant.matrixSize; j++) {
				result = result && myCard[i][j].equals(BingoConstant.done);
				if (!result) {
					break;
				}
			}
			if (result) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 横の要素が Reach か否かを判別します。
	 * @return リーチの場合は true、そうでない場合は false
	 */
	private boolean isReachHorizontal() {
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			int count = 0;
			for (int j = 0; j < BingoConstant.matrixSize; j++) {
				if (myCard[i][j].equals(BingoConstant.done)) {count++;}
			}
			if (count == BingoConstant.matrixSize - 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ナナメの要素が全て BingoConstant.done か否かを判別します。
	 * 左上から右下、右上から左下の 2 通りを調べます。
	 * @return ビンゴの場合は true、そうでない場合は false
	 */
	private boolean isBingoOblique() {
		boolean result = true;
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			result = result && myCard[i][i].equals(BingoConstant.done);
			if (!result) {
				break;
			}
		}
		if (result) {
			return true;
		}
		result = true;
		for (int i = BingoConstant.matrixSize - 1; i >= 0; i--) {
			result = result && myCard[i][(BingoConstant.matrixSize - 1) - i].equals(BingoConstant.done);
			if (!result) {
				break;
			}
		}
		if (result) {
			return true;
		}
		return false;
	}

	/**
	 * ナナメの要素が Reach か否かを判別します。
	 * 左上から右下、右上から左下の 2 通りを調べます。
	 * @return リーチの場合は true、そうでない場合は false
	 */
	private boolean isReachOblique() {
		int count = 0;
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			if(myCard[i][i].equals(BingoConstant.done)){count++;}
		}
		if (count == BingoConstant.matrixSize - 1) {
			return true;
		}
		count = 0;
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
			if (myCard[i][(BingoConstant.matrixSize - 1) - i].equals(BingoConstant.done)) {count++;}
		}
		if (count == BingoConstant.matrixSize - 1) {
			return true;
		}
		return false;
	}
}
