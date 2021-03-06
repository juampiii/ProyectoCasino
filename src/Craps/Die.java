package Craps;

import java.util.Random;
/**
 * This class models the actions of a Die.
 */
public class Die
{
    // instance variable -- the data in each object
    private int value;

    // a pseudorandom number generator
    private Random rand;
    
    /**
     * Constructor for objects of class Die
     * called whenever a new Die is created.
     */
    public Die()
    {
        rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    /**
     * rollDie updates the value of value to a
     * pseudorandom integer from 1 to 6.
     */
    public void rollDie()
    {
        value = rand.nextInt(6) + 1;
    }

    /**
     * Accessor function. Returns the value of the Die.
     * @return  value
     */
    public int getValue()
    {
        return(value);
    }
    
    /**
     * Overrides default toString method from Object
     * @return String representation of the Die
     */ 
    public String toString()
    {
        return("Die(" + value + ")");
    }
} 

