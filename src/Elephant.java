public class Elephant extends Pachyderm
{
	public Elephant(String _name)
	{
		super(_name,"Elephant");
	}
	
	public void roam()
	{
		super.roam("savannah");
	}
	
	public void makeNoise()
	{
		super.makeNoise("trumpets");
	}
}
