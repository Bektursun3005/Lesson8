package general;

import players.*;

import java.util.Random;

public class RPG_game {

    public static Random random = new Random();

    private static int roundNumber;
    public static void startGame(){
        Boss boss = new Boss(1000, 50,"AKA-Boss");
        Warrior warrior = new Warrior(290, 10, "Palych");
        Medic doc = new Medic(250,5,15,"Vrach");
        Magic magic = new Magic(280,20,"Bakshy");
        Berserk berserk = new Berserk(260, 10,"Alkash");
        Medic assistant = new Medic(300, 5, 5,"Medsestra");
        Golem golem = new Golem (200, 8," Vulkan" );
        Hero[] heroes = {warrior, doc, magic, berserk, assistant, golem};
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
                hero[i].attack(boss);
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
