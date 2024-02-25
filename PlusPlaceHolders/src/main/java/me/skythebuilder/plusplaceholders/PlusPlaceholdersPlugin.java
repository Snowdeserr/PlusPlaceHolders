package me.skythebuilder.plusplaceholders;

import me.skythebuilder.plusplaceholders.Hook.EconomyHook;
import me.skythebuilder.plusplaceholders.PlaceHolders.PlusMoneyPlaceholder;
import org.bukkit.plugin.java.JavaPlugin;

public class PlusPlaceholdersPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        if (EconomyHook.setupEconomy()) {
            new PlusMoneyPlaceholder().register();
            getLogger().info("Vault Economy wurde erfolgreich geladen.");
            getLogger().info("Placeholder-Plugins wurden erfolgreich registriert.");
        } else {
            getLogger().warning("Vault nicht gefunden oder Economy nicht verfügbar! Das Plugin wird deaktiviert.");
            getServer().getPluginManager().disablePlugin(this);
        }
    }


}
