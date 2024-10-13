package structuralpatterns.flyweight.bullet;

public class BulletIntrinsic {

    private final BulletType bulletType;
    private final byte[] bulletImage;

    protected BulletIntrinsic(BulletType bulletType) {
        this.bulletType = bulletType;
        this.bulletImage = getBulletImageForTypeFromDB(bulletType);
        System.out.printf("Creating a new Bullet Intrinsic For Type %s \n",bulletType);
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public byte[] getBulletImage() {
        return bulletImage;
    }

    private byte[] getBulletImageForTypeFromDB(BulletType bulletType){
        // Makes DB call and gets BulletImage
        return new byte[]{};
    }
}
