import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer();
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, cdPlayer.getVolume());
    }

    @Test
    public void canSetVolume(){
        cdPlayer.setVolume(7);
        assertEquals(7, cdPlayer.getVolume());
    }

    @Test
    public void startsWithNoAlbum(){
        assertNull(cdPlayer.getAlbum());
    }

    @Test
    public void canSetAlbum(){
        cdPlayer.setAlbum("Joshua Tree");
        assertEquals("Joshua Tree", cdPlayer.getAlbum());
    }
}
