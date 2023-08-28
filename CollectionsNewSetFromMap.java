package com.bean;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsNewSetFromMap {

	public static void main(String[] args) {
		/*
		 * Adding entries to set will also entries to the map
		 * and vis versa
		 */
		 Map<String, Boolean> backingMap = new HashMap<>();
	        Set<String> stringSet = Collections.newSetFromMap(backingMap);

	        stringSet.add("Apple");
	        stringSet.add("Banana");
	        stringSet.add("Cherry");

	        System.out.println("Set: " + stringSet);
	        backingMap.remove("Apple");
	        System.out.println("Set: " + stringSet);

	        System.out.println(backingMap);
	      	}
		
	}
