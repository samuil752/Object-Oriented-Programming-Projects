package model;

import java.util.Iterator;

public class RefurbishedStore {
	private Entry[] entries;
	private int noe;
	private final int MAX_CAPACITY = 5;
	public RefurbishedStore() {
		this.entries = new Entry[MAX_CAPACITY];
		this.noe = 0;
	}
	public Entry[] getPrivateEntriesArray() {
		return this.entries;
	}
	
	public Entry[] getEntries() {
		Entry[] es = new Entry[this.noe];
		for (int i = 0; i < this.noe; i++) {
			es[i] = this.entries[i];
		}
		return es;
	}
	
	public void addEntry(Entry e) {
		this.entries[this.noe] = e;
		this.noe++;
		
	}
	//overloading
	public void addEntry(String sn, Product p) {
		Entry ne = new Entry(sn, p);
		this.addEntry(ne);
	}
	//overloading
	public void addEntry(String sn, String model, double originalPrice) {
		Product p = new Product(model, originalPrice);
		Entry ne = new Entry(sn, p);
		this.addEntry(ne);
	}
	
	public Product getProduct(String sn) {
		int index = -1;
		for (int i=0; i</* this may cause a null pointer exception use noe instead. i<this.entries.length*/this.noe; i++) {
			Entry e = this.entries[i];
			if(e.getSerialNumber().equals(sn)) {
				index = i;
			}
		}
		if (index<0) {
			return null;
		} else {
			return this.entries[index].getProduct();
		}
	}
	public int getMaxCapacity() {
		return this.MAX_CAPACITY;
	}
	public Object getNumberOfEntries() {
		return noe;
	}
}


