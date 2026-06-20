package com.hyperion;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms.
 */
public class TeaVMBug extends Game {
    @Override
    public void create() {
        new AssetManager().finishLoading();
    }
}
