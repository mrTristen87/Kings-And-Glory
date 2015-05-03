package kingsAndGlory;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class RpRoll extends JavaPlugin {
	  public void onEnable() {
		  getLogger().info("Rp Roll has been enabled.");
	    }
	 
	    public void onDisable() {
	        getLogger().info("Rp Roll has been disabled");
	    }
	
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    	if (cmd.getName().equalsIgnoreCase("roll")) { // If the player typed /basic then do the following...
	    		if (args.length == 1){
	    			sender.sendMessage(Integer.toString(((int)(Math.random()*Integer.parseInt(args[0])))));
	    		}
	    		
	    		
	    		if (args.length == 0){
	    			sender.sendMessage(Integer.toString(((int)(Math.random()*20))));
	    		}
	    			    		// doSomething
	    		return true;
	    	} //If this has happened the function will return true. 
	            // If this hasn't happened the value of false will be returned.
	    	return false; 
	    }
}
