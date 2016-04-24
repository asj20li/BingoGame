package com.foo.training.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.foo.training.bingo.base.BaseBingoPlayer;
import com.foo.training.bingo.player.Manager;
import com.foo.training.bingo.player.Player;
import com.foo.training.test.data.TestValue;

/**
 * BingoManager 機能の単体テスト
 * @author
 *
 */
public class ManagerTest {

	private ByteArrayOutputStream consoleOut = null;

	/**
	 * ここの試験で JUnit が停止します。
	 * Eclipse の「コンソール」ビューで有効なプレイヤーの名前を入力して Enter を押下してください。
	 */
	@Test
	public void testAskPlayerName() {
	}

	/**
	 * プレイヤー追加メソッドのテスト
	 */
	@Test
	public void testAddPlayer() {
	}

	/**
	 * プレイヤー追加メソッド(パラメータつき)のテスト
	 */
	@Test
	public void testAddPlayerWithParam() {
	}

	/**
	 * プレイヤー取得メソッドのテスト
	 */
	@Test
	public void testGetPlayer() {
	}

	/**
	 * 全プレイヤーのカード表示メソッドのテスト
	 */
	@Test
	public void testShowAllPlayerCard() {
	}
}
