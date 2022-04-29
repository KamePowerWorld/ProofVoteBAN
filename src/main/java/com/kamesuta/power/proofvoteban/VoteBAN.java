package com.kamesuta.power.proofvoteban;


import dev.kotx.flylib.command.Command;
import dev.kotx.flylib.command.CommandContext;

public class VoteBAN extends Command {
    public VoteBAN() {
        super("voteban");
        description("Explode a player.");

        usage(usageBuilder -> {
            usageBuilder.stringArgument("name");
        });
    }

    @Override
    public void execute(CommandContext ctx) {
        ctx.success(ctx.getArgs().toString());
    }
}