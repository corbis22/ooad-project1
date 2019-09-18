public class Hippo extends Pachyderm
{
	public Hippo(String _name)
	{
		super(_name,"Hippo");
	}
	
	public void roam()
	{
		super.roam("wetlands");
	}
	
	public void makeNoise()
	{
		super.makeNoise("splooshes");
	}
}
