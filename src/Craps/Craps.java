package Craps;

/**
 * Craps manages a game of craps.
 * 
 * @author William Austad
 * @version 2/11/06
 */
public class Craps implements GameStatus
{
    private int myPoint, rollSum, roll1, roll2;
    private boolean isFirst;
    private int status;
    private Die die;
    private int dinero;
    
    /**
     * Constructor for objects of class Craps
     */
    public Craps()
    {
	die = new Die();
	init();
    }
    public void init()
    {
	isFirst = true;
	roll1 = roll2 = 0;
        status = CONTINUE;
    }

    /**
     * getIsFirst returns isFirst
     * @return isFirst
     */
    public boolean getIsFirst()
    {
	return(isFirst);
    }

    /**
     * roll
     */
    public void roll()
    {
        roll1 = die.getValue();
	die.rollDie();
        roll2 = die.getValue();
	die.rollDie();
        
	rollSum = roll1+roll2;

        if(isFirst) {
            isFirst = false;
            switch(rollSum) {
            case 2: case 3: case 12:
                status = LOST;
                break;
            case 7: case 11:
                status = WON;
                break;      
            default:
                myPoint = rollSum;
            }
        } else {
            if(rollSum == 7) {
                status = LOST;
            } else if(rollSum == myPoint) {
                status = WON;
            }
        }
    }

    /**
     * getRollSum
     *
     * @return rollSum
     */
    public int getRollSum()
    {
        return(rollSum);
    }

    /**
     * getRoll1
     *
     * @return roll1
     */
    public int getRoll1()
    {
        return(roll1);
    }

    /**
     * getRoll2
     *
     * @return roll2
     */
    public int getRoll2()
    {
        return(roll2);
    }

    /**
     * getMyPoint
     *
     * @return myPoint
     */
    public int getMyPoint()
    {
        return(myPoint);
    }
    
    /**
     * getStatus
     *
     * @return  status
     */
    public int getStatus()
    {
        return(status);
    }

	public int darSaldo() {
		// TODO Auto-generated method stub
		return dinero;
	}

	@Override
	public void ponerSaldo(int d) {
		// TODO Auto-generated method stub
		dinero = d;
	} 
}

