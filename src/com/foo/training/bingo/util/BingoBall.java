package com.foo.training.bingo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * ビンゴボールの管理クラス
 * @author todaka
 *
 */
public class BingoBall {
	private List<String> ballList = new ArrayList<String>();

	// コンストラクタ
	public BingoBall() {
		for(int i = 0; i < BingoConstant.maxBallNumber; i++)
			this.ballList.add(String.valueOf(i + 1));
		// シャッフル
		Collections.shuffle(this.ballList);
	}

	/**
	 * ボール取り出しメソッド
	 * List 内の先頭の要素を取り出します。
	 * 取り出した後、要素を削除します。
	 * @return
	 */
	public String getBall() {
		String ball = this.ballList.get(0);
		this.ballList.remove(0);
		return ball;
	}
}
