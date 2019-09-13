public abstract class Animal
{
	public String name, type;
	boolean isAsleep = true;
	public abstract void makeNoise();
	public abstract void eat(String food);
	public abstract void roam();
	
	protected Animal(String _name, String _type)
	{
		name = _name;
		type = _type;
	}
	
	public void wakeUp()
	{
		isAsleep = false;
	}
	
	public void goToSleep()
	{
		isAsleep = true;
	}
}
