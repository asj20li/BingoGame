package com.foo.training.test.base;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

/**
 * BingoPlayer 用テスト基底クラス
 * @author
 *
 */
public abstract class BaseBingoPlayerTest {
	/**
	 * TODO
	 * reachShout, bingoShout を作成した Player クラスで定義した叫び声で上書きしてください。
	 */
	protected String reachShout = "...";
	protected String bingoShout = "YEAH, BINGO!!";

	protected String testBallValue = "TestBallValue";
	protected ByteArrayOutputStream consoleOut = null;

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

}
