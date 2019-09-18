public class HouseCat extends Feline
{
	public HouseCat(String _name)
	{
		super(_name,"House Cat");
	}
	
	public void roam()
	{
		double[] probs = {0.36,0.18,0.18,0.09,0.09,0.05,0.04,0.01};
		String[] behaviors = {"naps",
				"explores the grounds",
				"surveys the domain",
				"knocks things off the table",
				"chases small imaginary dead turtles",
				"chases real living turtles",
				"chases " + name,
				"plots the keeper's demise"};
		doBehavior(probs,behaviors);
	}
	
	public void makeNoise()
	{
		double[] probs = {0.3,0.3,0.3,0.1};
		String[] behaviors = {"hisses",
				"yowls",
				"galumphs",
			    "brrrrrows"};
		doBehavior(probs,behaviors);
	}
	
	@Override
	public void eat(String food)
	{
		double[] probs = {0.1,0.1,0.8};//dem cats is picky
		super.eat(food, probs);
	}
}
