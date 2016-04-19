package com.foo.training.bingo.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import com.foo.training.bingo.player.Player;
import com.foo.training.bingo.test.base.BaseBingoPlayerTest;
import com.foo.training.bingo.test.data.ObliqueTestValue;
import com.foo.training.bingo.test.data.TestValue;

/**
 * BaseBingoPlayer のテストクラス
 * @author
 *
 */
@RunWith(Theories.class)
public class BingoPlayerTest extends BaseBingoPlayerTest {

	/**
	 * 名前が正しく取得できるかテストします。
	 */
	@Test
	public void testName() {
		Player player = new Player("test", TestValue.getEmptyCard());
		assertThat(player.getMyName(), is("test"));
	}

	/**
	 * カードが null ではないことをテストします。
	 */
	@Test
	public void testCard() {
		Player player = new Player("test", TestValue.getEmptyCard());
		assertThat(player.getMyCard(), notNullValue());
	}

	/**
	 * リーチ時の叫び声が正しく出力されるかテストします。
	 */
	@Test
	public void testReachShout() {
		Player player = new Player("test", TestValue.getEmptyCard());
		player.shoutReach();
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * ビンゴ時の叫び声が正しく出力されるかテストします。
	 */
	@Test
	public void testBingoShout() {
		Player player = new Player("test", TestValue.getEmptyCard());
		player.shoutBingo();
		assertThat(consoleOut.toString(), is(bingoShout));
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueReach1() {
		Player player = new Player("test", ObliqueTestValue.getReachCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * ナナメでBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueBingo1() {
		Player player = new Player("test", ObliqueTestValue.getBingoCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueReach2() {
		Player player = new Player("test", ObliqueTestValue.getReachCard2());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueBingo2() {
		Player player = new Player("test", ObliqueTestValue.getBingoCard2());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

}
