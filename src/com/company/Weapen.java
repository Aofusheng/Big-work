package com.company;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 10:26
 * @version: ${VERSION}
 * @modified By:
 */
public abstract class Weapen {
	private String id;
	private String description;
	private int damagePoints;

	public abstract void useArticle(Creature enemyCreature);

	public Weapen() {
	}

	public Weapen(String id, String description, int damagePoints) {
		this.id = id;
		this.description = description;
		this.damagePoints = damagePoints;
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

	public int getDamagePoints() {
		return damagePoints;
	}

	public void setDamagePoints(int damagePoints) {
		this.damagePoints = damagePoints;
	}
}
