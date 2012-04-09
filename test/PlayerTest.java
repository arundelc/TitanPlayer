/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.*;
import us.abaddonsoftware.bll.Player;
import us.abaddonsoftware.bll.Playlist;
import us.abaddonsoftware.bll.Song;

/**
 *
 * @author abaddon
 */
public class PlayerTest {
    Song newSong1;
    Song newSong2;
    Song newSong3;
    Playlist testPlaylist;
    Player newPlayer;
    
    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() 
    {
        newSong1 = new Song( "Zombie", "Cranberries");
        newSong2 = new Song("Nerdy Girl", "Esther");
        newSong3 = new Song("Zydrate Anatomy", "Repo: The Genetic Opera");
        testPlaylist = new Playlist("Player Test");
        testPlaylist.addSong(newSong1);
        testPlaylist.addSong(newSong2);
        testPlaylist.addSong(newSong3);
        newPlayer = new Player();
        newPlayer.loadPlaylist(testPlaylist);
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
    public void testGetCurrentSong()
    {
        assertEquals(newSong1, newPlayer.getCurrentSong());
    }
    @Test
    public void testNoNextSong()
    {
        assertTrue(newPlayer.getNextSong().compareTo(newSong2) == 0x0 && newPlayer.getNextSong().compareTo(newSong3) == 0x0 && newPlayer.getNextSong().compareTo(newSong3) == 0x0);
    }
    @Test
    public void testGetNextSong()
    {
        assertTrue(newPlayer.getNextSong().compareTo(newSong2) == 0x0 && newPlayer.getNextSong().compareTo(newSong3) == 0x0);
    }
    @Test
    public void testPlay()
    {
        newPlayer.playSong();
        assertTrue(newPlayer.getIsPlaying());
    }
    @Test
    public void testStop()
    {
        newPlayer.playSong();
        boolean firstCheck = newPlayer.getIsPlaying();
        newPlayer.stopSong();
        assertTrue("Test to see if newPlayer is currently not playing but was playing before stopSong was called", !newPlayer.getIsPlaying() && firstCheck);
    }
    
    @Test
    public void testAddSongShowsInCurrentPlayer() //Test to see if adding a song to the playlist passed to player updates the currently playing playlist in player
    {
      newPlayer.getNextSong();
      newPlayer.getNextSong();
      newPlayer.getNextSong();
      Song mySongTest = newPlayer.getNextSong();
      testPlaylist.addSong(newSong2);
      assertTrue(newPlayer.getNextSong().compareTo(newSong2) == 0 && mySongTest.compareTo(newSong3) == 0); 
    }
}
