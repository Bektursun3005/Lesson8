package players;

import java.util.Random;

public class Magic extends Hero{
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int n = random.nextInt(10, 20);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + n);
        }
    }
}