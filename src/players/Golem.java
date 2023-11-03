package players;

public class Golem extends Hero{
    public Golem (int health, int damage, String name) {
        super(health, damage, SuperAbility.IMPACT_ON_THE_EARTH_FIELD, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        heroes[5].setDamage(heroes[5].getDamage() + (boss.getDamage() / 2));
        System.out.println("Golem use ability");
    }
}
