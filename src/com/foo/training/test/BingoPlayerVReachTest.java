package com.foo.training.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.foo.training.bingo.player.Player;
import com.foo.training.test.base.BaseBingoPlayerTest;
import com.foo.training.test.data.VerticalReachTestValue;

/**
 * BaseBingoPlayer のテストクラス
 * 垂直リーチが正しく判別されることを確認します。
 * @author
 *
 */
@RunWith(Theories.class)
public class BingoPlayerVReachTest extends BaseBingoPlayerTest {

	@DataPoints
	public static String[][][] VRVALUES = {
			VerticalReachTestValue.getCard1(),
			VerticalReachTestValue.getCard2(),
			VerticalReachTestValue.getCard3(),
			VerticalReachTestValue.getCard4(),
			VerticalReachTestValue.getCard5()
			};

	/**
	 * 垂直でリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Theory
	public void testHorizontalReachValues(String[][] vrvalue) {
		Player player = new Player("test", vrvalue);
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}
}
