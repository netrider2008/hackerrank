/**
 * 
 */
package com.netrider.problems.hackerrank.misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author netrider2008
 *
 */
public class WordCount {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("H:\\stocks\\31decstocksurvey.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		Set<String> sdata = new HashSet<String>();
		List<String> adata = new ArrayList<String>();
		while ((s = br.readLine()) != null) {
			for (String val : s.split(" ")) {
				val = val.trim().toUpperCase();
				sdata.add(val);
				adata.add(val);
			}
		}
		Map<String, Integer> unSortedMap = new HashMap<String, Integer>();
		int total = 0;
		for (String val : sdata) {
			int freq = Collections.frequency(adata, val);
			// System.out.println("Votes of " + val + " " + freq);
			unSortedMap.put(val, freq);
			total = total + freq;
		}
		System.out.println("total  " + total + " ");

		Set sortedSet = new TreeSet<String>();
		sortedSet.addAll(sdata);
		System.out.println(unSortedMap.size() + "\t" + adata.size() + " " + sdata.size() + " " + sortedSet.size());

		Iterator iterator = sortedSet.iterator();
		/*
		 * while (iterator.hasNext()) { // System.out.println(iterator.next());
		 * }
		 */
		// LinkedHashMap preserve the ordering of elements in which they are
		// inserted
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map   : " + sortedMap);
	}
}
