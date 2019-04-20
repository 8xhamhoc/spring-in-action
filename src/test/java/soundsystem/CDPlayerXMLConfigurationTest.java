package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/knight.xml")
public class CDPlayerXMLConfigurationTest {

    @Autowired
    private MyCDPlayer myCDPlayer;

    @Test
    public void testNotNull() {
        org.junit.Assert.assertNotNull(myCDPlayer);
    }

    @Test
    public void testMyCDPlayerRunPlay() {
        myCDPlayer.play();
    }

}
