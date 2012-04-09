/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import us.abaddonsoftware.bll.Song;

/**
 *
 * @author abaddon
 */
public class SongTest {
    Song newSong1;
    Song newSong2;
    Song newSong3;
    Song newSong4;
    Song newSong5;
    
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
       newSong1 = new Song("Poison", "Bell Biv Devoe");
       newSong2 = new Song("We care a-lot", "Faith No More");
       newSong3 = new Song("Short Skirt, Long Jacket", "Cake");
       newSong4 = new Song("First of the Year (Equinox)", "Skrillex");
       newSong5 = new Song("Brain", "N.E.R.D.");
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
    assertTrue(newSong1.getArtist().equals("Bell Biv Devoe"));    
    }
    @Test
    public void testGetTitle()
    {
    assertTrue(newSong2.getTitle().equals("We care a-lot"));
    }
   
    @Test
    public void testCompareTo()
    {
    int test1 = newSong1.compareTo(newSong1);
    int test2 = newSong1.compareTo(newSong2);
    int test3 = newSong2.compareTo(newSong1);
    assertEquals(0, test1 + test2 + test3);   
    }
}
