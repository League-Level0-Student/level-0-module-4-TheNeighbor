package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What pet do you want? (dog, cat, or parrot)");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		for (int i = 0; i < 20; i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.

			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Food", "Water", "Take a walk" },
					null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 10) {
				JOptionPane.showMessageDialog(null, "You love your pet!");
				break;
			}
			if (task == 0) {
				Cuddle(pet);
			}
			if (task == 1) {
				Food(pet);
			}
			if (task == 2) {
				Water(pet);
			}
			if (task == 3) {
				Walk(pet);
			}
		}
	}

	static // 4. Create methods to handle each of your user selections.
	void Cuddle(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "*Licks you.*");

		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Purr.");
		} else if (pet.equalsIgnoreCase("parrot")) {
			JOptionPane.showMessageDialog(null, "*Whistles.*");
		}
		happinessLevel += 2;

	}

	static void Food(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "Nom nom!");

		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Crunch!");
		} else if (pet.equalsIgnoreCase("parrot")) {
			JOptionPane.showMessageDialog(null, "Yum!");
		}
		happinessLevel += 5;

	}

	static void Walk(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "Woof!");

		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Meow!");
		} else if (pet.equalsIgnoreCase("parrot")) {
			JOptionPane.showMessageDialog(null, "Squak!");
		}
		happinessLevel += 3;

	}

	static void Water(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "Slurp!");

		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Slurp!");
		} else if (pet.equalsIgnoreCase("parrot")) {
			JOptionPane.showMessageDialog(null, "Slurp!");
		}
		happinessLevel += 4;

	}

	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

}