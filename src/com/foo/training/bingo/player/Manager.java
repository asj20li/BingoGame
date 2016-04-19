package com.foo.training.bingo.player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;

import com.foo.training.bingo.base.BaseBingoPlayer;
import com.foo.training.bingo.base.BingoConstant;
import com.foo.training.bingo.base.BingoManager;
import com.foo.training.bingo.main.BingoBall;
import com.foo.training.bingo.main.BingoCard;


/**
 * ゲームマネージャクラス
 * @author
 *
 */
public class Manager extends BaseBingoPlayer implements BingoManager {

	private ArrayList<BaseBingoPlayer> playerList = new ArrayList<>();
	private BingoBall ballMachine = new BingoBall();

	public Manager() {
		super("Manager", BingoCard.getCard());
		playerList.add(this);
	}

	public Manager(String[][] card) {
		myName = "Manager";
		myCard = card;
		playerList.add(this);
	}

	@Override
	public void progressGame() {
		boolean endOfGame = false;
		// 事前にゲームを進めます。
		endOfGame = executeGame(false, BingoConstant.preGameCount);
		// 終わらなかったらユーザ入力と共に進めます。
		if (endOfGame) {
			return;
		}
		else {
			endOfGame = executeGame(true, BingoConstant.gameCount);
		}
		// 引き分けの場合
		if (!endOfGame) {
			System.out.println("引き分けです！惜しかったですね。。。");
		}
	}

	@Override
	public BaseBingoPlayer getPlayer(String name) {
		Optional<BaseBingoPlayer> opPlayer = playerList.stream().filter(arg -> arg.getMyName().equals(name)).findFirst();
		if (opPlayer.isPresent()) {
			return opPlayer.get();
		}
		else {return null;}
	}

	@Override
	public boolean addPlayer(BaseBingoPlayer bingoPlayer) {
		if (bingoPlayer != null) {
			return playerList.add(bingoPlayer);
		}
		return false;
	}

	@Override
	public BaseBingoPlayer addPlayer(String playerName) {
		String[][] card = BingoCard.getCard();
		BaseBingoPlayer player = new Player(playerName, card);
		playerList.add(player);
		return player;
	}

	@Override
	public void shoutReach() {
		System.out.println("Reach!!");
	}

	@Override
	public void shoutBingo() {
		System.out.println("WOW, BINGO!!");
	}

	@Override
	public void showAllPlayerCard() {
		for(BaseBingoPlayer player : playerList) {
			player.showMyCard();
		}
	}

	@Override
	public String askPlayerName() {
		System.out.println("名前を入力してください。");
		String name = "";
		for(;;) {
			try {
				name = getInputString();
			} catch (IOException e) {
//				System.out.println("例外が発生しました。[" + e.getMessage() + "]");
				System.out.println("名前を John に設定します。");
				name = "John";
			}
			if(name.isEmpty() || name.matches("^ +$")){
				System.out.println("名前に空白は使えません。再度入力してください。");
			}
			else {
				break;
			}
		}
		System.out.println("[" + name + "] さんですね。");
		return name;
	}

	// --- private ---
	/**
	 * コンソール入力された文字列を取得します。
	 * @return
	 * @throws IOException
	 */
	private String getInputString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String val = "";
		val = br.readLine();
		return val;
	}

	/**
	 * y キーが入力されるまで待機します。
	 */
	private void waitGameProgress() {
		System.out.println("y キーを入力してゲームを進めてください。");
		String name = "";
		for(;;) {
			try {
				name = getInputString();
			} catch (IOException e) {
				System.out.println("例外が発生しました。[" + e.getMessage() + "]");
			}
			if(!name.equals("y")){
				System.out.println("「y」キー以外の入力はできません。y キーを入力してください。");
			}
			else {
				break;
			}
		}
	}

	/**
	 * ビンゴマシンからボールを 1 個取り出してゲームを進めます。
	 * これを第 2 引数で指定した回数繰り返します。
	 * @param execWait  ユーザの入力処理を待つか否かのフラグ
	 * @param gameCount 実施するゲーム回数
	 * @return
	 */
	private boolean executeGame(boolean execWait, int gameCount) {
		boolean endOfGame = false;
		for (int count = 0; count < gameCount; count++) {
			if (execWait) {
				waitGameProgress();
			}
			System.out.println("[" + (count + 1) + "] 回目のボール取り出しです。");
			// ボールマシンを回して数字文字列を取得します
			String ballVal = ballMachine.getBall();
			System.out.println("出てきた番号は" + ballVal + "となります！");
			// 全 Player に通知し Bingo か否かチェックします
			for (BaseBingoPlayer player : playerList) {
				if (player.judgeBingo(ballVal)) {
					System.out.println("ゲーム終了！" + System.lineSeparator() + "勝者は [" + player.getMyName() + "] さんです。");
					endOfGame = true;
				}
			}
			// 全 Player のカードの状態を表示します。
			showAllPlayerCard();
			if (endOfGame) {
				break;
			}
		}
		return endOfGame;
	}
}
