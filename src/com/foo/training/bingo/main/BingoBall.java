package com.foo.training.bingo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * ビンゴボールクラス
 * @author todaka
 *
 */
public class BingoBall {
	// private変数 ----------------------------------------
	private List<String> ballList = new ArrayList<String>();
	private List<String> firstTenBallList = new ArrayList<String>();
	// ----------------------------------------------------

	// コンストラクタ
	public BingoBall() {
		for(int i = 0; i < 75; i++)
			this.ballList.add(String.valueOf(i + 1));
		// シャッフル
		Collections.shuffle(this.ballList);
	}

	// publicメソッド -------------------------------------
	/**
	 * 第1ゲーム開始前に10玉を排出するためのメソッド
	 * @return firstFiveBallList
	 */
	public List<String> getFirstTenBall() {
		int count = 0;
		// 最初の10玉をballListより設定
		// ballListの先頭の要素を取得し、その要素を削除する
		do {
			this.firstTenBallList.add(this.ballList.get(0));
			this.ballList.remove(0);
			count++;
		} while(count < 10);
		return this.firstTenBallList;
	}

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
