package com.springinaction.knights;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/knights-aop.xml")
public class KnightAopTest {

	
	@Autowired
	Knight knight;

	@Test
	public void embarkOnQuestAopIntroduction() throws Exception {
		((Contestant)knight).receiveAward();
	}
}