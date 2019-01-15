import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StereoTest {

    Stereo stereo;
    CdPlayer cdPlayer;
    Radio radio;

    @Before
    public void before(){
        cdPlayer = new CdPlayer();
        radio = new Radio();
        stereo = new Stereo("Graeme's stereo", cdPlayer, radio);
    }

    @Test
    public void canGetStereoName(){
        assertEquals("Graeme's stereo", stereo.getName());
    }

    @Test
    public void canGetRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void canGetCdPlayer(){
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }

    @Test
    public void canGetRadioStation(){
        assertEquals("Radio 2", stereo.getRadioStation());
    }

    @Test
    public void canTuneRadioStation(){
        stereo.tuneRadio("Radio 1");
        assertEquals("Radio 1", stereo.getRadioStation());
    }

    @Test
    public void cdPlayerStartsEmpty(){
        assertNull(stereo.getAlbumFromCdPlayer());
    }

    @Test
    public void canSetAlbumInCdPlayer(){
        stereo.setAlbumInCdPlayer("Joshua Tree");
        assertEquals("Joshua Tree", stereo.getAlbumFromCdPlayer());
    }


}
