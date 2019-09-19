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
			double r = Math.random();
			String food = "";
			if(r < 0.3)
				food = "grub";
			else if(r < 0.5)
				food = "kibble";
			else if(r < 0.7)
				food = "consumables";
			else if(r < 0.9)
				food = "relevant food";
			else if(r < 0.99)
				food = "dubious food";
			else
				food = ".\n" +
						".\n" +
						"s̵͖̖̭̠̺͂͒̓̏͢͞ȏ̠̘̞͓̼̮͍͌̀̔̅̌̃̄͟͢͡ư̸̳͓̖̙̫̞͒̽̑͛̕͟͟͜͝l̸̨͇̫̜͈̃͐̇̏̑̐̏̑̚s̵̲̮̤͈͖̟̰̾̂̈́͌̕͝\n" +
						".\n" +
						".";
			animal.eat(food);
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
