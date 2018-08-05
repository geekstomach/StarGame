package ru.geekbrains.stargame.base.sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.stargame.base.Sprite;

public class GameLOGO extends Sprite {

    private static final float HEIGHT = 0.4f;
    private static final float BOTTOM_MARGIN = -0.15f;

    public GameLOGO() {
        super(new TextureRegion(new Texture(Gdx.files.internal("textures/logo.png"))));
        setHeightProportion(HEIGHT);
        setBottom(BOTTOM_MARGIN);
    }

}
