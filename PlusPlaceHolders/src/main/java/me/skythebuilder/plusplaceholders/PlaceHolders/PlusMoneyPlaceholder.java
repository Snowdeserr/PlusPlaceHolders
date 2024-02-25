package me.skythebuilder.plusplaceholders.PlaceHolders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.skythebuilder.plusplaceholders.Hook.EconomyHook;
import org.bukkit.OfflinePlayer;

public class PlusMoneyPlaceholder extends PlaceholderExpansion {



    @Override
    public String getIdentifier() {
        return "plus_money";
    }

    @Override
    public String getAuthor() {
        return "Snowdesert";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String identifier) {
        if (player == null) {
            return "";
        }


        if (identifier.equals("plus_money")) {
            double balance = EconomyHook.getEconomy().getBalance(player);

            if (balance >= 1.0E12) {
                return String.format("%.2fT", balance / 1.0E12);
            } else if (balance >= 1.0E9) {
                return String.format("%.2fB", balance / 1.0E9);
            } else if (balance >= 1000000.0) {
                return String.format("%.2fM", balance / 1000000.0);
            } else {
                return balance >= 1000.0 ? String.format("%.2fK", balance / 1000.0) : String.format("%.2f", balance);
            }
        }

        return null;
    }
}
