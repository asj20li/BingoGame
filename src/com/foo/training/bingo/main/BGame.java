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
		String playerName = mngr.askPlayerName();
		mngr.addPlayer(playerName);
		mngr.progressGame();
	}

}
