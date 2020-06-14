package com.company;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 10:41
 * @version: ${VERSION}
 * @modified By:
 */
public class Dagger extends Weapen {
	public Dagger(String id, String description, int damagePoints) {
		super(id, description, damagePoints);
	}

	@Override
	public void useArticle(Creature enemyCreature) {
		 enemyCreature.setHP(enemyCreature.getHP()+this.getDamagePoints());

	}
}
