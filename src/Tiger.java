public class Tiger extends Feline
{
	public Tiger(String _name)
	{
		super(_name,"Tiger");
	}
	
	public void roam()
	{
		super.roam("jungle");
	}
	
	public void makeNoise()
	{
		super.makeNoise("growls");
	}
}
