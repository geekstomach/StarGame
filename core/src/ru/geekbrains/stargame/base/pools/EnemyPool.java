package ru.geekbrains.stargame.base.pools;

import com.badlogic.gdx.audio.Sound;

import ru.geekbrains.stargame.base.SpritesPool;
import ru.geekbrains.stargame.base.math.Rect;
import ru.geekbrains.stargame.base.sprite.Enemy;
import ru.geekbrains.stargame.base.sprite.MainShip;


public class EnemyPool extends SpritesPool<Enemy> {

    private BulletPool bulletPool;
    private ru.geekbrains.stargame.base.pools.ExplosionPool explosionPool;
    private Rect worldBounds;
    private MainShip mainShip;
    private Sound sound;

    public EnemyPool(BulletPool bulletPool, Rect worldBounds, ru.geekbrains.stargame.base.pools.ExplosionPool explosionPool, MainShip mainShip, Sound sound) {
        this.bulletPool = bulletPool;
        this.worldBounds = worldBounds;
        this.explosionPool = explosionPool;
        this.mainShip = mainShip;
        this.sound = sound;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, worldBounds, explosionPool, mainShip, sound);
    }
}
