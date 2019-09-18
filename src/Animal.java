public abstract class Animal
{
	public String name, type;
	boolean isAsleep = true;
	public abstract void makeNoise();
	public abstract void roam();
	
	protected Animal(String _name, String _type)
	{
		name = _name;
		type = _type;
		assert(name.substring(0,1).equalsIgnoreCase(type.substring(0,1)));//enforcing the first letter policy, ignoring the case of the first letter (eg. a House Cat can be called Harry and harold)
	}
	
	/*
	Avoids duplicating the random behavior code that any animal can use. probs should be the same length as behaviors, and is the probability that the ith behavior is observed. probs should also sum to 1
	 */
	protected void doBehavior(double[] probs, String[] behaviors)
	{
		assert(probs.length == behaviors.length);
		double pagTestSum = 0;
		for(double p : probs)
			pagTestSum += p;
		assert(pagTestSum >= (1.-1e-8) && pagTestSum < (1.+1e-8));
		
		double r = Math.random();//random float between 0 and 1
		double prob_agg = 0;
		for(int i = 0; i < probs.length; i++)
		{
			prob_agg += probs[i];
			if(r < prob_agg)
			{
				System.out.println(name + " the " + type + " " + behaviors[i]);
				return;
			}
		}
		System.out.println(name + " the " + type + " " + behaviors[behaviors.length-1]);//safety in case the sum of probabilities was just under 1 and r was out of range
	}
	
	/*
	alternate form that is deterministic
	 */
	protected void doBehavior(String behavior)
	{
		System.out.println(name + " the " + type + " " + behavior);
	}
	
	public void eat(String food)
	{
		double[] probs = {0.3,0.6,0.1};
		eat(food,probs);
	}
	
	/*
	Simpler function that subclasses can call if their roam is simple
	 */
	protected void roam(String location)
	{
		doBehavior("roams about the " + location);
	}
	
	/*
	Simpler function that subclasses can call if their noise is simple
	 */
	protected void makeNoise(String noiseString)
	{
		doBehavior(noiseString);
	}
	
	/*
	"alternate" version of eat that allows overriding the probabilities
	 */
	protected void eat(String food, double[] probs)
	{
		String[] behaviors = {"enjoys the " + food,
				"consumes the " + food,
				"refuses to consume this refuse. \"Bring me something better than " + food + "!\""};
		doBehavior(probs,behaviors);
	}
	
	public void wakeUp()
	{
		isAsleep = false;
		System.out.println("What's this? "  + name + ", a " + type + " is waking up!");
	}
	
	public void goToSleep()
	{
		isAsleep = true;
		System.out.println("Bedtime for the "  + type + " " + name);
	}
}
