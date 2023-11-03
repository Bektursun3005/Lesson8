package players;

public abstract class Hero extends GameEntity implements HavingSuperAbility{

    private SuperAbility ability;
    protected Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss, Hero[] hero){
        for (int i = 0; i < hero.length; i++) {
            if (hero[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - this.getDamage());
            }
        }
    }
}
