package com.foo.training.bingo.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.foo.training.bingo.player.Player;
import com.foo.training.bingo.test.base.BaseBingoPlayerTest;
import com.foo.training.bingo.test.data.HorizontalReachTestValue;

/**
 * BaseBingoPlayer のテストクラス
 * 水平リーチが正しく判別されることを確認します。
 * @author
 *
 */
@RunWith(Theories.class)
public class BingoPlayerHReachTest extends BaseBingoPlayerTest {

	@DataPoints
	public static String[][][] HRVALUES = {
			HorizontalReachTestValue.getCard1(),
			HorizontalReachTestValue.getCard2(),
			HorizontalReachTestValue.getCard3(),
			HorizontalReachTestValue.getCard4(),
			HorizontalReachTestValue.getCard5()
			};

	/**
	 * 水平でリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Theory
	public void testHorizontalReachValues(String[][] hrvalue) {
		Player player = new Player("test", hrvalue);
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}
}
