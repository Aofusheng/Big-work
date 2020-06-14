package com.company;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 13:11
 * @version: ${VERSION}
 * @modified By:
 */
public class Ui {

	public void displayStaus(Sense sense){

		System.out.println("------------------------------------");
		System.out.println(sense.getPerson().getDescription()+":"+sense.getPerson().getHP());

		for (Monster item:sense.getMonsterWolf().getMonsters()){
			System.out.println(item.getId()+"("+item.getDescription()+")"+":"+item.getHP());

		}
		System.out.println("====================================");
		System.out.println("4 conmand:go chop bye help");
	}

	public void Helps(){
		System.out.println("现在有三只狼尾随与你，你要想办法杀死他们，但每一个场景只能攻击一次，而狼随机发起攻击\n输入chop并选择攻击目标进行砍怪\n输入bye：游戏结束\n输入go并选择方向进入不同场景\n" +
				"当三只狼死完，获得胜利\n");
	}

	public void displayBye(){
		System.out.println("拜拜！");
	}
	public void disError(){
		System.out.println("输入非法");
	}

	public void defeat(){
		System.out.println("砍怪失败，游戏结束");
	}

	public void damage(Creature attackCreature,Creature tagetCreature){
		System.out.println(attackCreature.getDescription()+"对"+tagetCreature.getDescription()+
		"造成"+attackCreature.getCurrentWeapen().getDamagePoints()+"伤害。");

	}
}
