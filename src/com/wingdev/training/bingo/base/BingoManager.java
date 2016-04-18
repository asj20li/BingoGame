package com.wingdev.training.bingo.base;

public interface BingoManager {

	/**
	 * ゲーム開始前に相手に名前を尋ねます。
	 * @return
	 */
	public String askPlayerName();

	/**
	 * 引数で与えられた名前を持つ Player を生成して保存します。
	 * @param playerName
	 */
	public void addPlayer(String playerName);

	/**
	 * 特定の文字が入力されるまで待機します。
	 */
	public void waitGameProgress();
	/**
	 * ゲームを進めます。
	 * @return
	 */
	public void progressGame();

	/**
	 * プレイヤー全員のカードを表示します。
	 */
	public void showAllPlayerCard();

}
