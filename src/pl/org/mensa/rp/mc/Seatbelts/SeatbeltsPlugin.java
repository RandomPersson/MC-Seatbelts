package pl.org.mensa.rp.mc.Seatbelts;

import org.bukkit.plugin.java.JavaPlugin;

public class SeatbeltsPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new VehicleExitListener(), this);
	}
}
