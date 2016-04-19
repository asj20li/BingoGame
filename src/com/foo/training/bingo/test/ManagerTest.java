package com.foo.training.bingo.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.foo.training.bingo.base.BaseBingoPlayer;
import com.foo.training.bingo.player.Manager;
import com.foo.training.bingo.player.Player;
import com.foo.training.bingo.test.data.TestValue;


public class ManagerTest {

	private ByteArrayOutputStream consoleOut = null;

	/**
	 * ここの試験で停止します。
	 * Eclipse の「コンソール」ビューで有効なプレイヤーの名前を入力して Enter を押下してください。
	 */
	@Test
	public void testAskPlayerName() {
		Manager mngr = new Manager(TestValue.getEmptyCard());
		String playerName = mngr.askPlayerName();
		assertThat(playerName, notNullValue());
	}

	@Test
	public void testAddPlayer() {
		Manager mngr = new Manager(TestValue.getEmptyCard());
		BaseBingoPlayer player = mngr.addPlayer("playerNameTest");
		assertThat(player, notNullValue());
	}

	@Test
	public void testAddPlayerWithParam() {
		Manager mngr = new Manager(TestValue.getEmptyCard());
		Player player = new Player("playerNameTest", TestValue.getSampleCard());
		boolean result = mngr.addPlayer(player);
		assertThat(result, is(true));
	}

	@Test
	public void testGetPlayer() {
		Manager mngr = new Manager(TestValue.getEmptyCard());
		mngr.addPlayer("playerNameTest");
		BaseBingoPlayer player = mngr.getPlayer("playerNameTest");
		assertThat(player, notNullValue());
	}

	@Test
	public void testShowAllPlayerCard() {
		consoleOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(consoleOut));

		Manager mngr = new Manager(TestValue.getSampleCard());
		Player player = new Player("playerNameTest", TestValue.getSampleCard());
		mngr.addPlayer(player);

		String sampleCard = "----- %s -----\r\n  1  16  31  46  61 \r\n  2  17  32  47  62 \r\n  3  18  xx  48  63 \r\n  4  19  33  49  64 \r\n  5  20  34  50  65 \r\n\r\n";
		String value = String.format(sampleCard, mngr.getMyName()) + String.format(sampleCard, player.getMyName());

		mngr.showAllPlayerCard();
		assertThat(consoleOut.toString(), is(value));
	}
}
