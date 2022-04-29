package com.kamesuta.power.proofvoteban;

import dev.kotx.flylib.FlyLib;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProofVoteBan extends JavaPlugin {

    @Override
    public void onEnable() {
        FlyLib.create(this, builder -> {
            builder.command(new VoteBAN());
        });

    }

    @Override
    public void onDisable() {
    }
}
