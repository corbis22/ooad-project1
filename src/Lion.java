public class Lion extends Feline
{
	public Lion(String _name)
	{
		super(_name,"Lion");
	}
	
	public void roam()
	{
		super.roam("savannah");
	}
	
	public void makeNoise()
	{
		super.makeNoise("roars");
	}
}
