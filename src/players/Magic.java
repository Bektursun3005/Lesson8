package players;

import general.RPG_game;

import java.util.Random;

public class Magic extends Hero{
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        RPG_game.random.nextInt();

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() );
        }
        System.out.println("Magic use ability");
    }
}