package players;

import general.RPG_game;

import java.util.Random;

public class Thor extends Hero{

    public Thor (int health, int damage, String name) {
        super(health, damage, SuperAbility.THORS_HAMMER, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int n = RPG_game.random.nextInt(10,60);
        if (n <= 20) {
            boss.setDamage(0);
            System.out.println("Thor use ability");
        } else {
            boss.setDamage(50);
        }
    }
}

