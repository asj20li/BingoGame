package com.foo.training.bingo.player;

import com.foo.training.bingo.base.BaseBingoPlayer;

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
		System.out.println("YEAH, BINGO!!");
	}

}
