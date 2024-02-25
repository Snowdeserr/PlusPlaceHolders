package me.skythebuilder.plusplaceholders.Hook;

import me.clip.placeholderapi.PlaceholderAPIPlugin;
import org.bukkit.plugin.Plugin;

public class PlaceholderAPIHook {

    private static PlaceholderAPIPlugin placeholderAPI;

    public static boolean setupPlaceholderAPI(Plugin plugin) {
        if (plugin == null || !(plugin instanceof PlaceholderAPIPlugin)) {
            return false;
        }

        placeholderAPI = (PlaceholderAPIPlugin) plugin;
        return true;
    }

    public static PlaceholderAPIPlugin getPlaceholderAPI() {
        return placeholderAPI;
    }


}
