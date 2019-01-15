import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    CdPlayer cdPlayer;
    Radio radio;
    Stereo stereo;
    Mp3Player mp3Player;

    @Before
    public void before(){
        cdPlayer = new CdPlayer();
        radio = new Radio();
        stereo = new Stereo("Graeme's Stereo", cdPlayer, radio);
        mp3Player = new Mp3Player();
    }

    @Test
    public void canConnectToStereo(){
        assertEquals("Graeme's Stereo", mp3Player.connect(stereo));
    }

}
