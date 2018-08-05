package ru.geekbrains.stargame.base.pools;

import ru.geekbrains.stargame.base.SpritesPool;
import ru.geekbrains.stargame.base.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
