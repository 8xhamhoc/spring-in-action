package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myMedia")
public class CDPlayerComponent implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayerComponent(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
