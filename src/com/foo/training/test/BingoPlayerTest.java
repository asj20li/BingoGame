package com.foo.training.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import com.foo.training.bingo.player.Player;
import com.foo.training.test.base.BaseBingoPlayerTest;
import com.foo.training.test.data.ObliqueTestValue;
import com.foo.training.test.data.TestValue;


/**
 * BaseBingoPlayer のテストクラス
 * 水平/垂直 のリーチ、Bingo 以外の機能をテストします。
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
	}

	/**
	 * 取得したカードが null ではないことをテストします。
	 */
	@Test
	public void testCard() {
	}

	/**
	 * リーチ時の叫び声が正しく出力されるかテストします。
	 */
	@Test
	public void testReachShout() {
	}

	/**
	 * ビンゴ時の叫び声が正しく出力されるかテストします。
	 */
	@Test
	public void testBingoShout() {
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueReach1() {
	}

	/**
	 * ナナメでBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueBingo1() {
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueReach2() {
	}

	/**
	 * ナナメでリーチの場合に正しく叫ぶか否かをテストします。
	 */
	@Test
	public void testObliqueBingo2() {
	}

}
