import java.util.ArrayList;

public class Competition {

	// creates the array list
	private ArrayList<Doggy> dogs = new ArrayList<Doggy>();

	// This loops the dogs rex and chewwy through the whole array list
	public Competition() {
		for (int i = 0; i < 50; i++) {
			dogs.add(new Doggy("Rex", 12, 25, "Husky"));
			dogs.add(new Doggy("Chewwy", 6, 30, "Akita"));
		}
	}

	public void placement(int place) {
		for (int i = 0; i < dogs.size(); i++) {
			int position = i + 1;
			if (position != place) {
				String positionName = String.valueOf(position);

				if (positionName.endsWith("1"))
					positionName += "st";
				else if (positionName.endsWith("2"))
					positionName += "nd";
				else if (positionName.endsWith("3"))
					positionName += "rd";
				else
					positionName += "th";

				System.out.print(positionName + ": " + dogs.get(i).getName());

				if (position == dogs.size()) {
					System.out.print(".");
				} else {
					System.out.print(", ");
				}

			}

			if (position % 10 == 0) {
				System.out.println();
			}

		}
	}

	public void addDog(Doggy dog, int place) {
		dogs.add(place - 1, dog);

	}

}
