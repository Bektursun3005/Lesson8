package players;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.CHANCE_OF_REVIVAL, name);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(heroes[8].getHealth());
                heroes[8].setHealth(0);
                System.out.println("Witcher use ability");
            }
        }
    }

}

