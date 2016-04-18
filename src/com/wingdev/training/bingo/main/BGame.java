package com.wingdev.training.bingo.main;

import com.wingdev.training.bingo.player.Manager;

public class BGame {

	public static void main(String[] args) {
		Manager mngr = new Manager();
		String playerName = mngr.askPlayerName();
		mngr.addPlayer(playerName);
		mngr.progressGame();
	}

}
