import java.util.List;
import java.util.ArrayList;

public class main
{
	public static void main(String[] args)
	{
	    List<Animal> zoo = new ArrayList();
	    zoo.add(new Dog("Doug"));
	    zoo.add(new Dog("Diane"));
		zoo.add(new Elephant("Earl"));
		zoo.add(new Elephant("Elanor"));
		zoo.add(new Hippo("Harry"));
		zoo.add(new Hippo("Helen"));
		zoo.add(new HouseCat("Herman"));
		zoo.add(new HouseCat("Heather"));
		zoo.add(new Lion("Luigi"));
		zoo.add(new Lion("Laura"));
		zoo.add(new Rhino("Ryan"));
		zoo.add(new Rhino("Rachel"));
		zoo.add(new Tiger("Tim"));
		zoo.add(new Tiger("Tina"));
		zoo.add(new Wolf("Warren"));
		zoo.add(new Wolf("Wendy"));

		Zookeeper keeper = new Zookeeper(zoo);
		keeper.wakeAnimals();
		keeper.rollCallAnimals();
		keeper.feedAnimals();
		keeper.exerciseAnimals();
		keeper.shutDownZoo();
	}
}
