package com.kamesuta.power.proofvoteban.command

import com.kamesuta.power.proofvoteban.ProofVoteBan
import dev.kotx.flylib.command.Command


class VoteBanCommand (val plugin: ProofVoteBan) : Command("voteban") {

    init {
        description("VoteBan command")

        usage()
        {
            executes {
                success("テスト")
            }
        }
    }
}