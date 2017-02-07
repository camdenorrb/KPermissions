package me.camdenorrb.kpermissions

import org.bukkit.plugin.java.JavaPlugin
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
 * Created by camdenorrb on 12/18/16.
 */
class KPermissions : JavaPlugin() {

    override fun onLoad() { instance = this }

    override fun onEnable() {}

    override fun onDisable() {
        executor.shutdown()
    }


    companion object {

        lateinit var instance: KPermissions

        val executor: ExecutorService = Executors.newCachedThreadPool()

        inline fun runAsync(crossinline execute: () -> Unit) = executor.execute { execute() }

    }

}