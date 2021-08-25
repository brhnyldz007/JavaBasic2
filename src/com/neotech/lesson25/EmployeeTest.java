package com.neotech.lesson25;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EmployeeTest {
	public static void main(String[] args) {

		Map<Integer, Employee> str = new TreeMap<>();

		str.put(1, new Employee("Hakan", 100000));
		str.put(2, new Employee("Shodmon", 120000));
		str.put(2, new Employee("Victor", 130000));
		
		
		Collection<Employee> values = str.values();

		Set<Entry<Integer, Employee>> entries = str.entrySet();

		Iterator<Entry<Integer, Employee>> itr = entries.iterator();

		Entry<Integer, Employee> maxEntry = itr.next();

		while (itr.hasNext()) {
			Entry<Integer, Employee> entry = itr.next();

			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}

		}

		System.out.println("The highest entry is: " + maxEntry);
	}

}
