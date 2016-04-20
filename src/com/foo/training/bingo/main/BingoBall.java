package com.foo.training.bingo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.foo.training.bingo.base.BingoConstant;


/**
 * ビンゴボールクラス
 * @author todaka
 *
 */
public class BingoBall {
	// private変数 ----------------------------------------
	private List<String> ballList = new ArrayList<String>();
	// ----------------------------------------------------

	// コンストラクタ
	public BingoBall() {
		for(int i = 0; i < BingoConstant.maxBallNumber; i++)
			this.ballList.add(String.valueOf(i + 1));
		// シャッフル
		Collections.shuffle(this.ballList);
	}

	// publicメソッド -------------------------------------
	/**
	 * 第1ゲーム以降のボール排出メソッド
	 * @return
	 */
	public String getBall() {
		String ball = this.ballList.get(0);
		this.ballList.remove(0);
		return ball;
	}
	// ----------------------------------------------------
}
