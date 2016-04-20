package com.foo.training.bingo.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.foo.training.bingo.player.Player;
import com.foo.training.bingo.test.base.BaseBingoPlayerTest;
import com.foo.training.bingo.test.data.HorizontalBingoTestValue;

/**
 * BaseBingoPlayer のテストクラス
 * 水平 Bingo が正しく判別されることを確認します。
 * @author
 *
 */
@RunWith(Theories.class)
public class BingoPlayerHBingoTest extends BaseBingoPlayerTest {

	@DataPoints
	public static String[][][] HBVALUES = {
			HorizontalBingoTestValue.getCard1(),
			HorizontalBingoTestValue.getCard2(),
			HorizontalBingoTestValue.getCard3(),
			HorizontalBingoTestValue.getCard4(),
			HorizontalBingoTestValue.getCard5()
			};

	/**
	 * 水平でBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Theory
	public void testHorizontalBingoValues(String[][] hbvalue) {
		Player player = new Player("test", hbvalue);
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

}
