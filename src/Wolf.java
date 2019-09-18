public class Wolf extends Canine
{
	public Wolf(String _name)
	{
		super(_name,"Wolf");
	}
	
	public void roam()
	{
		super.roam("forest");
	}
	
	public void makeNoise()
	{
		super.makeNoise("howls");
	}
}
