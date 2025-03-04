package com.hashtable.lib;

public class HashTableProvider {

	private String[] table;

	// size of the table
	private int tableSize = 10;

	public HashTableProvider() {

		table = new String[tableSize];
	}

	// Method to evaluate the Index
	public int getHash(String key) {

		int hash = 0;

		for (int i = 0; i < key.length(); i++) {

			hash += key.charAt(i);
		}
		return hash % tableSize;

	}

	public void put(String key, String Value) {

		int index = getHash(key);

		table[index] = Value;

	}

	public String get(String key) {

		int index = getHash(key);
		
		return table[index];

	}

}
