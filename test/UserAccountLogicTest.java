/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import us.abaddonsoftware.bll.UserAccountLogic;

/**
 *
 * @author abaddon
 */
public class UserAccountLogicTest {
    
    public UserAccountLogicTest() {
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
    public void testSetLoggedIn() // really an unnecessary test but here for completeness
    {
    UserAccountLogic ual = new UserAccountLogic();
    ual.setLoggedIn(true);
    boolean testLoggedIn = ual.getLoggedIn();
    ual.setLoggedIn(false);
    assertTrue(testLoggedIn == true && ual.getLoggedIn() == false);
    }
    
    @Test
    public void testUsernameRegex()
    {
    UserAccountLogic ual = new UserAccountLogic();
    boolean test1 = ual.isValidUsername("Abaddon880");
    boolean test2 = ual.isValidUsername(" 9aj");
    assertTrue(test1 == true && test2 == false);   
    }
    @Test
    public void testPasswordRegex()
    {
    UserAccountLogic ual = new UserAccountLogic();
    boolean test1 = ual.isValidPassword("Password880");
    boolean test2 = ual.isValidPassword("1ff");
    assertTrue(test1 == true && test2 == false); 
    }
    @Test
    public void testEmailRegex()
    {
    UserAccountLogic ual = new UserAccountLogic();
    boolean test1 = ual.isValidEmailAddress("word@word.com");
    boolean test2 = ual.isValidEmailAddress("donnie.lgarbage@.com");
    assertTrue(test1 == true && test2 == false);
    }
}
