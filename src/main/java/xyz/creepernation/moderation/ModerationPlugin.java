package xyz.creepernation.moderation;

import me.bluetree242.prebot.core.plugin.JarPlugin;
import net.dv8tion.jda.api.JDA;

public class ModerationPlugin extends JarPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Loading Moderation");
        registerCommands(new BanCommmand(this));

    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling Moderation");

    }

    @Override
    public void onShardReady(JDA shard) {

    }

    @Override
    public void onShardReconnect(JDA shard) {

    }
}