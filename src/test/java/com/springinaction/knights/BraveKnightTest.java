package com.springinaction.knights;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkQuest() {
        Quest quest = Mockito.mock(Quest.class);
        BraveKnight braveKinght = new BraveKnight(quest);
        braveKinght.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
    }

}
