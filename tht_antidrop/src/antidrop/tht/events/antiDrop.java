package antidrop.tht.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class antiDrop implements Listener {
    public antiDrop() {
    }

    @EventHandler
    public void Drop(PlayerDropItemEvent event) throws InterruptedException {
        int i = 0;
        Player player = event.getPlayer();
        if (event.getItemDrop().getItemStack().getType() == Material.DIAMOND_SWORD | event.getItemDrop().getItemStack().getType() == Material.NETHERITE_SWORD | event.getItemDrop().getItemStack().getType() == Material.NETHERITE_AXE) {
            if (disableList.hasPlayerName(event.getPlayer().getName())) {
                player.sendMessage(ChatColor.GRAY + "您已关闭防手滑功能 输入/togglead打开");
                player.sendMessage(i + "");
            } else {
                event.setCancelled(true);
                player.sendMessage(ChatColor.RED + "[防手滑]" + ChatColor.GREEN + "已阻止丢弃该物品");
                player.sendMessage(ChatColor.GRAY + "输入/togglead关闭");
            }
        }

    }
}