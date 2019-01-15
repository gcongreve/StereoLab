import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, radio.getVolume());
    }

    @Test
    public void canSetVolume(){
        radio.setVolume(7);
        assertEquals(7, radio.getVolume());
    }

    @Test
    public void canGetRadioStation(){
        assertEquals("Radio 2", radio.getRadioStation());
    }

    @Test
    public void canSetRadioStation(){
        radio.tuneRadioStation("Classic FM");
        assertEquals("Classic FM", radio.getRadioStation());
    }


}
