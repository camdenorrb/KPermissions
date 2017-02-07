package me.camdenorrb.kpermissions.events

import me.camdenorrb.kpermissions.rank.Rank
import org.bukkit.entity.Player

/**
 * Created by camdenorrb on 12/18/16.
 */

class RankUpdateEvent(val player: Player, val fromRank: Rank, val toRank: Rank) {


}