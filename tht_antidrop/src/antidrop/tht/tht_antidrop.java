package antidrop.tht;

import org.bukkit.plugin.java.JavaPlugin;
import antidrop.tht.events.antiDrop;
import antidrop.tht.events.Disable;

public class tht_antidrop extends JavaPlugin{
    @Override
    public void onEnable(){
        System.out.println("[AntiDrop]插件已安装");
        System.out.println("[AntiDrop]版本1.0");
            this.getServer().getPluginManager().registerEvents(new antiDrop(), this);
            this.getCommand("togglead").setExecutor(new Disable());
    }
    @Override
    public  void onDisable(){
        System.out.println("[AntiDrop]插件已卸载");
    }
}

