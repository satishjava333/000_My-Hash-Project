package com.hashtable.implclient;

import com.hashtable.lib.HashTableProvider;

public class HashTableImplClient {

	public static void main(String[] args) {

		HashTableProvider hashTableProvider = new HashTableProvider();

		hashTableProvider.put("Max", "New York");
		hashTableProvider.put("Me Me", "China");
		hashTableProvider.put("Peter", "Germany");

		System.out.println("Max: " + hashTableProvider.get("Max"));
		System.out.println("Me Me: " + hashTableProvider.get("Me Me"));
		System.out.println("Peter: " + hashTableProvider.get("Peter"));

	}

}
