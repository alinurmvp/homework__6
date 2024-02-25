public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon() ;
        bossWeapon.setName("Sniper");
        bossWeapon.setType(WeaponType.AWM);

        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(100);
        boss.setWeapon(bossWeapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(400);
        skeleton1.setDamage(50);
        skeleton1.setArrownumber(10);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(600);
        skeleton2.setDamage(70);
        skeleton2.setArrownumber(15);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}