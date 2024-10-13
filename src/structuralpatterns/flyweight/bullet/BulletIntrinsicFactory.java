package structuralpatterns.flyweight.bullet;

import java.util.HashMap;
import java.util.Map;

public class BulletIntrinsicFactory {

    private static final Map<BulletType,BulletIntrinsic> bulletTypeBulletIntrinsicMap = new HashMap<>();

    private BulletIntrinsicFactory(){}

    public static BulletIntrinsic getBulletIntrinsic(BulletType bulletType){
        if(!bulletTypeBulletIntrinsicMap.containsKey(bulletType)){
            bulletTypeBulletIntrinsicMap.put(bulletType,new BulletIntrinsic(bulletType));
        }
        return bulletTypeBulletIntrinsicMap.get(bulletType);
    }
}
