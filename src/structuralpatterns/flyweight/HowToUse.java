package structuralpatterns.flyweight;

import structuralpatterns.flyweight.bullet.Bullet;
import structuralpatterns.flyweight.bullet.BulletIntrinsicFactory;
import structuralpatterns.flyweight.bullet.BulletType;

import java.util.Random;

public class HowToUse {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Bullet(new Random().nextDouble(),
                    new Random().nextDouble(),
                    new Random().nextInt(),
                    BulletIntrinsicFactory.getBulletIntrinsic(BulletType.SMALL));
        }
        for(int i=0;i<100;i++){
            new Bullet(new Random().nextDouble(),
                    new Random().nextDouble(),
                    new Random().nextInt(),
                    BulletIntrinsicFactory.getBulletIntrinsic(BulletType.MEDIUM));
        }
        for(int i=0;i<100;i++){
            new Bullet(new Random().nextDouble(),
                    new Random().nextDouble(),
                    new Random().nextInt(),
                    BulletIntrinsicFactory.getBulletIntrinsic(BulletType.LARGE));
        }
    }
}
