package com.kamesuta.power.proofvoteban

import com.kamesuta.power.proofvoteban.command.VoteBanCommand
import org.bukkit.plugin.java.JavaPlugin
import dev.kotx.flylib.flyLib

class ProofVoteBan : JavaPlugin() {
    override fun onEnable() {
        flyLib {
            command(VoteBanCommand(this@ProofVoteBan))
        }
    }

    override fun onDisable() {}
}