package pl.coderslab.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;



public class GenerateRandom {
	
	public static void main(String[] args) {
		Map<Integer, Integer> mappy = checkRand(200, 50);
		
		for (int i = 0; i<mappy.size(); i++) {
			System.out.println(i + " : " + mappy.get(i));
		}
		
	}
	
	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		Random rand = new Random();
		Map<Integer, Integer> map = new HashMap<>();
		
		List <Integer> list1 = new ArrayList<>();
		for (int i = 0; i<=amount; i++) {
			list1.add(rand.nextInt(interval));
		}
		Collections.sort(list1);
		List <Integer> list2 = new ArrayList<>();
		for (int i = 0; i<interval; i++) {
		list2.add(Collections.frequency(list1, i));
		map.put(i, list2.get(i));
		
	}	
		return map;
}
}
