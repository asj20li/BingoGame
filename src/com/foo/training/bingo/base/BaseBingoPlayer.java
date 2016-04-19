package com.foo.training.bingo.base;

/**
 * Bingoプレイヤー基底クラス
 * @author
 *
 */
public abstract class BaseBingoPlayer{

	/**
	 * カード(1次元が行、2次元が列)
	 * 左上が[0][0], 右下が[bSize - 1][bSize - 1]
	 */
	protected String[][] myCard;
	protected String myName = "";

	/**
	 * デフォルトコンストラクタ
	 */
	public BaseBingoPlayer() {}

	/**
	 * コンストラクタ
	 * @param name
	 * @param card
	 */
	public BaseBingoPlayer(String name, String[][] card) {
		this.myName = name;
		this.myCard = card;
	}

	/**
	 * 自分のカードを表示します。
	 * 数値が 1 桁だった場合は半角空白を 10 の位に設定して表示します。
	 */
	public void showMyCard() {
		System.out.println("--- " + myName + " ---");
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
	 * Bingo だった場合に叫びます。
	 * @return
	 */
	public abstract void shoutBingo();

	/**
	 * リーチの場合に叫びます。
	 */
	public abstract void shoutReach();

	/**
	 * Bingo か否かを判別します。
	 * Bingo だった場合は叫びます。
	 * @param ballVal
	 * @return
	 */
	public boolean judgeBingo(String ballVal) {
		replaceDone(ballVal);
		boolean result = isBingoVertical() || isBingoHorizontal() || isBingoOblique();
		if (result) {
			shoutBingo();
		}
		result = false;
		result = isReachVertical() || isReachHorizontal() || isReachOblique();
		if (result) {
			shoutReach();
		}
		return result;
	}

	// --- getter, setter ---
	public String getMyName() {
		return myName;
	}

	// --- private ---
	/**
	 * ボールの値と一致した要素を BingoConstant.done で置き換えます。
	 * @param ballVal
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
	 * 縦の要素が全て done か否かを判別します。
	 * @return
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
	 * @return
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
	 * 横の要素が全て done か否かを判別します。
	 * @return
	 */
	private boolean isBingoHorizontal() {
		boolean result = true;
		for (int i = 0; i < BingoConstant.matrixSize; i++) {
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
	 * @return
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
	 * ナナメの要素が全て done か否かを判別します。
	 * @return
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
	 * @return
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
