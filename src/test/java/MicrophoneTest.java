import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicrophoneTest {

    CdPlayer cdPlayer;
    Radio radio;
    Stereo stereo;
    Microphone microphone;

    @Before
    public void before(){
        cdPlayer = new CdPlayer();
        radio = new Radio();
        stereo = new Stereo("Graeme's Stereo", cdPlayer, radio);
        microphone = new Microphone();
    }

    @Test
    public void canConnectToStereo(){
        assertEquals("Graeme's Stereo", microphone.connect(stereo));
    }


}
