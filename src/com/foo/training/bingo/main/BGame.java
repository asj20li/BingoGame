package com.foo.training.bingo.main;

import com.foo.training.bingo.player.Manager;

/**
 * Bingo ゲームを進めるメインクラス
 * @author
 *
 */
public class BGame {

	public static void main(String[] args) {
		Manager mngr = new Manager();
//		String playerName = mngr.askPlayerName();
		String playerName = "aaa";
		mngr.addPlayer(playerName);
//		BaseBingoPlayer player = mngr.getPlayer(playerName);
//		player.showMyCard();
		mngr.progressGame();
	}

}
