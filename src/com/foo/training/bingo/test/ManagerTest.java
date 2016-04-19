package com.foo.training.bingo.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import com.foo.training.bingo.player.Manager;


public class ManagerTest {

//	@Test
//	public void testVerticalReach() {
//		Manager mngr = new Manager(BingoCardTest.getVerticalReachCard2());
//		mngr.judgeBingo("test");
//		assertThat(true, is(true));
//	}
//
//	@Test
//	public void testHorizontalReach() {
//		Manager mngr = new Manager(BingoCardTest.getHorizontalReachCard1());
//		mngr.judgeBingo("test");
//		assertThat(true, is(true));
//	}
//
	@Test
	public void testObilqueReach() {
		Manager mngr = new Manager(BingoCardTest.getObliqueReachCard2());
		mngr.judgeBingo("test");
		assertThat(true, is(true));
	}
}
