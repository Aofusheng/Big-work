package com.company;

import java.util.ArrayList;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 11:05
 * @version: ${VERSION}
 * @modified By:
 */
public class MonsterWolf  {

	private ArrayList<Monster> monsters = new ArrayList<>();

	public Monster get(String id){
		Monster monster = null;
		for (Monster item:monsters){
			if (true == id.equals(item.getId())){
				monster = item;
				break;
			}
		}
		return monster;
	}
	public MonsterWolf(){

	}

	public MonsterWolf(ArrayList<Monster> monsters) {
		this.monsters = monsters;
	}

	public ArrayList<Monster> getMonsters() {
		return monsters;
	}

	public void setMonsters(ArrayList<Monster> monsters) {
		this.monsters = monsters;
	}
}
