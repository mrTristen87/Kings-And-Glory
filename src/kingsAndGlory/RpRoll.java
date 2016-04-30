package kingsAndGlory;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;




	/*
			Kings and Glory custom Roll plugin (c) 2016
			Current version 0.4
			30 April 2016 12:50 PM PST
	
			
			
	    		FORMAT:
	    		/roll [limit] <modifier>
	    		
	    		EXAMPLE:
	    		
	    		/roll 10 +5
	    		
	    		
	    		color sample: 	&amrTristen87 &erolled a &a20 out of 20

	    		
	    	*/

public final class RpRoll extends JavaPlugin {
	  public void onEnable() {
		  getLogger().info("Rp Roll has been enabled.");
	    }
	 
	    public void onDisable() {
	        getLogger().info("Rp Roll has been disabled");
	    }
	    
	    public String[2] roll(int limit, String ogModifier){
	    	
	    			int ogRolled = (int)(Math.random()*limit); 	//orignal rolled value
	    			int modifier = 0; 						//original modifier is 0
	    			int finalRolled;

	    			if (modifier != null){						//check for a modifier
	    				String cleanedmod = "";
	    				if (ogModifier.contains('+')){
	    					cleanedmod = ogModifier.replace('+',''); 		//take plus sign out of value so number can be isolated
	    					modifier = Integer.parseInt(cleanedmod);
	    				}
	    				if (args[2].contains('-')){
	    					cleanedmod = ogModifier.replace('-','');
	    					modifier = -1*Integer.parseInt(cleandedmod);
	    				}
	    			
	    				
	    			}
	    			finalRolled = ogRolled + modifier;
	    			
	    			
	    			return [finalRolled,modifier]; //final rolled is set out of a
	    	
	    }
	
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    
	    	
	    	if (cmd.getName().equalsIgnoreCase("roll")) {//if command is typed. 
	    		String[] result;
	    		if (args.length = 0){
	    			result = roll(20, null);
	    			sender.sendMessage(sender.getName() + "rolled a" + result[0] " out of 20");
	    		
	    		}
	    		
	    		if (args.length == 1)
	    			result = roll(Integer.parseInt(args[0], null);
	    			sender.sendMessage(sender.getName() + "rolled a" + result[0] + " out of " + args[0]);
	    		
	    		
	    		if (args.length == 2){
	    			result = roll(Integer.parseInt(args[0], args[1]);
	    			sender.sendMessage(sender.getName() + "rolled a" + result[0] + " out of " + args[0] + " with a modifier of " + args[1]);
	    		}
	    			    		// doSomething
	    		return true;
	    	} //If this has happened the function will return true. 
	            // If this hasn't happened the value of false will be returned.
	    	return false; 
	    }
}
