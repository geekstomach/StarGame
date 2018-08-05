package ru.geekbrains.stargame.base.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.stargame.base.ActionListener;
import ru.geekbrains.stargame.base.ScaledTouchUpButton;
import ru.geekbrains.stargame.base.math.Rect;

public class ButtonPlay extends ScaledTouchUpButton {
    private static final float HEIGHT = 0.1f;

    public ButtonPlay(TextureAtlas atlas, ActionListener actionListener, float pressScale) {
        super(atlas.findRegion("btPlay"), actionListener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setLeft(worldBounds.getLeft());
        setHeightProportion(HEIGHT);
    }
}
