
public class MainTalleyCounter
{

	public static void main(String[] args)
	{
		TalleyCounter counter1= new TalleyCounter();
		TalleyCounter counter2 = new TalleyCounter(100);
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		//why dont you need to import the class for the method to work
		
		counter1.click();
		counter1.click();
		counter1.click();
		//is there a way to change the method so that you can say how many times to click
		System.out.print(counter1.getCount());
		
		counter1.unclick();
		System.out.print(counter1.getCount());
		
		counter1.reset();
		System.out.print(counter1.getCount());
		
		System.out.println(counter1);
		String stringDeal = "" + counter1;
	}
}
