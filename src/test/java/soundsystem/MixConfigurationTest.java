package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MixConfiguration.class)
public class MixConfigurationTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void notNull() {
        org.junit.Assert.assertNotNull(cdPlayer);
        org.junit.Assert.assertNotNull(compactDisc);
    }

}
