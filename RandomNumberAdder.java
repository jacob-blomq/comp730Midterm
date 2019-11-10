package Midterm;

import java.util.ArrayList;
import java.util.Random;
public class RandomNumberAdder {
	
	ArrayList<Integer> numList;
	Random rand = new Random();
	int sum;
	
	public RandomNumberAdder() {
		numList = new ArrayList<Integer>();
		sum = 0;
	}
	
	public void addRandomNumbers(int howMany, int howRandom) {
		for (int i = 0; i < howMany; i++) {
			int rand_int = rand.nextInt(howRandom);
			numList.add(rand_int);
		}
	}
		
	public void sumRandomNumbers() {
		for (Integer n: numList) {
			sum = sum + n;
		}
	}
	
	
	public static void main(String[] args) {
		RandomNumberAdder instance = new RandomNumberAdder();
		instance.addRandomNumbers(10, 100);
		System.out.println("The numbers are " + instance.numList +  " and the sum is " + instance.sum);
	}
}
