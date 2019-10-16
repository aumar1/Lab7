package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RPSLSpock_Test {


    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("Rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("Paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("Scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("Lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("Spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("Insert Random String Here"));
    }

    @Test
    public void generatePick() throws Exception {
        for (int i=1; i<=10; ++i) {
            String pick = RPSLSpock.generatePick();
            assertTrue(pick != null);
            assertTrue(RPSLSpock.isValidPick(pick));
            //assertNotNull(RPSLSpock.isValidPick(RPSLSpock.generatePick())) - combines above 3 lines into one

        }
    }

    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "Scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "Lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "Rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "Spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "Paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "Lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "Paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "Spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "Rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "Scissors"));
        Assert.assertFalse(RPSLSpock.isComputerWin("scissors", "Rock"));
    }
}