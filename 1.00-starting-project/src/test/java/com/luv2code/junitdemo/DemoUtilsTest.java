package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@TestMethodOrder(MethodOrderer.MethodName.class) //sort methods by method name
//@TestMethodOrder(MethodOrderer.DisplayName.class) //sort methods by display name
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //sort methods by @Order annotation
public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        // System.out.println("@BeforeEach executes before execution of each test method");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply(){
        assertEquals(12,demoUtils.multiply(3,4),"3*4 must be 12");

    }
    @Test
    @DisplayName("Equals and Not Equals")
    @Order(1)
    void test_Equals_And_Not_Equals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        // set up
        //DemoUtils demoUtils = new DemoUtils();
        //  int expected = 6;
        // int unexpected = 8;
        // execute
        // int actual = demoUtils.add(2,4);
        //assert
        // assertEquals(expected,actual,"2+4 must be 6");
        // assertNotEquals(unexpected,actual,"2+4 must not be 8");

        //execute and assert
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
    }

    @Test
    @DisplayName("Null and Not Null")
    @Order(2)
    void testNullAndNull() {
        System.out.println("Running test: testNullAndNull");
        //DemoUtils demoUtils = new DemoUtils();
        String str1 = null;
        String str2 = "luv2code";
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }

    @DisplayName("Same and Note Same")
    @Test
    @Order(3)
    void testSameOrNotSame() {
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to the same object");
    }
    @DisplayName("True or False")
    @Test
    @Order(4)
    void testTrueOrFalse(){
        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return false");
    }
    @DisplayName("Array Equals")
    @Test
    void testArrayEquals(){
        String[] stringArray = {"A","B","C"};
        assertArrayEquals(stringArray,demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays should be equal");
    }

    @DisplayName("Iterable equals")
    @Test
    void testIterableEquals(){
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"Expected list should be same as actual list ");
    }

    @DisplayName("Lines match")
    @Test
    void testLinesMatch(){
        List<String> theList = List.of("luv","2","code");
        assertLinesMatch(theList,demoUtils.getAcademyInList(),"Lines should match");
    }

    @DisplayName("Throws and Does Not Throw ")
    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class, () -> {demoUtils.throwException(-1); }, "Should throw an exception");
        assertDoesNotThrow(()->{demoUtils.throwException(5);},"Should not throw an exception");
    }
    @DisplayName("Timeout")
    @Test
    @Order(5)
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), ()-> {demoUtils.checkTimeout();}, "Method should execute in 3 seconds" );
    }


/*


    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeEachClass(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes onlly once after all test methods exucution in the class ");
    }

 */
}
