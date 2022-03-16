package antidrop.tht.events;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Disable implements CommandExecutor {
    public Disable() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        if (disableList.hasPlayerName(((Player)sender).getPlayer().getName())) {
            disableList.removePlayerName(((Player)sender).getPlayer().getName());
            player.sendMessage(ChatColor.GREEN + "已启用防手滑");
        } else {
            disableList.addPlayerName(((Player)sender).getPlayer().getName());
            player.sendMessage(ChatColor.RED + "已禁用防手滑");
        }

        return false;
    }
}

