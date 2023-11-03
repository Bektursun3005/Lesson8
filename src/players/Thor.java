package players;

import java.util.Random;

public class Thor extends Hero{
    private int stanksImpact;
    public Thor (int health, int damage, String name) {
        super(health, damage, SuperAbility.THORS_HAMMER, name);
        this.stanksImpact = stanksImpact;

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int n = random.nextInt(10, 50);
        if (n <= 20) {
            boss.setDamage(0);
            System.out.println("Thor use ability");
        } else {
            boss.setDamage(50);
        }
    }
}

