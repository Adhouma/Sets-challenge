package com.learn.java;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

	// Fields
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	// Constructor
	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	// Methods
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		System.out.println("this.getClass() is " + this.getClass());
		System.out.println("obj.getClass() is " + obj.getClass());

		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}

		String objName = ((HeavenlyBody) obj).getName();
		return this.name.equals(objName);
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode() called");
		System.out.println(this.name + ", hashCode = " + this.name.hashCode());
		// 57 => random number
		return this.name.hashCode() + 57;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
}
