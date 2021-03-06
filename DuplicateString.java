package Assesement_06_06_22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateString {

	public static void removeCharacterAndDigits() {
		Scanner scanner = new Scanner(System.in);
		String duplicateElement;
		System.out.println("Enter the elements contains duplicate character or digits : ");
		duplicateElement = scanner.nextLine();
		String removeDigitString = "";
		int result = 0;
		int j;
		// converting string into character

		char[] elements = duplicateElement.toCharArray();

		Set<Character> set = new HashSet<>();

		StringBuilder builder = new StringBuilder();

		for (char newElement : elements) {
			if (!set.contains(newElement)) {
				set.add(newElement);
				builder.append(newElement);

			}

			if (!Character.isDigit(newElement)) {
				removeDigitString = removeDigitString + newElement;
			}
		}
//		System.out.println("Strings After removing duplicates : " + builder.toString());
//		System.out.println("after removing digits :" + removeDigitString.toString());

		for (int index = 0; index < elements.length; index++) {
			for (j = 0; j < index; j++) {

				if (Character.isDigit(elements[index])) {

					if (elements[index] == elements[j]) {
						break;
					}
				}
			}

			if (j == index) {
				elements[result++] = elements[index];
			}
		}
		System.out.println("After Removal  : " + String.valueOf(Arrays.copyOf(elements, result)));

	}

	public static void main(String[] args) {
		removeCharacterAndDigits();
	}
}
