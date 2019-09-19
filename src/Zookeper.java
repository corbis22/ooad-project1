import java.util.List;

public class Zookeper
{
	public void wakeAnimals(List<Animal> zoo) {
		System.out.println("Waking up the animals...");
		for (Animal animal : zoo) {
			animal.wakeUp();
		}
		System.out.println("All the animals are awake!");
	}

	public void rollCallAnimals(List<Animal> zoo) {
		System.out.println("Taking roll call...");
		for (Animal animal : zoo) {
			animal.makeNoise();
		}
		System.out.println("That's everybody!");
	}

	public void feedAnimals(List<Animal> zoo) {
		System.out.println("Feeding the animals...");
		for (Animal animal : zoo) {
			//TODO: add foods/probs for the eat behavior
			animal.eat();
		}
		System.out.println("The food is all gone!");
	}

	public void exerciseAnimals(List<Animal> zoo) {
		System.out.println("Time for a workout...");
		for (Animal animal : zoo) {
			animal.roam();
		}
		System.out.println("All in a day's work!");
	}

	public void shutDownZoo(List<Animal> zoo) {
		System.out.println("Lights out...");
		for (Animal animal : zoo) {
			animal.goToSleep();
		}
	}
}
