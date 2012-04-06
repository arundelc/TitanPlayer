/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.*;
import us.abaddonsoftware.bll.Library;
import us.abaddonsoftware.bll.Song;

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
    public void testNoDuplicationInSet() //Alot of these tests are written just for me to learn
        {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Poison", "Bell Biv Devoe"));
        myLibrary.addSong(new Song("Poison", "Bell Biv Devoe"));
        assertTrue("Tests to see if duplicate song can be added to set", myLibrary.songCount() == 0x01);
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
