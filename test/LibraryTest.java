/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import static org.junit.Assert.*;
import org.junit.*;
import us.abaddonsoftware.bll.Library;
import us.abaddonsoftware.bll.Song;

/**
 *
 * @author abaddon
 */
public class LibraryTest {
    Song newSong1;
    Song newSong2;
    Song newSong3;
    Song newSong4;
    Song newSong5;
    Library newLibrary;
    public LibraryTest() {
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
        newLibrary = new Library();
        newSong1 = new Song("We care a-lot", "Faith No More");
        newSong2 = new Song("Poison", "Bell Biv Devoe");      
        newSong3 = new Song("Milkshake", "Good Night Nurse");
        newSong4 = new Song("Epic", "Faith No More");
        newSong5 = new Song("Epic", "Mickey");
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
        newLibrary.addSong(newSong1);
        newLibrary.addSong(newSong2);
        assertEquals("This test should show only two songs added", 2, newLibrary.songCount());
    }
    @Test
    public void testSortByTitle() //I don't like this test
    {
        newLibrary.addSong(newSong3);
        newLibrary.addSong(newSong5);
        newLibrary.sortByArtist();  // make sure sorted by artist; might be useful if default sort changes
        newLibrary.sortByTitle();   // then we sort by title
        List<Song> compare = new ArrayList<Song>(); //lets me set the order
        compare.add(newSong5); 
        compare.add(newSong3); 
        assertArrayEquals(compare.toArray(), newLibrary.getAllSongsInLibrary().toArray());
    }
    @Test
    public void testSortByArtist() //this test also sucks
    {
        newLibrary.addSong(newSong3);
        newLibrary.addSong(newSong5);
        newLibrary.sortByTitle();
        newLibrary.sortByArtist();
        List<Song> compare = new ArrayList<Song>();
        compare.add(newSong3);
        compare.add(newSong5);
        assertArrayEquals(compare.toArray(), newLibrary.getAllSongsInLibrary().toArray());
    }
    @Test
    public void testGetAllSongsInLibrary()
    {
        newLibrary.addSong(newSong5);
        newLibrary.addSong(newSong4); 
        List<Song> compare = new ArrayList<Song>();
        compare.add(newSong4);
        compare.add(newSong5);
        assertArrayEquals(compare.toArray(), newLibrary.getAllSongsInLibrary().toArray());
    }
    @Test 
    public void testNoDuplicationInSet() //Alot of these tests are written just for me to learn
        {
        newLibrary.addSong(newSong1);
        newLibrary.addSong(newSong1);
        assertTrue("Tests to see if duplicate song can be added to set", newLibrary.songCount() == 0x01);
        }
    @Test
    public void testRemoveSong()
    {
        newLibrary.addSong(newSong3);
        newLibrary.removeSong(newSong3);
        assertFalse("Song should not exist", newLibrary.songExists(newSong3)); 
    }

}
