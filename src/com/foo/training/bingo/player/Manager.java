package com.foo.training.bingo.player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;

import com.foo.training.bingo.base.BaseBingoPlayer;
import com.foo.training.bingo.base.BingoManager;
import com.foo.training.bingo.util.BingoBall;
import com.foo.training.bingo.util.BingoCard;
import com.foo.training.bingo.util.BingoConstant;


/**
 * ゲームマネージャクラス
 * BingoManager インタフェイスの実装クラス
 * @author
 *
 */
public class Manager extends BaseBingoPlayer implements BingoManager {

	private ArrayList<BaseBingoPlayer> playerList = new ArrayList<>();
	private BingoBall ballMachine = new BingoBall();

	public Manager() {
	}

	public Manager(String[][] card) {
	}

	@Override
	public void progressGame() {
		// 事前にゲームを進めます
		// 終わらなかったらユーザ入力と共に進めます
		// 引き分けの場合
	}

	@Override
	public BaseBingoPlayer getPlayer(String name) {
	}

	@Override
	public boolean addPlayer(BaseBingoPlayer bingoPlayer) {
	}

	@Override
	public BaseBingoPlayer addPlayer(String playerName) {
	}

	@Override
	public void shoutReach() {
	}

	@Override
	public void shoutBingo() {
	}

	@Override
	public void showAllPlayerCard() {
	}

	@Override
	public String askPlayerName() {
	}

	// --- private ---
	/**
	 * コンソールに入力された文字列を取得します。
	 * @return
	 * @throws IOException
	 */
	private String getInputString() throws IOException {
	}

	/**
	 * コンソールで y キーが入力されるまで待機します。
	 * 例外が発生した場合は、再度入力を促してください。
	 */
	private void waitGameProgress() {
	}

	/**
	 * ビンゴマシンからボールを 1 個取り出してゲームを進めます。
	 * これを第 2 引数で指定した回数繰り返します。
	 * @param execWait  ユーザの入力処理を待つか否かのフラグ
	 * @param gameCount 実施するゲーム回数
	 * @return
	 */
	private boolean executeGame(boolean execWait, int gameCount) {
		// ボールマシンを回して数字文字列を取得します
		// 全 Player に通知し Bingo か否かチェックします
		// 全 Player のカードの状態を表示します
	}
}
