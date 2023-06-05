package curs7;

import java.util.Random;

public class RandomNumersExercise {

	/**
	 * Facem un program care genereaza 6 numere intre 0-9
	 * le pune intr-un array
	 * nu tine numere duplicate
	 * printeaza array-ul
	 * 
	 * o metoda care printeaza aray-ul
	 * o metoda care verifica daca numerele sunt duplicate
	 * o metoda care genereaza nr si le pune in array
	 *  
	 */
	public final int LENGTH = 6;
	public final int MAX_NUMBERS = 9;
	
	
	public int[] generateNumbers() {
		int[] numbers =  new int[LENGTH];
		Random random =  new Random();
		for(int i=0; i<LENGTH; i++) {
			int randomNR = 0;
			do {
				randomNR = random.nextInt(MAX_NUMBERS);

			}while(checkDuplicate(numbers, randomNR));
			
			numbers[i] = randomNR;
		}
		return numbers;
	}
	
	public boolean checkDuplicate(int[] array, int nr) {
		for(int number : array) {
			if(number == nr) {
				return true;
			}
		}
		return false;
	}
	
	
	public void printArray(int[] array) {
		/* for(int i = 0; i<LENGTH;i++) {
			System.out.println(array[i]);
		}*/
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
	}
	
	
	public static void main(String[] args) {

		RandomNumersExercise obj =  new RandomNumersExercise();
		obj.printArray(obj.generateNumbers());
		
		
	}

}