package com.foo.training.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.foo.training.bingo.player.Player;
import com.foo.training.test.base.BaseBingoPlayerTest;
import com.foo.training.test.data.HorizontalBingoTestValue;


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
			};

	/**
	 * 水平でBingoの場合に正しく叫ぶか否かをテストします。
	 */
	@Theory
	public void testHorizontalBingoValues(String[][] hbvalue) {
	}

}
