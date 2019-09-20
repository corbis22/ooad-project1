/*
All housecats are cats, not all cats are housecats. Thus, there is no Cat class
 */
public class HouseCat extends Feline
{
	public HouseCat(String _name)
	{
		super(_name,"House Cat");
	}
	
	/*
	Cats are beasts of random behavior. Nevermind the more dubious ones.
	 */
	public void roam()
	{
		double[] probs = {0.36,0.18,0.18,0.09,0.09,0.05,0.04,0.01};
		String[] behaviors = {"naps",//happens with probablity 0.36
				"explores the grounds",//p = 0.18
				"surveys the domain",//p = 0.18
				"knocks things off the table",//p = 0.09
				"chases small imaginary dead turtles",//p = 0.09
				"chases real living turtles",//p = 0.05
				"chases " + name,//p = 0.04
				"plots the keeper's demise"};//p = 0.01 ~you didn't see anything, jon~
		doBehavior(probs,behaviors);
	}
	
	public void makeNoise()
	{
		double[] probs = {0.3,0.3,0.3,0.1};
		String[] behaviors = {"hisses",//p = 0.3
				"yowls",//p = 0.3
				"galumphs",//p = 0.3
			    "brrrrrows"};//p = 0.3
		doBehavior(probs,behaviors);
	}
	
	@Override
	public void eat(String food)
	{
		double[] probs = {0.1,0.1,0.8};//dem cats is picky, so they're more likely to reject food
		super.eat(food, probs);
	}
}
