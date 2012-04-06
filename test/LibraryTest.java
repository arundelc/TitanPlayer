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
public class LibraryTest {
    
    public LibraryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
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
    public void TestEmptyLibrary()
    {
        Library emptyLibrary = new Library();
        assertEquals("An empty library should contain 0 elements",0 ,emptyLibrary.songCount());
    }
    
    @Test
    public void testAddSong()
    {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Poison", "Bell Biv Devoe"));
        myLibrary.addSong(new Song("We care a-lot", "Faith No More"));
        assertEquals("This test should show only two songs added", 2, myLibrary.songCount());
    }
    
    @Test
    public void testRemoveSong()
    {
        Library myLibrary = new Library();
        Song mySong = new Song("A", "C");
        myLibrary.addSong(mySong);
        myLibrary.removeSong(mySong);
        assertFalse("Song should not exist", myLibrary.songExists(mySong)); 
    }

}
