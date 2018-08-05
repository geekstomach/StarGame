package ru.geekbrains.stargame.base.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.stargame.base.Sprite;

public class HealthBar extends Sprite {

    private static final float HEIGHT = 0.038f;
    TextureAtlas atlas;

    public HealthBar(TextureAtlas atlas) {
        super(atlas.findRegion("7"));
        this.atlas = atlas;
        setHeightProportion(HEIGHT);
        pos.y = 0.45f;//придумать как написать более правильно
        pos.x = 0.295f;
    }

    public void drawHP(float hp){
        //Пытался кейсом написать , не понял как
       if (hp==(MainShip.START_HP))this.regions[0] = atlas.findRegion("7");
       else if (hp>=(5*MainShip.START_HP/6)) this.regions[0] = atlas.findRegion("6");
       else if (hp>=(4*MainShip.START_HP/6)) this.regions[0] = atlas.findRegion("5");
       else if (hp>=(3*MainShip.START_HP/6)) this.regions[0] = atlas.findRegion("4");
       else if (hp>=(2*MainShip.START_HP/6)) this.regions[0] = atlas.findRegion("3");
       else if (hp>=(MainShip.START_HP/6)) this.regions[0] = atlas.findRegion("2");
       else if (hp==0) this.regions[0] = atlas.findRegion("1");

    }


}
