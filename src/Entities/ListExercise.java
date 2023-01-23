package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListExercise {
	public static void main(String[] args) {
		List people = new ArrayList<Person>();
		int print_person, position;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= people.size(); i++) {
			int new_person;
			System.out.println("Do you want to register a new person?\n0 - No\n1 - Yes");
			new_person = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if (new_person == 1) {
				String name;
				int age;
				double height;

				System.out.println("What is the name of the person?");
				name = sc.nextLine();
				System.out.println("How old is that person?");
				age = sc.nextInt();
				System.out.println("Whats the height of that person?");
				height = sc.nextDouble();
				System.out.println();

				Person person = new Person(name, age, height);
				people.add(person);
			}
		}

		do {
			System.out.println("Do you want to print the data of one position?\n0 - No\n1 - Yes");
			print_person = sc.nextInt();
			System.out.println();

			if (print_person == 1) {
				String data;
				System.out.println("What position do you want to get?\n" + "There are " + people.size() + " positions");
				position = sc.nextInt();
				sc.nextLine();

				if (people.get(position - 1) == null) {
					System.out.println("Error to get the values");
					break;
				}

				data = (position > people.size() || position < 1) ? ("Invalid position")
						: people.get(position - 1).toString();
				System.out.println(data);
			}

		} while (print_person != 0);

	}
}
