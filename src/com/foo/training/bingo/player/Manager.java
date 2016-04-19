package com.foo.training.bingo.player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.wingdev.training.bingo.base.BaseBingoPlayer;
import com.wingdev.training.bingo.base.BingoManager;
import com.wingdev.training.bingo.main.BingoBall;
import com.wingdev.training.bingo.main.BingoCard;

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
	}

	public Manager(String[][] card) {
		this.myName = "Manager";
		this.myCard = card;
	}

	@Override
	public void progressGame() {
		playerList.add(this);
		boolean endOfGame = false;
		for (int count = 0; count < 75; count++) {
			waitGameProgress();
			System.out.println("[" + (count + 1) + "] 回目のボール取り出しです。");
			// ボールマシンを回して数字文字列を取得する
			String ballVal = ballMachine.getBall();
			System.out.println("出てきた番号は" + ballVal + "となります！");
			// Player に通知し Bingo か否かチェックする
			for (BaseBingoPlayer player : playerList) {
				if (player.judgeBingo(ballVal)) {
					System.out.println("これでゲームは終わりです。勝者は [" + player.getMyName() + "] さんです。");
					endOfGame = true;
					break;
				}
			}
			showAllPlayerCard();
			if (endOfGame) {
				break;
			}
		}
	}

	@Override
	public void addPlayer(String playerName) {
		String[][] card = BingoCard.getCard();
		playerList.add(new Player(playerName, card));
	}

	@Override
	public void shoutReach() {
		System.out.println("RRRRRRRRRRRRRRRRRRRR!!!!!");
	}

	@Override
	public void shoutBingo() {
		System.out.println("BINGOOOOOO!!!!!");
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
				System.out.println("例外が発生しました。[" + e.getMessage() + "]");
				System.out.println("名前を John に設定します。");
				name = "John";
			}
			if(name.isEmpty() || name.matches("^ +$")){
				System.out.println("名前に空白は使えません。再度記入を行ってください。");
			}
			else {
				break;
			}
		}
		System.out.println("[" + name + "] さんですね。");
		return name;
	}

	@Override
	public void waitGameProgress() {
		System.out.println("yキーを入力してゲームを進めてください。");
		String name = "";
		for(;;) {
			try {
				name = getInputString();
			} catch (IOException e) {
				System.out.println("例外が発生しました。[" + e.getMessage() + "]");
			}
			if(!name.equals("y")){
				System.out.println("「y」キー以外の入力はできません。yキーを入力してください。");
			}
			else {
				break;
			}
		}
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
}
