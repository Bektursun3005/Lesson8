package players;

public class Tank extends Hero {


    public Tank(int health, int damage, String name) {
        super(health, damage, SuperAbility.HEALTH_MULTIPLIER, name);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int damage = boss.getDamage() / 5;
        boss.setDamage(boss.getDamage() - damage);
        heroes[7].setHealth(heroes[7].getHealth() - (boss.getDamage() + (damage * 7)));
        System.out.println("Tank is tanking");
    }
}