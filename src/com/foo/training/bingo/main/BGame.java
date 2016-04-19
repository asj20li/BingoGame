package com.foo.training.bingo.main;

import com.foo.training.bingo.player.Manager;

public class BGame {

	public static void main(String[] args) {
		Manager mngr = new Manager();
		String playerName = mngr.askPlayerName();
		mngr.addPlayer(playerName);
		mngr.progressGame();
	}

}
