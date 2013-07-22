package com.springinaction.knights;

import org.springframework.stereotype.Component;

@Component
public class RescueDamselQuest implements Quest {
  public void embark() throws QuestException {
    System.out.println("Rescuing damsel in distress");
  }
}
