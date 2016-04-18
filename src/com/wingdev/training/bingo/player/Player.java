package com.wingdev.training.bingo.player;

import com.wingdev.training.bingo.base.BaseBingoPlayer;

public class Player extends BaseBingoPlayer {

	public Player(String name, String[][] card) {
		super(name, card);
	}

	@Override
	public void shoutReach() {
		System.out.println("...");
	}

	@Override
	public void shoutBingo() {
		System.out.println("Bi, Bi, BINGOOOOO!!!!!");
	}

}
