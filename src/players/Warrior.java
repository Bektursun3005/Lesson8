package players;

import java.util.Random;

public class Warrior extends Hero{


    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int n = random.nextInt(2, 4);
        heroes[0].setDamage(heroes[0].getDamage() * n);
    }
}

