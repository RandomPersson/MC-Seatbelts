package pl.org.mensa.rp.mc.Seatbelts;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

public class VehicleExitListener implements Listener {
	
	@EventHandler
	public void onVehicleExit(VehicleExitEvent e) {
		if (e.getExited() instanceof Player && e.getVehicle().getType() == EntityType.MINECART && !e.getExited().hasPermission("seatbelts.exempt") && e.getExited().getLocation().getWorld().getName().equalsIgnoreCase("fairground")) {
			e.setCancelled(true);
		}
	}
}
