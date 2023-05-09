package com.Collections.ArrayList;

import java.util.LinkedList;

class Menu {
	int menuId;
	String menuName;
	int menuPrice;
	String menuCatagory;

	public Menu(int menuId, String menuName, int menuPrice, String menuCatagory) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuCatagory = menuCatagory;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuPrice=" + menuPrice + ", menuCatagory="
				+ menuCatagory + "]";
	}

}

public class MenuMain {

	public static void main(String[] args) {

		LinkedList<Menu> list = new LinkedList<>();

		list.add(new Menu(1, "Idli - Sambar", 250, "South Indian"));
		list.add(new Menu(2, "Dosa", 160, "South Indian"));
		list.add(new Menu(3, "Khaman Dhokla", 220, "Gujrat"));
		list.add(new Menu(4, "Puran Poli", 300, "Maharastrian"));
		list.add(new Menu(5, "Mysore Pak", 200, "Karnataka"));

		for (Menu m : list) {
			System.out.println(m);
		}
	}
}
