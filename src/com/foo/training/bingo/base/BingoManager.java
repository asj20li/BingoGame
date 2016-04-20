package com.foo.training.bingo.base;

/**
 * Bingo ゲーム Manager 用インタフェイス
 * @author
 *
 */
public interface BingoManager {

	/**
	 * ゲーム開始前に相手に名前を尋ねます。
	 * コンソールに入力された文字列を戻り値として返します。
	 * 名前に空文字列、空白のみの文字列は使えません。
	 * その場合は、再度入力を促してください。
	 * 入力時に例外が発生した場合は、適当な名前を設定して返してください。
	 * @return
	 */
	public String askPlayerName();

	/**
	 * 引数で与えられた名前を持つ Player を生成し、
	 * Manager 実装クラス内で保持します。
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
