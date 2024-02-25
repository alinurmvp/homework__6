public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo() {
        return "Boss Info: Health=" + getHealth() + ", Damage=" + getDamage() + ", Weapon=" +
                weapon.getName() + ", WeaponType=" + weapon.getType();
    }
}


