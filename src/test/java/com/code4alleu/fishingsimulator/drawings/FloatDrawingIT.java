/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.code4alleu.fishingsimulator.drawings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class FloatDrawingIT {
    
    public FloatDrawingIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of draw method, of class FloatDrawing.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        int choice = 0;
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.draw(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of firstFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys() {
        System.out.println("rys");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.firstFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of secondFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys1() {
        System.out.println("rys1");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.secondFigure();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thirdFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys2() {
        System.out.println("rys2");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.thirdFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fourthFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys3() {
        System.out.println("rys3");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.fourthFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fifthFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys4() {
        System.out.println("rys4");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.fifthFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sixthFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys5() {
        System.out.println("rys5");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.sixthFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seventhFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys6() {
        System.out.println("rys6");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.seventhFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eightFigure method, of class FloatDrawing.
     */
    @Test
    public void testRys7() {
        System.out.println("rys7");
        FloatDrawing instance = new FloatDrawing();
        String expResult = "";
        String result = instance.eightFigure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
