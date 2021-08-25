package com.neotech.lesson25;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Entry {
	public static void main(String[] args) {

		Map<String, Integer> months = new LinkedHashMap<>();

		months.put("January", 15);
		months.put("February", 12);
		months.put("March", 3);
		months.put("April", 5);

		System.out.println(months);

		// Entry
		Set<Entry<String, Integer>> entries = months.entrySet();
		System.out.println(entries);

		// looping using enhanced for
		for (Entry e : entries) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		// looping using iterator

		Iterator<Entry<String, Integer>> it = entries.iterator();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}

}
