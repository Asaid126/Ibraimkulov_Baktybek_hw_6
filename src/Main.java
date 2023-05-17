public class Main {
    public static void main(String[] args) {
      Boss boss=new Boss();
     boss.setHealth(500);
     boss.setDamage(50);
     Weapon weapon=new Weapon();
     weapon.setWeaponName("sword");
     weapon.setWeaponType(WeaponType.cutting);
     boss.setWeapon(weapon);
        System.out.println(boss.info());
    }
}