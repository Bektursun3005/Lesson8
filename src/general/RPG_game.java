package general;

import players.*;

import java.util.Random;

public class RPG_game {

    public static Random random = new Random();

    private static int roundNumber;
    public static void startGame(){
        Boss boss = new Boss(2000, 100,"Boss");
        Warrior warrior = new Warrior(290, 10, "Warrior");
        Medic doc = new Medic(250,0,15,"Doctor");
        Magic magic = new Magic(280,20,"Magis");
        Berserk berserk = new Berserk(260, 10,"Berserk");
        Medic assistant = new Medic(300, 0, 5,"Medic");
        Golem golem = new Golem (200, 5,"Golem");
        Thor thor = new Thor(250,10, "Thor");
        Tank tank = new Tank(350, 5,"Tank");
        Witcher witcher = new Witcher(280, 0, "Witcher");
        Hero[] heroes = {warrior, doc, magic, berserk, assistant, golem, thor,tank, witcher};

//        showStatistics(boss, heroes);
        play(boss, heroes);
//        isGameOver(boss, heroes);
    }

    private static void showStatistics(Boss boss, Hero[] heroes){
        System.out.println("ROUND "+roundNumber+" -----------------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    public static void play(Boss boss, Hero[] hero) {
        while (!isGameOver(boss, hero)){
            showStatistics(boss, hero);
            boss.attack(hero);
            for (int i = 0; i < hero.length; i++) {
                hero[i].getAbility();
                hero[i].attack(boss, hero);
                hero[i].applySuperAbility(boss, hero);
            }
            boss.getDefence();
            boss.chooseDefence();
            roundNumber++;
        }
    }

    public static boolean isGameOver(Boss boss, Hero[] heroes){
        if (boss.getHealth() <= 0){
            System.out.println("Heroes won!!!");
            return true;
        }

        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                allHeroesDead = false;
                break;
            }
        }

        if (allHeroesDead){
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}
