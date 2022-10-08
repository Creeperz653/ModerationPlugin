package xyz.creepernation.moderation;

import me.bluetree242.jdaeventer.objects.EventInformation;
import me.bluetree242.prebot.api.plugin.commands.discord.slash.PluginSlashCommand;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.CommandAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.DefaultMemberPermissions;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class BanCommmand extends PluginSlashCommand {
    public BanCommmand(ModerationPlugin main) {
        //this boolean is for admin command, if it is true only admins can execute it and the command will be registered only in admin guilds as well
        super(
                main,
                Commands.slash("ban", "Bans a member from the server").setDefaultPermissions(DefaultMemberPermissions.enabledFor(Permission.BAN_MEMBERS)
                        //this boolean is for admin command, if it is true only admins can execute it and the command will be registered only in admin guilds as well
        ), false);
    }



    @Override
    public void onCommand(SlashCommandInteractionEvent event, EventInformation info) {
        event.reply("Ban command is working").setEphemeral(true).queue();

    }
    //this is optional, to auto complete this command
    @Override
    public void onAutoComplete(CommandAutoCompleteInteractionEvent event, EventInformation info) {

    }
}