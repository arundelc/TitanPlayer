/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import us.abaddonsoftware.bll.Song;
import us.abaddonsoftware.bll.Library;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abaddon
 */
public class SongTest {
    Song song1;
    Song song2;
    Song song3;
    Song song4;
    Song song5;
    
    public SongTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
       song1 = new Song("Poison", "Bell Biv Devoe");
       song2 = new Song("We care a-lot", "Faith No More");
       song3 = new Song("Short Skirt, Long Jacket", "Cake");
       song4 = new Song("First of the Year (Equinox)", "Skrillex");
       song5 = new Song("Brain", "N.E.R.D.");
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGetArtist() // testing just for fun
    {
    assertTrue(song1.getArtist().equals("Bell Biv Devoe"));    
    }
    @Test
    public void testGetTitle()
    {
    assertTrue(song2.getArtist().equals("Faith No More"));
    }
   
    @Test
    public void testCompareTo()
    {
    int test1 = song1.compareTo(song1);
    int test2 = song1.compareTo(song2);
    int test3 = song2.compareTo(song1);
    assertEquals(0, test1 + test2 + test3);   
    }
}
