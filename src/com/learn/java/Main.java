package com.learn.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	/**
	 * Create a HeavenlyBody class that demonstrate planets on the solar system
	 * The HeavenlyBody fields are: 
	 * - name (String)
	 * - orbitalPeriod (double)
	 * - satellites (Set)
	 * 
	 * Create a addMoon method that allows you to add a moon of the type HeavenlyBody to the satellites
	 * 
	 * In the Main class:
	 * Create a Map called solarSystem <String, HeavenlyBody> as the key is the planet name
	 * Create Set called planets contains the planets
	 * 
	 * Try to add as many as you want planets to the solarSystem and to the planets Set
	 * Try adding duplicate planets
	 * PS: Duplicate planets are ignored in Set 
	 * 
	 * Find a solution to ignore duplicate planets
	 */
	
	// Fields
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {

		// Mercury planet
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Venus planet
		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Earth planet
		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Moon => moon of earth
		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		// Mars planet
		temp = new HeavenlyBody("Mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Deimos => moon of Mars
		tempMoon = new HeavenlyBody("Deimos", 1.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		// Phobos => moon of Mars
		tempMoon = new HeavenlyBody("Phobos", 0.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		// Jupiter planet
		temp = new HeavenlyBody("Jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Io => moon of Jupiter
		tempMoon = new HeavenlyBody("Io", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		// Europa => moon of Jupiter
		tempMoon = new HeavenlyBody("Europa", 3.5);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		// Ganymede => moon of Jupiter
		tempMoon = new HeavenlyBody("Ganymede", 7.1);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		// Callisto => moon of Jupiter
		tempMoon = new HeavenlyBody("Callisto", 16.7);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		// Saturn planet
		temp = new HeavenlyBody("Saturn", 10759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Uranus planet
		temp = new HeavenlyBody("Uranus", 30660);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Neptune planet
		temp = new HeavenlyBody("Neptune", 165);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		// Pluto planet
		temp = new HeavenlyBody("Pluto", 248);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		/**
		 * Add another Pluto planet
		 * Set do not support duplicat
		 * So the second Pluto will be ignored
		 */
		HeavenlyBody pluto = new HeavenlyBody("Pluto", 847);
		planets.add(pluto);

		// Output
		System.out.println("/*--- Planets ---*/");
		for (HeavenlyBody planet : planets) {
			System.out.println(planet.getName());
		}

		System.out.println("/*--- Moon of Venus ---*/");
		HeavenlyBody body = solarSystem.get("Venus");
		if (body.getSatellites().size() > 0) {
			for (HeavenlyBody venusMoon : body.getSatellites()) {
				System.out.println(venusMoon.getName());
			}
		} else {
			System.out.println("No moon for " + body.getName());
		}

		System.out.println("/*--- Moon of Earth ---*/");
		body = solarSystem.get("Earth");
		if (body.getSatellites().size() > 0) {
			for (HeavenlyBody earthMoon : body.getSatellites()) {
				System.out.println(earthMoon.getName());
			}
		} else {
			System.out.println("No moon for " + body.getName());
		}

		System.out.println("/*--- Moons of Mars ---*/");
		body = solarSystem.get("Mars");
		if (body.getSatellites().size() > 0) {
			for (HeavenlyBody marsMoon : body.getSatellites()) {
				System.out.println(marsMoon.getName());
			}
		} else {
			System.out.println("No moon for " + body.getName());
		}

		System.out.println("/*--- Moons of Jupiter ---*/");
		body = solarSystem.get("Jupiter");
		if (body.getSatellites().size() > 0) {
			for (HeavenlyBody jupiterMoon : body.getSatellites()) {
				System.out.println(jupiterMoon.getName());
			}
		} else {
			System.out.println("No moon for " + body.getName());
		}

	}
}
