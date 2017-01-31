package jp.ac.uryukyu.ie.e165728;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayTest {
    @Test
    public void getMt() throws Exception {
        Play play = new Play();
        assertNotNull(play.getMt());
    }
}