package com.company;

import java.util.Scanner;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 11:01
 * @version: ${VERSION}
 * @modified By:
 */
public class Sense {


	private Room currentRoom;

	public Sense(){
		createRooms();
	}

	private void createRooms(){
		Room outside, lobby, pub, study, bedroom;

		outside = new Room("城堡外");
		lobby = new Room("大堂");
		pub = new Room("小酒吧");
		study = new Room("书房");
		bedroom = new Room("卧室");

		//初始化房间出口
		outside.setExits(null, lobby, study, pub);
		lobby.setExits(null, null ,null, outside);
		pub.setExits(null, outside, null, null);
		study.setExits(outside, bedroom, null, null);
		bedroom.setExits(null, null,null, study);

		currentRoom = outside;
	}

	public void printWelcome(){
		System.out.println();
		System.out.println("欢迎来到城堡！");
		System.out.println("这是一个砍怪游戏");
		System.out.println("如果需要帮助，请输入'help'。");
		System.out.println();
		System.out.println("现在你在"+currentRoom);
		if (currentRoom.northExit !=null)
			System.out.print("north ");
		if (currentRoom.eastExit != null)
			System.out.print("east ");
		if (currentRoom.southExit != null)
			System.out.print("south ");
		if (currentRoom.westExit != null)
			System.out.print("west ");
		System.out.println();
	}

	//下为用户命令

	public void printHelp(){
		System.out.print("迷路了吗？你可以做的命令有：go bye help");
		System.out.println("如\t go east");
	}

	public void goRoom(String direction){
		Room nextRoom = null;
		if(direction.equals("north")){
			nextRoom = currentRoom.northExit;
		}
		if (direction.equals("east")){
			nextRoom = currentRoom.eastExit;
		}
		if (direction.equals("west")){
			nextRoom = currentRoom.westExit;
		}
		if (direction.equals("south")){
			nextRoom = currentRoom.southExit;
		}
		if (nextRoom == null){
			System.out.println("那里没有门");
		}
		else {
			currentRoom = nextRoom;
			System.out.println("你在"+ currentRoom);
			System.out.println("出口有：");
			if (currentRoom.northExit != null)
				System.out.print("north ");
			if (currentRoom.eastExit != null)
				System.out.print("east ");
			if (currentRoom.southExit != null)
				System.out.print("south ");
			if (currentRoom.westExit != null)
				System.out.print("west ");
			System.out.println();

		}
	}

		 Person person = new Person();
		 Monster wolf1 = new Monster();
		 Monster wolf2 = new Monster();
		 Monster wolf3 = new Monster();
		 MonsterWolf monsterWolf = new MonsterWolf();
		Ui ui = new Ui();
		public void initSense(){
			initPerson();
			initMonster();
		}

		public void initPerson() {
			person.setId("123");
			person.setDescription("吕小布");
			person.setHP(300);
			person.setCurrentWeapen(new Sword("pw1", "倚天剑", -20));
		}
		public void initMonster(){
			wolf1.setId("wolf1");
			wolf1.setDescription("灰太狼");
			wolf1.setHP(100);
			wolf1.setCurrentWeapen(new Knife("mw1","屠龙刀1",-30));

			wolf2.setId("wolf2");
			wolf2.setDescription("白眼狼");
			wolf2.setHP(100);
			wolf2.setCurrentWeapen(new Knife("mw2","屠龙刀2",-25));

			wolf3.setId("wolf3");
			wolf3.setDescription("红太狼");
			wolf3.setHP(100);
			wolf3.setCurrentWeapen(new Knife("mw3","屠龙刀3",-20));

			monsterWolf.getMonsters().add(wolf1);
			monsterWolf.getMonsters().add(wolf2);
			monsterWolf.getMonsters().add(wolf3);
		}

		public boolean judge(){
			boolean personWin = true;
			if (this.getPerson().getHP()<=0){
				personWin = false;

			}return false;
		}

		public void play(){
 			ui.displayStaus(this);
//			ui.Helps();

			Scanner in = new Scanner(System.in);
			while (true){
				String command = in.nextLine();
				String[] commandItems = command.split(" ");

				if (commandItems[0].equals("bye")){
					ui.displayBye();
					System.exit(0);
				}
				else if (commandItems[0].equals("help")){
					ui.Helps();
				}
				else if (commandItems[0].equals("go")){
					goRoom(commandItems[1]);
					for (Monster item:this.getMonsterWolf().getMonsters()){
						if (1 == Utils.randomChop(0,2)){
							item.useArticle(item.getCurrentWeapen(),this.getPerson());
							ui.damage(item,this.getPerson());
						}
						else{

						}
					}
				}
				else if (commandItems[0].equals("chop")) {
//					this.getPerson().useArticle(getPerson().getCurrentWeapen(),this.getMonsterWolf().getMonsters().);
					this.getPerson().useArticle(this.getPerson().getCurrentWeapen(),
							this.getMonsterWolf().get(commandItems[1]));
					ui.damage(this.getPerson(),this.getMonsterWolf().get(commandItems[1]));
					for (Monster item:this.getMonsterWolf().getMonsters()){
						if (1 == Utils.randomChop(0,2)){
							item.useArticle(item.getCurrentWeapen(),this.getPerson());
							ui.damage(item,this.getPerson());
						}
						else{

						}
					}
				}
				else{
						ui.disError();
				}
//				for (Monster item:this.getMonsterWolf().getMonsters()){
//					if (1 == Utils.randomChop(0,2)){
//						item.useArticle(item.getCurrentWeapen(),this.getPerson());
//						ui.damage(item,this.getPerson());
//					}
//					else{
//
//					}
//				}


				ui.displayStaus(this);

				int i;
				int k,l,m;
				i = this.getPerson().getHP();
				k = wolf1.getHP();
				l = wolf2.getHP();
				m = wolf3.getHP();
				if (i<=0){
					ui.defeat();
					break;
				}
				if (k<=0){
					Knife k1 = new Knife("nw1","屠龙刀1",0);
					wolf1.setCurrentWeapen(k1);
//					Knife k2 = new Knife("pw1","倚天剑1",0);
//					person.setCurrentWeapen(k1);
					System.out.println("灰太狼死亡  ");
				}

				if (l<=0){
					Knife l1 = new Knife("nw2","屠龙刀2",0);
					wolf2.setCurrentWeapen(l1);
//					Knife l2 = new Knife("pw2","倚天剑2",0);
//					person.setCurrentWeapen(l1);
					System.out.println("白眼狼死亡  ");
				}

				if (m<=0){
					Knife m1 = new Knife("nw3","屠龙刀3",0);
					wolf3.setCurrentWeapen(m1);
//					Knife m2 = new Knife("pw3","倚天剑3",0);
//					person.setCurrentWeapen(m1);
					System.out.println("红太狼死亡  ");
				}


				if(k <= 0 && l<=0 && m<=0){

					System.out.println("游戏结束，您胜利了！");
					break;
				}
			}
		}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public MonsterWolf getMonsterWolf() {
		return monsterWolf;
	}

	public void setMonsterWolf(MonsterWolf monsterWolf) {
		this.monsterWolf = monsterWolf;
	}

}
