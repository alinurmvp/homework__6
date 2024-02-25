public class Skeleton extends Boss {
    private int arrownumber;

    public int getArrownumber() {
        return arrownumber;
    }

    public void setArrownumber(int arrownumber) {
        this.arrownumber = arrownumber;

    }

    @Override
    public String printInfo() {
        return "Skeleton Info: Health=" + getHealth() + ", Damage =" + getDamage() +
                " ArrowCount=" + arrownumber;
    }
}
