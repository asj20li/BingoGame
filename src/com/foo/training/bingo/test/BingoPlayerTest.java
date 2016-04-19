package com.foo.training.bingo.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.foo.training.bingo.player.Player;


public class BingoPlayerTest {

	private String testBallValue = "TestBallValue";
	private String reachShout = "...";
	private String bingoShout = "YEAH, BINGO!!";
	private ByteArrayOutputStream consoleOut = null;

	/**
	 * Player の叫ぶ内容（文字列部分のみ）を上書きしてください。
	 */
	@Before
	public void init() {
		reachShout += System.lineSeparator();
		bingoShout += System.lineSeparator();

		consoleOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(consoleOut));
	}

	@After
	public void terminate() {

	}

	/**
	 * 名前が正しく取得できるかテストします。
	 */
	@Test
	public void testName() {
		Player player = new Player("test", BingoCardTest.getEmptyCard());
		assertThat(true, is(player.getMyName().equals("test")));
	}

	/**
	 * リーチ時の叫び声が正しく出力されるかテストします。
	 */
	@Test
	public void testReachShout() {
		Player player = new Player("test", BingoCardTest.getEmptyCard());
		player.shoutReach();
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * ビンゴ時の叫び声が正しく出力されるかテストします。
	 */
	@Test
	public void testBingoShout() {
		Player player = new Player("test", BingoCardTest.getEmptyCard());
		player.shoutBingo();
		assertThat(consoleOut.toString(), is(bingoShout));
	}

	/**
	 * 水平でリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testHorizontalReach1() {
		Player player = new Player("test", BingoCardTest.getHorizontalReachCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * 水平でBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testHorizontalBingo1() {
		Player player = new Player("test", BingoCardTest.getHorizontalBingoCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

	/**
	 * 垂直でリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testVerticalReach1() {
		Player player = new Player("test", BingoCardTest.getVerticalReachCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * 垂直でBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testVerticalBingo1() {
		Player player = new Player("test", BingoCardTest.getVerticalBingoCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueReach1() {
		Player player = new Player("test", BingoCardTest.getObliqueReachCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * ナナメでBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueBingo1() {
		Player player = new Player("test", BingoCardTest.getObliqueBingoCard1());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueReach2() {
		Player player = new Player("test", BingoCardTest.getObliqueReachCard2());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(reachShout));
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueBingo2() {
		Player player = new Player("test", BingoCardTest.getObliqueBingoCard2());
		player.judgeBingo(testBallValue);
		assertThat(consoleOut.toString(), is(bingoShout));
	}

}
