package edu.cscc;
import java.util.Random;

/**
 * Rock-Paper-Scissors-Lizard-Spock Class
 * @author Adil Umar
 * @version 1.0
 */
public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());
    /**
     * Finalizes variable Rock to rock.
     */
    public static final String ROCK = "rock";
    /**
     * Finalizes variable Paper to paper
     */
    public static final String PAPER = "paper";
    /**
     * Finalizes variable Scissors to scissors
     */
    public static final String SCISSORS = "scissors";
    /**
     * Finalizes variable Lizard to lizard
     */
    public static final String LIZARD = "lizard";
    /**
     * Finalizes variable Spock to spock
     */
    public static final String SPOCK = "spock";


    /**
     * Determine human's pick
     * @param pick - human's pick
     * @return False or Rock or Paper or Scissors or Lizard or Spock
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     * Generate computer's pick
     * @return computer's pick
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     *
     * @param c_pick - Computer's pick
     * @param h_pick - Human's pick
     * @return Selection of what was picked
     */
    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}