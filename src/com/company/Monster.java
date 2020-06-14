package com.company;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 10:28
 * @version: ${VERSION}
 * @modified By:
 */
public class Monster extends Creature {
	@Override
	public void useArticle(Weapen weapen, Creature tagetCreature) {
		weapen.useArticle(tagetCreature);
	}
}
