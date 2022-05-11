package com.kamesuta.power.proofvoteban

import dev.kotx.flylib.command.Command
import org.bukkit.Bukkit


class VoteBanCommand (val plugin: ProofVoteBan) : Command("voteban") {

    init {
        description("VoteBan command")
        children(
            VoteStartCommand(plugin),
        )
        usage()
        {
            executes {
                success("テスト")
            }
        }
    }
}