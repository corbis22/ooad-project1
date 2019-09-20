public abstract class Animal
{
	public String name, type;
	boolean isAsleep = true;
	public abstract void makeNoise();
	public abstract void roam();
	
	/*
	All animals need a name, and in general we want to know their type so we can verify that it's valid
	 */
	protected Animal(String _name, String _type)
	{
		name = _name;
		type = _type;
		assert(name.substring(0,1).equalsIgnoreCase(type.substring(0,1)));//enforcing the first letter policy, ignoring the case of the first letter (eg. a House Cat can be called Harry and harold)
	}
	
	/*
	Avoids duplicating the random behavior code that any animal can use. probs must be the same length as behaviors, and is the probability that the ith behavior is observed. probs should also sum to 1
	 */
	protected void doBehavior(double[] probs, String[] behaviors)
	{
		//make sure the preconditions are met
		assert(probs.length == behaviors.length);
		double pagTestSum = 0;
		for(double p : probs)
			pagTestSum += p;
		assert(pagTestSum >= (1.-1e-8) && pagTestSum < (1.+1e-8));
		//preconditions met, move along
		
		double r = Math.random();//random float between 0 and 1
		double prob_agg = 0;//aggregator for probabilities
		//main logic: keep checking our random variable, adding on more probability until we find the right bin
		for(int i = 0; i < probs.length; i++)
		{
			prob_agg += probs[i];
			if(r < prob_agg)
			{
				//this is the right bin, do the thing specified for this bin in the behaviors list
				System.out.println(name + " the " + type + " " + behaviors[i]);
				return;
			}
		}
		System.out.println(name + " the " + type + " " + behaviors[behaviors.length-1]);//safety in case the sum of probabilities was just under 1 and r was out of range
	}
	
	/*
	alternate form that is deterministic
	this is basically a wrapper so the same print statement doesn't need to be repeated over and over again
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
	"alternate" (technically default) version of eat that allows overriding the probabilities so that cats (and possibly other creatures later on in the development cycle) can be as picky or as not as they like
	 */
	protected void eat(String food, double[] probs)
	{
		String[] behaviors = {"enjoys the " + food,
				"consumes the " + food,
				"refuses to consume this refuse. \"Bring me something better than " + food + "!\""};
		doBehavior(probs,behaviors);
	}
	
	/*
	Simple function that subclasses can call if their roam behavior is simple
	 */
	protected void roam(String location)
	{
		doBehavior("roams about the " + location);
	}
	
	/*
	Simple function that subclasses can call if their noise is simple
	 */
	protected void makeNoise(String noiseString)
	{
		doBehavior(noiseString);
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
