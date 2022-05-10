package com.kamesuta.power.proofvoteban

import dev.kotx.flylib.flyLib
import org.bukkit.plugin.java.JavaPlugin

class ProofVoteBan : JavaPlugin() {

    override fun onEnable() {
        flyLib {
            command(VoteBanCommand(this@ProofVoteBan))
        }
    }

    override fun onDisable() {}
}