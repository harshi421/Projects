package com.Harshitha.sl.Assignements;
import java.util.LinkedHashMap;
import java.util.Set;
public class Map { 
		public static void main(String[] args)
		{
			LinkedHashMap<String,Integer> m =new LinkedHashMap<String, Integer>();
			m.put("1 - storeroom" , 5000);
			m.put("2 - storeroom" , 6000);
			m.put("3 - storeroom" , 7000);
			Set<Map.Entry<String,Integer>> s = m.entrySet();
			for (Map.Entry<String, Integer> it: s)
			{
				System.out.println("Before change of value = " +it.getKey() + " " + it.getValue());
				double getRandom = Math.random() * 100000;
				int getRoundoff = (int) Math.round(getRandom);
				it.setValue(getRoundoff);
				System.out.println("After change of value = " +it.getKey() + " " + it.getValue());
			}
		}
	}




