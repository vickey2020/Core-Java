package com.deepak.collectionInternalImplementation;

class MyHashMap {

	private static Entry[] element;
	private int size = 0;
	int index;

	public MyHashMap() {
		size = 16;
		element = new Entry[size];
	}

	static class Entry {
		final String key;
		String value;
		Entry next;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return key;
		}
	}

	public void put(String key, String value) {
		if (key == null) {
			putForNullKey(key, value);
		}
		int hash = hash(key.hashCode());
		int i = indexFor(hash, element.length);
		// System.out.println("put i :: " + i + " && " + element.length);
		Entry oldEntry = element[i];
		while (oldEntry != null) {
			if (oldEntry.getKey().equals(key)) {
				oldEntry.value = value;
				return;
			}
			oldEntry = oldEntry.next;
		}
		Entry newEntry = new Entry(key, value);
		newEntry.next = oldEntry;
		element[i] = newEntry;
	}

	private void putForNullKey(String key, String value) {
		Entry newEntry = new Entry(key, value);
		element[0] = newEntry;
	}

	/**
	 * Returns index for hash code h.
	 */
	static int indexFor(int h, int length) {
		return h & (length - 1);
	}

	public Entry get(String key) {
		if (key == null)
			return getForNullKey();
		int hash = hash(key.hashCode());
		int i = indexFor(hash, element.length);
		// System.out.println("i: " + i);
		Entry oldEntity = element[i];
		while (oldEntity != null) {
			if (oldEntity.key.equals(key)) {
				return oldEntity;
			}
			oldEntity = oldEntity.next;
		}
		return null;
	}

	private Entry getForNullKey() {
		for (Entry e = element[0]; e != null; e = e.next) {
			if (e.key == null)
				return e;
		}
		return null;
	}

	/*
	 * public int hashCode() { return index; }
	 */

	static int hash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	public static void main(String[] args) {
		MyHashMap m = new MyHashMap();
		m.put("Deepak", "Job");
		m.put("Chandu", "DataTemplet");
		m.put("Ankit", "Tecleaver");
		m.put("Sumit", "Netzelous");
		m.put("Sumit", "Net");
		m.put("Sumit", "Net");
		//m.put(null, "Software");
		//m.put(null, "Software");

		MyHashMap.Entry e1 = m.get("Deepak");
		System.out.println("Deepak :: " + e1.getValue());
		MyHashMap.Entry e2 = m.get("Chandu");
		System.out.println("Chandu :: " + e2.getValue());
		MyHashMap.Entry e3 = m.get("Ankit");
		System.out.println("Ankit :: " + e3.getValue());
		MyHashMap.Entry e4 = m.get("Sumit");
		System.out.println("Sumit :: " + e4.getValue());
		//MyHashMap.Entry e5 = m.get(null);
		//System.out.println("null :: " + e5.getValue());
		
/*
		Set entry = m.entrySet();
		Iterator itr = entry.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> et = (Map.Entry<String, String>) itr.next();
			System.out.println(et.getKey() + " " + et.getValue());
		}*/
	}


}