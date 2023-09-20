
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setWeaponType("COLD");
        weapon.setWeaponName("Ak");
        Boss boss = new Boss(100, 20, weapon);
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss weapon type: " + boss.getWeapon().getWeaponType());
        System.out.println("Boss weapon name: " + boss.getWeapon().getWeaponName());
    }
}
