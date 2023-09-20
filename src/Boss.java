public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {

        setHealth(health);

        setDamage(damage);

        this.weapon = weapon;

    }

    public Weapon getWeapon() {

        return weapon;

    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;
    }
}

