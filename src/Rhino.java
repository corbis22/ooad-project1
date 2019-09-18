public class Rhino extends Pachyderm
{
	public Rhino(String _name)
	{
		super(_name,"Rhino");
	}
	
	public void roam()
	{
		super.roam("savannah");
	}
	
	public void makeNoise()
	{
		super.makeNoise("galumphs");
	}
}
