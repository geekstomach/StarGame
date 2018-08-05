package ru.geekbrains.stargame.base.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.stargame.base.ActionListener;
import ru.geekbrains.stargame.base.ScaledTouchUpButton;
import ru.geekbrains.stargame.base.math.Rect;

public class ButtonExit extends ScaledTouchUpButton {

    private static final float HEIGHT = 0.085f;

    public ButtonExit(TextureAtlas atlas, ActionListener actionListener, float pressScale) {
        super(atlas.findRegion("btExit"), actionListener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setRight(worldBounds.getRight());
        setHeightProportion(HEIGHT);
    }
}
