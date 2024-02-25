package me.skythebuilder.plusplaceholders.Hook;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

public class EconomyHook {

    private static Economy economy;

    public static boolean setupEconomy() {
        if (Bukkit.getPluginManager().isPluginEnabled("Vault")) {
            RegisteredServiceProvider<Economy> rsp = Bukkit.getServicesManager().getRegistration(Economy.class);
            if (rsp != null) {
                economy = rsp.getProvider();
                return economy != null;
            }
        }
        return false;
    }

    public static Economy getEconomy() {
        return economy;
    }
}
