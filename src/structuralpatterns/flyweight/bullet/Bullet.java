package structuralpatterns.flyweight.bullet;

public class Bullet {
    private double x;
    private double y;
    private int speed;
    private final BulletIntrinsic bulletIntrinsic;

    public Bullet(double x, double y, int speed, BulletIntrinsic bulletIntrinsic) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.bulletIntrinsic = bulletIntrinsic;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public BulletIntrinsic getBulletIntrinsic() {
        return bulletIntrinsic;
    }
}
