/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author udesc
 */
public class ComputerTest {
    
    public ComputerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class Computer.
     */
    @Test
    public void testVelha(){
        Board board = new Board();
        int[] a = {0,0};
        int[] b = {0,1};
        int[] c = {1,0};
        int[] d = {1,1};
        int[] e = {2,0};
        int[] f = {2,1};
        board.setPosition(a, 3);
        board.setPosition(b, 1);
        board.setPosition(c, 3);
        board.setPosition(d, 1);
        board.setPosition(e, 3);
        board.setPosition(f, 1);
        boolean ans = false;
        
        if(board.getPosition(a) == -1 && board.getPosition(b) == 1){
            if(board.getPosition(d) == -1 && board.getPosition(c) == 1){
                if(board.getPosition(f) == -1 && board.getPosition(e) == 1){
                    ans = true;
                }
            }
        }
        System.out.println(ans);
        assertTrue("Velha", ans);
    }
    
}
