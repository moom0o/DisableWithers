package me.moomoo.disablewithers;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.entity.ProjectileLaunchEvent;
public class main extends JavaPlugin implements Listener {
    public void onEnable() {
        System.out.println("[ENABLED] moomoo's disablewithers plugin, originally made for 1b1t.tk");
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }
    public void onDisable() {
        System.out.println("[DISABLED] moomoo's disablewithers plugin, originally made for 1b1t.tk. Goodnight.");
    }
    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent evt) {
        String entity = evt.getEntity().toString(); // The entity
        if(entity.equals("CraftWitherSkull")){
            evt.setCancelled(true);
        }
    }
}
