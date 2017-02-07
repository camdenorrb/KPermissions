package me.camdenorrb.kpermissions.account

import me.camdenorrb.kpermissions.rank.Rank
import org.bukkit.entity.Player
import org.bukkit.permissions.PermissionAttachment

/**
 * Created by camdenorrb on 2/7/17.
 */

data class Account(val player: Player, var rank: Rank, val permsAttachment: PermissionAttachment)