package com.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Train {

	int id;
	String name;
	int noOfSeats;

	public Train(int id, String name, int noOfSeats) {
		this.id = id;
		this.name = name;
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", noOfSeats=" + noOfSeats + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, noOfSeats);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Train other = (Train) obj;
//		return id == other.id && Objects.equals(name, other.name) && noOfSeats == other.noOfSeats;
//	}

	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object o1) {
		Train t = (Train) o1;
		if (this.id == t.id && this.name == t.name && this.noOfSeats == t.noOfSeats) {
			return true;
		} else {
			return false;
		}
	}

}

public class TrainMain {

	public static void main(String[] args) {

		HashMap<Train, Integer> hm = new HashMap<>();

		hm.put(new Train(101, "RajDhani Express", 2050), 6500);
		hm.put(new Train(102, "Chennei Express", 4025), 8046);
		hm.put(new Train(103, "Maharashtra Express", 1020), 7600);
		hm.put(new Train(103, "Maharashtra Express", 1020), 9500);

		for (Map.Entry<Train, Integer> m : hm.entrySet()) {
			System.out.println(m);
		}
	}
}
