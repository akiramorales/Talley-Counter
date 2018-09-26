/**
 * 
 * @author Akira Morales
 *
 */
public class TalleyCounter
{

	//fields
	private int count;
	
	
	//constructors
	public TalleyCounter()
	{
		count = 0;
	}
	
	public TalleyCounter(int a)
	{
		count = a;
	}
	
	//method
	public void click()
	{
		count++; // count = count + 1;
				 // count += 1
	}
	
	
	public int getCount()
	{
		return count;
	}
	
	
	public void reset()
	{
		count = 0;
	}
	
	
	public void unclick()
	{
		count--;
	}
	
	public String toString()
	{
		return "count: " + count;
	}
}
