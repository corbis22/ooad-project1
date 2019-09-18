public class Dog extends Canine
{
	public Dog(String _name)
	{
		super(_name,"Dog");
	}
	
	public void roam()
	{
		super.roam("park");
	}
	
	public void makeNoise()
	{
		super.makeNoise("barks");
	}
}
