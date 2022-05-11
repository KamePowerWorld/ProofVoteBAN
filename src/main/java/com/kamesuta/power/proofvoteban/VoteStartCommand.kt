package com.kamesuta.power.proofvoteban

import dev.kotx.flylib.command.Command
import dev.kotx.flylib.command.Permission
import dev.kotx.flylib.command.arguments.StringArgument
import org.bukkit.Bukkit
import java.net.MalformedURLException
import java.net.URL
class VoteStartCommand (plugin: ProofVoteBan) : Command("start") {

    init {
        description("VoteBan Start Command")
        permission(Permission.OP)
        usage {
            stringArgument("Player ID", StringArgument.Type.PHRASE)

            executes {

                val player = this.typedArgs[0] as String
                val sender = this.sender

                Bukkit.dispatchCommand(sender, "ban $player")
                success("テスト")
            }
        }
    }
}