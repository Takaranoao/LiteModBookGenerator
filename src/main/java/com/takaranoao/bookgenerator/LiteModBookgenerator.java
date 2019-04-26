package com.takaranoao.bookgenerator;

import com.mumfrey.liteloader.LiteMod;

import java.io.File;

public class LiteModBookgenerator implements LiteMod {

    /**
     * Default constructor. All LiteMods must have a default constructor. In general you should do very little
     * in the mod constructor EXCEPT for initialising any non-game-interfacing components or performing
     * sanity checking prior to initialisation
     */
    public LiteModBookgenerator() {
    }

    /**
     * getName() should be used to return the display name of your mod and MUST NOT return null
     *
     * @see com.mumfrey.liteloader.LiteMod#getName()
     */
    @Override
    public String getName() {
        return "Bookgenerator";
    }

    /**
     * getVersion() should return the same version string present in the mod metadata, although this is
     * not a strict requirement.
     *
     * @see com.mumfrey.liteloader.LiteMod#getVersion()
     */
    @Override
    public String getVersion() {
        return "1.0-SNAPSHOT";
    }

    /**
     * init() is called very early in the initialisation cycle, before the game is fully initialised, this
     * means that it is important that your mod does not interact with the game in any way at this point.
     *
     * @see com.mumfrey.liteloader.LiteMod#init(File)
     */
    @Override
    public void init(File configPath) {
    }

    /**
     * upgradeSettings is used to notify a mod that its version-specific settings are being migrated
     *
     * @see com.mumfrey.liteloader.LiteMod#upgradeSettings(String, File, File)
     */
    @Override
    public void upgradeSettings(String version, File configPath, File oldConfigPath) {
    }
}