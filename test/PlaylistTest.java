/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import us.abaddonsoftware.bll.Playlist;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import us.abaddonsoftware.bll.Song;

/**
 *
 * @author abaddon
 */
public class PlaylistTest {
    private Song newSong1;
    private Song newSong2;
    private Song newSong3;
    public PlaylistTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        newSong1 = new Song("Head like a hole", "Nine inch Nails");
        newSong2 = new Song("Black Light Burns", "I want you to");
        newSong3 = new Song("The Exies", "Feeling Lo-Fi");
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
    public void testCreateEmptyPlaylist()
    {
    Playlist emptyPlaylist = new Playlist("Empty Playlist");
    assertEquals(0, emptyPlaylist.songCount());
    }
    @Test
    public void testNameOfPlaylist()
    {
        Playlist testPlaylist = new Playlist("Garbage that I like");
        assertTrue("This name should match the original name", testPlaylist.getName().equals("Garbage that I like"));
    }
    
    @Test
    public void testAddToPlaylist()
    {
        Playlist testPlaylist = new Playlist("Garbage that I like");
        testPlaylist.addSong(newSong1);
        assertTrue("playlist should increment and playlist should contain the song", testPlaylist.songCount() == 1 && testPlaylist.songExists(newSong1));
    }
    
    @Test 
    public void testRemoveFromPlaylist()
    {
        Playlist testPlaylist = new Playlist("Remove Playlist Test");
        testPlaylist.addSong(newSong2);
        int holdCountBeforeRemove = testPlaylist.songCount();
        testPlaylist.removeSong(newSong2);
        assertTrue("The song count before removal should be one and after should be zero", holdCountBeforeRemove == 1 && testPlaylist.songCount() == 0);     
    }
    
    @Test
    public void testAddDuplicateSong() //linked list should allow me to add a dupe
    {
        Playlist testPlaylist = new Playlist("The B-sides");
        testPlaylist.addSong(newSong3);
        testPlaylist.addSong(newSong3);
        testPlaylist.addSong(newSong3);
        assertTrue("Song count should be 3 after 3 duplicates added", testPlaylist.songCount() == 3);    
    }
}
