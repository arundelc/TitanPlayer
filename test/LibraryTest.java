/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
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
    Library testLibrary;
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
        testLibrary = new Library();
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
        testLibrary.addSong(newSong1);
        testLibrary.addSong(newSong2);
        assertEquals("This test should show only two songs added", 2, testLibrary.songCount());
    }
    @Test
    public void testSortByTitle() //I don't like this test
    {
        testLibrary.addSong(newSong3);
        testLibrary.addSong(newSong5);
        testLibrary.sortByArtist();  // make sure sorted by artist; might be useful if default sort changes
        testLibrary.sortByTitle();   // then we sort by title
        List<Song> compare = new ArrayList<Song>(); //lets me set the order
        compare.add(newSong5); 
        compare.add(newSong3); 
        assertArrayEquals(compare.toArray(), testLibrary.getAllSongsInLibrary().toArray());
    }
    @Test
    public void testSortByArtist() //this test also sucks
    {
        testLibrary.addSong(newSong3);
        testLibrary.addSong(newSong5);
        testLibrary.sortByTitle();
        testLibrary.sortByArtist();
        List<Song> compare = new ArrayList<Song>();
        compare.add(newSong3);
        compare.add(newSong5);
        assertArrayEquals(compare.toArray(), testLibrary.getAllSongsInLibrary().toArray());
    }
    @Test
    public void testGetAllSongsInLibrary()
    {
        testLibrary.addSong(newSong4);
        testLibrary.addSong(newSong5); 
        List<Song> compare = new ArrayList<Song>();
        compare.add(newSong4);
        compare.add(newSong5);
        assertArrayEquals(compare.toArray(), testLibrary.getAllSongsInLibrary().toArray());
    }
    @Test 
    public void testNoDuplicationInSet() //Alot of these tests are written just for me to learn
        {
        testLibrary.addSong(newSong1);
        testLibrary.addSong(newSong1);
        assertTrue("Tests to see if duplicate song can be added to set", testLibrary.songCount() == 0x01);
        }
    @Test
    public void testRemoveSong()
    {
        testLibrary.addSong(newSong3);
        testLibrary.removeSong(newSong3);
        assertFalse("Song should not exist", testLibrary.songExists(newSong3)); 
    }

}
