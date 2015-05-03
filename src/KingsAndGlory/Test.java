package KingsAndGlory;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin{

	public void onEnable() {
		getLogger().info("Roll on!");
	}
 
	@Override
	public void onDisable() {
		getLogger().info("Roll off!");
	}
	
}
