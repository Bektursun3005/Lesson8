package players;

import general.RPG_game;

import java.util.Random;

public class Magic extends Hero{
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int n = RPG_game.random.nextInt(0,10);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getDamage() != 0) {
                heroes[i].setDamage(heroes[i].getDamage() + n);
            }
        }
        System.out.println("Magic use ability");
    }
}