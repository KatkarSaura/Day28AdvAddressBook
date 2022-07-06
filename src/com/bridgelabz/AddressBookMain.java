package com.bridgelabz;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AddressBookMain {
	private String firstName;
	private String lastName;
}

public class Address {
	private String street;
	private String city;
	private String country;
	private String pincode;
	
}

public class AddressBook {
	private Map<Person,Address>contacts = new ConcurrentHashMap<Person,Address>();
	
	public void addContact(Person p, Address a) {
		this.contacts.put(p,a);
	}
	
	public void removeContact(Person p) {
		this.contacts.remove(p);
	}
	
	public Collection<Person> findAllContacts(){
		return new Collection(this.contacts.keySet());
	}
	
	public boolean hasContact(Person p) {
		return this.contacts.containsKey(p);
		
	}

}
