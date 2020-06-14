package com.company;

import java.util.ArrayList;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 10:23
 * @version: ${VERSION}
 * @modified By:
 */
public abstract class Creature {
	private String id;
	private String description;
	private int HP;
	private Weapen currentWeapen;
	private ArrayList<Weapen> weapens = new ArrayList<>();
	public abstract void useArticle(Weapen weapen,Creature tagetCreature);

	public Creature() {
	}

	public Creature(String id, String description, int HP, Weapen currentWeapen, ArrayList<Weapen> weapens) {
		this.id = id;
		this.description = description;
		this.HP = HP;
		this.currentWeapen = currentWeapen;
		this.weapens = weapens;
	}

	public ArrayList<Weapen> getWeapens() {
		return weapens;
	}

	public void setWeapens(ArrayList<Weapen> weapens) {
		this.weapens = weapens;
	}

	public Weapen getCurrentWeapen() {
		return currentWeapen;
	}

	public void setCurrentWeapen(Weapen currentWeapen) {
		this.currentWeapen = currentWeapen;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
