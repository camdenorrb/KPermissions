package me.camdenorrb.kpermissions.listeners

import me.camdenorrb.kpermissions.KPermissions
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent

/**
 * Created by camdenorrb on 12/18/16.
 */
class PlayerListener(val kPerms: KPermissions) {

	@EventHandler
	fun onJoin(event: PlayerJoinEvent) {
		event.player.addAttachment(kPerms)
	}

}