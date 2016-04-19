package com.foo.training.bingo.base;

public interface BingoManager {

	/**
	 * ゲーム開始前に相手に名前を尋ねます。
	 * @return
	 */
	public String askPlayerName();

	/**
	 * 引数で与えられた名前を持つ Player を生成します。
	 * @param playerName プレイヤー名
	 * @return 生成した Player クラス
	 */
	public BaseBingoPlayer addPlayer(String playerName);

	/**
	 * 引数で与えられた名前を持つ Player を追加します。
	 * @param bingoPlayer
	 * @return 追加に成功した場合は true, それ以外は false
	 */
	public boolean addPlayer(BaseBingoPlayer bingoPlayer);

	/**
	 * 引数で与えられた名前を持つ Player を取得します。
	 * @param playerName
	 * @return
	 */
	public BaseBingoPlayer getPlayer(String playerName);

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
