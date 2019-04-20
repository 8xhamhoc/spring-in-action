package soundsystem;

public class MyCDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        this.compactDisc.play();
    }

}
