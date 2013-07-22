package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;

public class BraveKnight implements Knight {

	@Autowired
	private Quest quest;

	public BraveKnight() {
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}
